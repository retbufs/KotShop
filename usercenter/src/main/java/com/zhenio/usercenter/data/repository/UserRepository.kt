package com.zhenio.usercenter.data.repository

import com.zhenio.baselibrary.data.http.net.RetrofitFactory
import com.zhenio.baselibrary.data.http.protocol.BaseResp
import com.zhenio.usercenter.data.api.UserApi
import com.zhenio.usercenter.data.protocol.RegisterReq
import io.reactivex.Observable
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun register(
        mobile: String,
        verifyCode: String,
        pwd: String
    ): Observable<BaseResp<String>> {
        return RetrofitFactory.instance.create(UserApi::class.java)
            .register(RegisterReq(mobile, verifyCode, pwd))
    }
}