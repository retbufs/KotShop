package com.zhenio.usercenter.presenter

import com.zhenio.baselibrary.presenter.view.BaseView

interface LoginView : BaseView {
    fun  onLoginResult()
    fun  onLoginError(status:Int,msg:String)
}
