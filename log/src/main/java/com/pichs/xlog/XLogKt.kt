package com.pichs.xlog

object XLogKt {

    fun d(message: () -> String?) {
        if (XLog.isLogEnable()) {
            message()?.let {
                XLog.d(it)
            }
        }
    }


    fun e(message: () -> String?) {
        if (XLog.isLogEnable()) {
            message()?.let {
                XLog.e(it)
            }
        }
    }

    fun i(message: () -> String?) {
        if (XLog.isLogEnable()) {
            message()?.let {
                XLog.i(it)
            }
        }
    }

    fun v(message: () -> String?) {
        if (XLog.isLogEnable()) {
            message()?.let {
                XLog.v(it)
            }
        }
    }

    fun w(message: () -> String?) {
        if (XLog.isLogEnable()) {
            message()?.let {
                XLog.w(it)
            }
        }
    }

}