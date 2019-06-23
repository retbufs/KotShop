package com.zhenio.usercenter.injection.component

import com.zhenio.baselibrary.injection.ActivityScope
import com.zhenio.baselibrary.injection.Before
import com.zhenio.baselibrary.injection.component.ActivityComponent
import com.zhenio.usercenter.injection.module.UserModule
import com.zhenio.usercenter.ui.activity.RegisterActivity
import dagger.Component

@Before
@Component(dependencies = [ActivityComponent::class],modules = [UserModule::class])
interface UserComponent {
    fun inject(activity: RegisterActivity)
}
