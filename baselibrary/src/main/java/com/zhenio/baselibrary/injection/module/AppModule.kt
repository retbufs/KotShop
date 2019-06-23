package com.zhenio.baselibrary.injection.module

import android.content.Context
import com.zhenio.baselibrary.common.KotApplication

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val context: KotApplication) {

    @Singleton
    @Provides
    fun providesContext(): Context {
        return this.context
    }
}
