package com.zhenio.usercenter.service.impl


import com.zhenio.baselibrary.data.http.protocol.BaseResp
import com.zhenio.baselibrary.rx.BaseException
import com.zhenio.usercenter.data.repository.UserRepository
import com.zhenio.usercenter.service.UserService
import io.reactivex.Observable
import io.reactivex.functions.Function
import javax.inject.Inject

class UserServiceImpl @Inject constructor() : UserService {
    @Inject
    lateinit var repository:UserRepository

    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        return repository.register(mobile, verifyCode, pwd)
            .flatMap(object : Function<BaseResp<String>, Observable<Boolean>> {
                override fun apply(t: BaseResp<String>): Observable<Boolean> {
                    if (t.status != 0) {
                        return Observable.error(BaseException(t.status,t.message))
                    }
                    return Observable.just(true)
                }
            })
    }

}


//    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> mapper) {
//        return flatMap(mapper, false);
//    }