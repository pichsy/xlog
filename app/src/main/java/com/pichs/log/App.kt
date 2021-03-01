package com.pichs.log

import android.app.Application
import com.pichs.xlog.XLog
import java.io.File

/**
 * @Description:
 * @Author: 吴波
 * @CreateDate: 3/1/21 11:50 AM
 * @UpdateUser: 吴波
 * @UpdateDate: 3/1/21 11:50 AM
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        XLog.setLogEnable(true)

        // or

        val conf = XLog.Config()
            .setLogEnable(true)
            .setDir(File(cacheDir, "xlog"))
            .setLog2FileEnable(true)
        XLog.init(conf)
    }
}