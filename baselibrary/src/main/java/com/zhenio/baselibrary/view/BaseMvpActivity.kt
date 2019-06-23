package com.zhenio.baselibrary.view

import android.os.Bundle
import com.zhenio.baselibrary.common.KotApplication
import com.zhenio.baselibrary.injection.component.ActivityComponent
import com.zhenio.baselibrary.injection.component.DaggerActivityComponent
import com.zhenio.baselibrary.injection.module.ActivityModule
import com.zhenio.baselibrary.injection.module.LifecycleModule
import com.zhenio.baselibrary.presenter.BasePresenter
import com.zhenio.baselibrary.presenter.view.BaseView
import org.jetbrains.anko.toast
import javax.inject.Inject

abstract class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {

    @Inject
    lateinit var mPresenter: T
    //
    lateinit var activityComponent: ActivityComponent

    fun onBind(mPresenter: T){

    }

    override fun onStart() {
        super.onStart()
        mPresenter.onStart()
    }

    override fun showLoading() {
        toast("加载中～～")
    }

    override fun hideLoading() {

    }

    override fun showSouccess() {
        toast("加载中～～")
    }

    override fun showError() {
        toast("加载中～～")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initActivityInjecttion()
    }

    private fun initActivityInjecttion() {
        activityComponent = DaggerActivityComponent.builder()
            //添加了2个module
            .appComponent(
                (application as KotApplication).appComponent
            )
            .lifecycleModule(LifecycleModule(this))
            .activityModule(ActivityModule(this)).build()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        mPresenter.onSaveInstanceState(outState)

    }


    override fun onRestart() {
        super.onRestart()
        mPresenter.onRestart()

    }

    override fun onPause() {
        super.onPause()

    }

    override fun onResume() {
        super.onResume()

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onStop() {
        super.onStop()

    }

    override fun onDestroy() {
        super.onDestroy()
    }
}