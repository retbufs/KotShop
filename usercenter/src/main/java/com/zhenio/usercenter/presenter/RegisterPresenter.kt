package com.zhenio.usercenter.presenter

import android.util.Log
import com.trello.rxlifecycle3.LifecycleProvider
import com.zhenio.baselibrary.ext.excute
import com.zhenio.baselibrary.presenter.BasePresenter
import com.zhenio.baselibrary.rx.BaseObserver
import com.zhenio.usercenter.service.UserService
import javax.inject.Inject

class RegisterPresenter @Inject constructor() : BasePresenter<RegisterView>() {
    @Inject
    lateinit var userService: UserService
    fun register(mobile: String, verifyCode: String, pwd: String) {
        userService.register(mobile, verifyCode, pwd)
            .excute(object : BaseObserver<Boolean>() {
                override fun onNext(t: Boolean) {
                    super.onNext(t)
                    Log.d("TAG", "service1")
                    mView.onRegisterResult(t)
                }
            }, lifecycleProvider)
    }
}



