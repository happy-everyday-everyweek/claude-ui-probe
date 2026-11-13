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
    # 有些镜像发的是 XAPK/APKS（zip 里放 base.apk），apktool 认不出，先拆出真正的 APK。
    if ! unzip -l "$OUT" 2>/dev/null | grep -q 'AndroidManifest.xml'; then
      rm -rf xapk_tmp && mkdir -p xapk_tmp
      unzip -o -q "$OUT" -d xapk_tmp 2>/dev/null || true
      if [ -f xapk_tmp/base.apk ]; then
        mv xapk_tmp/base.apk "$OUT"
        echo "[note] 从 XAPK 里取出 base.apk"
      fi
    fi
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

echo "== 1m malavida"
mvpage=$(mktemp)
curl -sSL -A "$UA" -H 'Accept-Language: es-ES,es;q=0.9' -c ck.txt -b ck.txt \
  --max-time 60 -o "$mvpage" "https://www.malavida.com/es/soft/claude/android/descargar" || true
echo " page bytes=$(stat -c %s "$mvpage" 2>/dev/null || echo 0)"
mvurl=$(grep -oE 'https://dw\.malavida\.com/[^"'"'"' <>]+' "$mvpage" | head -1)
echo " url=${mvurl:0:90}"
if [ -n "$mvurl" ]; then
  code=$(curl -sSL -A "$UA" -e "https://www.malavida.com/es/soft/claude/android/descargar" \
    -c ck.txt -b ck.txt --max-time 900 -o "$OUT" -w '%{http_code}' "$mvurl" || echo 000)
  echo " dl http=$code"
  save malavida && exit 0
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

echo "== 5 apkpure api"
api_json=$(curl -sSL --max-time 60 \
  -H 'Ual-Access-Businessid: projecta' \
  -H 'User-Agent: APKPure/3.19.9 (Aegon)' \
  "https://api.pureapk.com/m/v3/cms/app_version?hl=en&package_name=com.anthropic.claude" || true)
echo " api bytes=${#api_json} head=$(printf '%s' "$api_json" | head -c 120)"
dl=$(printf '%s' "$api_json" | grep -oE '"download_url":"[^"]+"' | head -1 | sed 's/"download_url":"//;s/"$//' | sed 's#\\/#/#g')
echo " download_url=${dl:-none}"
if [ -n "$dl" ]; then
  code=$(curl -sSL --max-time 600 \
    -H 'Ual-Access-Businessid: projecta' \
    -H 'User-Agent: APKPure/3.19.9 (Aegon)' \
    -e "https://apkpure.com/" \
    -o "$OUT" -w '%{http_code}' "$dl" || echo 000)
  echo " dl http=$code"
  save "apkpure api" && exit 0
fi

echo "== 6 aptoide"
aj=$(curl -sSL --max-time 60 "https://ws75.aptoide.com/api/7/app/getMeta?package_name=com.anthropic.claude" || true)
echo " bytes=${#aj} head=$(printf '%s' "$aj" | head -c 120)"
apath=$(printf '%s' "$aj" | grep -oE '"path":"[^"]+\.apk"' | head -1 | sed 's/"path":"//;s/"$//' | sed 's#\\/#/#g')
echo " path=${apath:-none}"
if [ -n "$apath" ]; then
  code=$(curl -sSL --max-time 900 -o "$OUT" -w '%{http_code}' "$apath" || echo 000)
  echo " dl http=$code"
  save aptoide && exit 0
fi

echo "全部来源失败"
exit 1
