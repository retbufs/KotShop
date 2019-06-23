package com.zhenio.usercenter.ui.activity

import com.zhenio.baselibrary.view.BaseMvpActivity
import com.zhenio.usercenter.presenter.LoginPrensenter
import com.zhenio.usercenter.presenter.LoginView

class LoginActivity : BaseMvpActivity<LoginPrensenter>(), LoginView {

    override fun onLoginResult() {

    }

    override fun onLoginError(status: Int, msg: String) {

    }
}
