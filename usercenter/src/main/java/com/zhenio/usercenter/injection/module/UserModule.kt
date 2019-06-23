package com.zhenio.usercenter.injection.module

import com.zhenio.usercenter.service.UserService
import com.zhenio.usercenter.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides


@Module
class UserModule{
    //一个类有多个实现时：可以通过named进行标注
    @Provides
    fun providesUserService(service: UserServiceImpl):UserService{
        return service
    }
}
