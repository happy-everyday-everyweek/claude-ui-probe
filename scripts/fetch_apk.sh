#!/usr/bin/env bash
# 取 Claude 的 Android 安装包，成功时留在 $1。
#
# 各镜像对 CI 的封锁程度不同，这个脚本按顺序试，并打印每一步的可见证据
# （HTTP 码、页面字节数、解析到的链接），失败时能直接看出卡在哪一环。

OUT="${1:-claude.apk}"
UA="Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0 Mobile Safari/537.36"
GOOD=0

ok() { [ -f "$OUT" ] && [ "$(stat -c %s "$OUT")" -gt 20000000 ] && [ "$(head -c 2 "$OUT")" = "PK" ]; }

save() {
  if ok; then
    echo "[ok] $1 ($(stat -c %s "$OUT") bytes)"
    GOOD=1
    return 0
  fi
  echo "[miss] $1 ($(stat -c %s "$OUT" 2>/dev/null || echo 0) bytes)"
  rm -f "$OUT"
  return 1
}

echo "== 0 手动直链"
if [ -n "${APK_URL:-}" ]; then
  curl -sSL -A "$UA" --max-time 600 -o "$OUT" "$APK_URL" || true
  save "APK_URL" && exit 0
fi

echo "== 1 apkeep (apk-pure)"
apkeep -a com.anthropic.claude -d apk-pure -o acknowledge_dangers=true . 2>&1 | tail -3 || true
found=$(ls ./*.apk 2>/dev/null | head -1)
if [ -n "$found" ]; then mv "$found" "$OUT"; save apkeep && exit 0; fi

echo "== 2 uptodown"
page=$(mktemp)
curl -sSL -A "$UA" -H 'Accept-Language: en-US,en;q=0.9' -c ck.txt -b ck.txt \
  --max-time 60 -o "$page" "https://claude.en.uptodown.com/android/download" || true
echo " page bytes=$(stat -c %s "$page" 2>/dev/null || echo 0) dwn=$(grep -c dwn "$page" 2>/dev/null || echo 0) dataurl=$(grep -c 'data-url' "$page" 2>/dev/null || echo 0)"
# 存一份原始页面，方便下一轮按真实结构写解析。
mkdir -p ../debug && cp "$page" ../debug/uptodown-download.html 2>/dev/null || true
grep -oE '(https?:)?//dw\.uptodown\.com/dwn/[^"'"'"' <]+' "$page" | head -3 || true
dataurl=$(grep -oE 'data-url="[^"]+"' "$page" | head -1 | sed 's/data-url="//;s/"$//')
echo " data-url=${dataurl:-none}"
resp=$(curl -sSL -A "$UA" -H 'X-Requested-With: XMLHttpRequest' \
  -e "https://claude.en.uptodown.com/android" -c ck.txt -b ck.txt \
  --max-time 60 -X POST "https://claude.en.uptodown.com/android/download" || true)
echo " post bytes=${#resp} head=$(printf '%s' "$resp" | head -c 160)"
posturl=$(printf '%s' "$resp" | grep -oE 'https://[^"]*(dwn|\.apk)[^"]*' | head -1)
echo " post url=${posturl:-none}"
for u in "$dataurl" "$posturl"; do
  [ -n "$u" ] || continue
  case "$u" in //*) u="https:$u" ;; esac
  curl -sSL -A "$UA" -e "https://claude.en.uptodown.com/" -c ck.txt -b ck.txt --max-time 900 -o "$OUT" "$u" || true
  save "uptodown $u" && exit 0
done

echo "== 3 apkcombo"
page2=$(mktemp)
code=$(curl -sSL -A "$UA" --max-time 60 -o "$page2" -w '%{http_code}' "https://apkcombo.com/claude/com.anthropic.claude/" || echo 000)
echo " page http=$code bytes=$(stat -c %s "$page2" 2>/dev/null || echo 0)"
cblink=$(grep -oE 'https://download\.apkcombo\.com[^"'"'"' ]+' "$page2" | head -1)
echo " link=${cblink:-none}"
if [ -n "$cblink" ]; then
  curl -sSL -A "$UA" -e "https://apkcombo.com/" --max-time 900 -o "$OUT" "$cblink" || true
  save apkcombo && exit 0
fi

echo "== 4 apkpure 直连端点"
for u in \
  "https://d.apkpure.com/b/APK/com.anthropic.claude?version=latest" \
  "https://d.apkpure.net/b/APK/com.anthropic.claude?version=latest"; do
  code=$(curl -sSL -A "$UA" -o "$OUT" -w '%{http_code}' --max-time 300 "$u" || echo 000)
  echo " $u http=$code"
  save "apkpure $u" && exit 0
done

echo "全部来源失败"
exit 1
