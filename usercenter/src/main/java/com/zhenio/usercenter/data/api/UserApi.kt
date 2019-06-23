package com.zhenio.usercenter.data.api

import com.zhenio.baselibrary.data.http.protocol.BaseResp
import com.zhenio.baselibrary.rx.BaseObserver
import com.zhenio.usercenter.data.protocol.RegisterReq
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi{
    @POST("userCenter/register")
    fun register(@Body req: RegisterReq):Observable<BaseResp<String>>
}
