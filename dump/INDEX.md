# probe dump

APK sha256: b2e61f7b3e3b1a1aa7766548016d0ab2db2035d002fa913fb3a547b33d376f3f
时间: 2026-11-13T16:16Z
dump 体积: 11M

## 目录
- dump/res：apktool 解码后的全部 XML 资源（布局 / values / drawable-xml / anim / menu / xml）
- dump/assets：解包出的 assets 原始文件（RN bundle、JSON、脚本等，>30M 的见 SKIPPED_OVER_30M.txt）
- dump/hermes：bundle 的真实字符串表；HBC 会尝试用 hbctool 反汇编成 .hasm
- dump/AndroidManifest.xml、dump/apktool.yml：解码清单与 apktool 元数据

## 统计
```
res          1027 files      6.0M
assets        304 files      4.4M
hermes          1 files      4.0K
```

## 布局文件（前 80）
```
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e004a.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e004b.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e004c.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e004d.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e004e.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e004f.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0050.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0051.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0052.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0053.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0054.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0055.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0056.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0057.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0058.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0059.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e005a.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e005b.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e005c.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e005d.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e005e.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e005f.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0060.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0061.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0062.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0063.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0064.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0065.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0066.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0067.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0068.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0069.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e006a.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e006b.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e006c.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e006d.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e006e.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e006f.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0070.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0071.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0072.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0073.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0074.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0075.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0076.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0077.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0078.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0079.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e007a.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e007b.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e007c.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e007d.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e007e.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e007f.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0080.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0081.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0082.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0083.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0084.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0085.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0086.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0087.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0088.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0089.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e008a.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e008b.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e008c.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e008d.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e008e.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e008f.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0090.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0091.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0092.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0093.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0094.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0095.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0096.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0097.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0098.xml
dump/res/layout-v31/APKTOOL_RENAMED_0x7f0e0099.xml
```

## assets 顶层清单
```
total 496
drwxr-xr-x 7 runner runner   4096 Nov 13 16:02 .
drwxr-xr-x 6 runner runner   4096 Nov 13 16:16 ..
-rw-r--r-- 1 runner runner 132737 Nov 13 16:02 PublicSuffixDatabase.list
-rw-r--r-- 1 runner runner      0 Nov 13 16:02 SKIPPED_OVER_30M.txt
-rw-r--r-- 1 runner runner 332304 Nov 13 16:02 cds_icon_symbols.ttf
drwxr-xr-x 3 runner runner   4096 Nov 13 16:02 com
drwxr-xr-x 3 runner runner   4096 Nov 13 16:02 composeResources
-rw-r--r-- 1 runner runner     36 Nov 13 16:02 datadog.buildId
drwxr-xr-x 2 runner runner   4096 Nov 13 16:02 dexopt
drwxr-xr-x 2 runner runner   4096 Nov 13 16:02 fonts
drwxr-xr-x 2 runner runner   4096 Nov 13 16:02 peghl
-rw-r--r-- 1 runner runner    133 Nov 13 16:02 sentry-debug-meta.properties
```
