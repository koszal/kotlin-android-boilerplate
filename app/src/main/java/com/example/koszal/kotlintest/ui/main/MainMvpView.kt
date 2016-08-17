package com.example.koszal.kotlintest.ui.main

import com.example.koszal.kotlintest.base.BaseMvpView
import com.example.koszal.kotlintest.data.model.response.RepositoriesResponse

/**
 * Created by koszal on 14/08/16.
 */
interface MainMvpView : BaseMvpView {

    fun showStuff(repositories: RepositoriesResponse)

    fun showError(e: Throwable)

}