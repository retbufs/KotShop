package com.zhenio.baselibrary.injection.component

import android.app.Activity
import android.content.Context
import com.trello.rxlifecycle3.LifecycleProvider
import com.zhenio.baselibrary.injection.ActivityScope
import com.zhenio.baselibrary.injection.module.ActivityModule
import com.zhenio.baselibrary.injection.module.LifecycleModule
import dagger.Component


@ActivityScope
@Component(dependencies = [AppComponent::class],
    modules = [ActivityModule::class, LifecycleModule::class]
)
interface ActivityComponent {
    fun activity(): Activity
    fun context(): Context
    //需要在component中显示暴露出来
    fun lifecycleProvider(): LifecycleProvider<*>

}
