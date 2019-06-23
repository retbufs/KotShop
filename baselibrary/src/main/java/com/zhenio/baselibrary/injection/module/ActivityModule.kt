package com.zhenio.baselibrary.injection.module

import android.app.Activity
import com.zhenio.baselibrary.injection.ActivityScope


import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity) {
    @ActivityScope
    @Provides
    fun providesActivity(): Activity {
        return this.activity
    }
}
