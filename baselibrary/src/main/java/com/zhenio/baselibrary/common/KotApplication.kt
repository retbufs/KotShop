package com.zhenio.baselibrary.common

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import com.zhenio.baselibrary.injection.component.AppComponent
import com.zhenio.baselibrary.injection.component.DaggerAppComponent
import com.zhenio.baselibrary.injection.module.AppModule

class KotApplication : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        context = this
        initAppInject()
    }

    //注册dagger2
    private fun initAppInject() {
        appComponent =
            DaggerAppComponent.builder()
                .appModule(AppModule(this)).build()
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        //解决65535方法限制
        MultiDex.install(this)
    }

    /*
    全局伴生对象
 */
    companion object {
        lateinit var context: Context
    }
}
