# XLog

打日志，就很爽，


```
    XLog.setLogEnable(true)
    // or
    val conf = XLog.Config()
        .setLogEnable(true)
        .setDir(File(cacheDir, "xlog"))
        .setLog2FileEnable(true)
    XLog.init(conf)
```





