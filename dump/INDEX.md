# probe dump

APK sha256: b2e61f7b3e3b1a1aa7766548016d0ab2db2035d002fa913fb3a547b33d376f3f
时间: 2026-11-13T15:50Z
dump 体积: 24K

## 目录
- dump/res：apktool 解码后的全部 XML 资源（布局 / values / drawable-xml / anim / menu / xml）
- dump/assets：解包出的 assets 原始文件（RN bundle、JSON、脚本等，>30M 的见 SKIPPED_OVER_30M.txt）
- dump/hermes：bundle 的真实字符串表；HBC 会尝试用 hbctool 反汇编成 .hasm
- dump/AndroidManifest.xml、dump/apktool.yml：解码清单与 apktool 元数据

## 统计
```
res             0 files      4.0K
assets          0 files      4.0K
hermes          1 files      4.0K
```

## 布局文件（前 80）
```
```

## assets 顶层清单
```
total 8
drwxr-xr-x 2 runner runner 4096 Nov 13 15:50 .
drwxr-xr-x 5 runner runner 4096 Nov 13 15:50 ..
```
