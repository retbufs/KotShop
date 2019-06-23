package com.zhenio.baselibrary.presenter

import android.content.Context
import android.os.Bundle
import com.trello.rxlifecycle3.LifecycleProvider
import com.zhenio.baselibrary.presenter.view.BaseView
import com.zhenio.baselibrary.presenter.view.Lifecycle
import javax.inject.Inject


open class BasePresenter<T : BaseView> : Lifecycle {
    lateinit var mView: T
    //Dagger注入，Rx生命周期管理
    @Inject
    lateinit var lifecycleProvider: LifecycleProvider<*>

    @Inject
    lateinit var context:Context

    override fun onCreate(savedInstanceState: Bundle?) {

    }
    override fun onSaveInstanceState(outState: Bundle?) {

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {

    }

    override fun onStart() {

    }

    override fun onResume() {

    }

    override fun onRestart() {

    }

    override fun onPause() {

    }

    override fun onStop() {

    }

    override fun onDestroy() {

    }

}
