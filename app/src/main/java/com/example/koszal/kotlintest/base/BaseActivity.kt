package com.example.koszal.kotlintest.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.koszal.kotlintest.App
import com.example.koszal.kotlintest.injection.component.ActivityComponent
import com.example.koszal.kotlintest.injection.component.DaggerActivityComponent

/**
 * Created by koszal on 14/08/16.
 */
open class BaseActivity : AppCompatActivity() {

    lateinit var activityComponent : ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getComponent()
    }

    fun getComponent() {
        activityComponent = DaggerActivityComponent
                .builder()
                .applicationComponent((application as App).getComponent())
                .build()
    }

}