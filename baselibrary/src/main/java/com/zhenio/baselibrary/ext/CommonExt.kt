package com.zhenio.baselibrary.ext

import com.trello.rxlifecycle3.LifecycleProvider
import com.trello.rxlifecycle3.kotlin.bindToLifecycle
import com.zhenio.baselibrary.rx.BaseObserver
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

//扩展Rxjava返回类
fun <T> Observable<T>.excute(schedulers: BaseObserver<T>,provider: LifecycleProvider<*>): Unit {
    this.observeOn(AndroidSchedulers.mainThread())
        .bindToLifecycle(provider)
        .subscribeOn(Schedulers.io())
        .subscribe(schedulers)
}