package com.zhenio.usercenter.ui.activity

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.zhenio.baselibrary.injection.component.ActivityComponent
import com.zhenio.baselibrary.injection.component.AppComponent
import com.zhenio.baselibrary.injection.module.ActivityModule
import com.zhenio.baselibrary.view.BaseMvpActivity
import com.zhenio.usercenter.R
import com.zhenio.usercenter.injection.component.DaggerUserComponent
import com.zhenio.usercenter.injection.module.UserModule
import com.zhenio.usercenter.presenter.RegisterPresenter
import com.zhenio.usercenter.presenter.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {

    override fun onRegisterResult(t: Boolean) {
        if (t) {
            Toast.makeText(this, "登入成功", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "登入失败", Toast.LENGTH_SHORT).show()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initInjection()
        mPresenter.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        findViewById<Button>(R.id.id_register_submit).setOnClickListener {
            val mobile = id_ed_reg_account.text.toString()
            if (mobile.isEmpty()) {
                toast("手机号不能为空")
                return@setOnClickListener
            }
            val vercode = id_ed_code.text.toString()
            if (vercode.isEmpty()) {
                toast("验证码未填写")
                return@setOnClickListener
            }
            val password = id_ed_pass.text.toString()

            if (password.isEmpty()) {
                toast("密码未填写")
                return@setOnClickListener
            }
            mPresenter.register(mobile, vercode, password)
        }
    }

    private fun initInjection() {
        DaggerUserComponent.builder()
            .activityComponent(activityComponent)
            .userModule(UserModule())
            .build()
            .inject(this)
        mPresenter.mView = this
    }

}
