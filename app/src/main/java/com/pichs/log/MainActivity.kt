package com.pichs.log

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.pichs.xlog.XLog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * log
     */
    fun log(view: View) {
        XLog.v("1流动商贩拉是独立放假了")
        XLog.i("2流动商贩拉是独立放假了")
        XLog.d("3流动商贩拉%s是独立%s放假%s了","asa","sadfasf","dsfaasd")
        XLog.w("4流动商贩拉是独立放假了")
        XLog.e("5流动商贩拉是独立放假了")
        XLog.v(" safasf asdfasfas fdsf sa f")
        XLog.i(" safasf asdfasfas fdsf sa f")
        XLog.d(" safasf asdfasfas fdsf sa f")
        XLog.w(" safasf asdfasfas fdsf sa f")
        XLog.e(" safasf asdfasfas fdsf sa f")
    }





}