package com.zhenio.usercenter.presenter

import com.zhenio.baselibrary.presenter.view.BaseView

interface RegisterView:BaseView{
    fun onRegisterResult(t: Boolean)
}
