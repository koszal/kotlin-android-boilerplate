package com.example.koszal.kotlintest.injection.component

import android.app.Application
import android.content.Context
import com.example.koszal.kotlintest.data.Api
import com.example.koszal.kotlintest.injection.ApplicationContext
import com.example.koszal.kotlintest.injection.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by koszal on 14/08/16.
 */
@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    @ApplicationContext
    fun context(): Context

    fun application(): Application

    fun api(): Api

}