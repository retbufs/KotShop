package com.zhenio.baselibrary.presenter.view

import com.zhenio.baselibrary.presenter.BasePresenter

interface BaseView:Lifecycle{
    fun showLoading()
    fun hideLoading()
    fun showSouccess()
    fun showError()

}