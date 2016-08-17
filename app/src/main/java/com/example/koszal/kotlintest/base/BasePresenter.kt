package com.example.koszal.kotlintest.base

/**
 * Created by koszal on 14/08/16.
 */
open interface BasePresenter<in V : BaseMvpView> {

    fun attachView(mvpView : V)

    fun detachView()

}