package com.zhenio.baselibrary.injection.module


import com.trello.rxlifecycle3.LifecycleProvider
import com.zhenio.baselibrary.injection.ActivityScope
import com.zhenio.baselibrary.injection.Before
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class LifecycleModule(private val lifecycleProvider: LifecycleProvider<*>) {
    @Provides
    fun providesLifecycle(): LifecycleProvider<*> {
        return this.lifecycleProvider
    }
}
