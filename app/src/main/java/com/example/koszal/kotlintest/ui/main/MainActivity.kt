package com.example.koszal.kotlintest.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.koszal.kotlintest.R
import com.example.koszal.kotlintest.base.BaseActivity
import com.example.koszal.kotlintest.data.Api
import com.example.koszal.kotlintest.data.ApiProvider
import com.example.koszal.kotlintest.data.Something
import com.example.koszal.kotlintest.data.model.response.RepositoriesResponse
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import javax.inject.Inject

class MainActivity : BaseActivity(), MainMvpView {

    @Inject
    lateinit var presenter : MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityComponent.inject(this)

        setContentView(R.layout.activity_main)

        presenter.attachView(this)
        presenter.getSomething()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }

    override fun showStuff(repos: RepositoriesResponse) {
        Toast.makeText(this, "Size: " + repos.items?.size, Toast.LENGTH_SHORT).show()
    }

    override fun showError(e: Throwable) {
        Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
    }


}
