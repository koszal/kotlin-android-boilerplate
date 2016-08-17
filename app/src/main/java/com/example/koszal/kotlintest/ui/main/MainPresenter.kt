package com.example.koszal.kotlintest.ui.main

import com.example.koszal.kotlintest.base.BasePresenter
import com.example.koszal.kotlintest.data.Api
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by koszal on 14/08/16.
 */
class MainPresenter : BasePresenter<MainMvpView> {

    var mvpView : MainMvpView? = null

    @Inject
    lateinit var api : Api

    @Inject
    constructor() : super()

    override fun attachView(mvpView: MainMvpView) {
        this.mvpView = mvpView
    }

    override fun detachView() {
        this.mvpView = null
    }

    fun getSomething() {
        api.getSomething().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(
                { repositories -> mvpView?.showStuff(repositories) },
                { error -> mvpView?.showError(error) }
        )
    }

}