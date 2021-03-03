# XLog

打日志，就很爽，

1. 非kotlin项目引入
```
api 'com.github.pichsy:xlog:1.0'
```
2. kotlin项目引入
```
api 'com.github.pichsy:xlog:1.1'
```

```
    XLog.setLogEnable(true)
    // or
    val conf = XLog.Config()
        .setLogEnable(true)
        .setDir(File(cacheDir, "xlog"))
        .setLog2FileEnable(true)
    XLog.init(conf)
    
    // 1.1 版本增加kotlin日志，日志关闭模式 {} 内的内容代码将不会执行，
    // 比Log.d()的更加优化，非日志状态代码直接不执行
    XLogKt.d{ 
    var a = 9
    a =  Math.min(a,10)
    "我是日志" 
    }
    
```





