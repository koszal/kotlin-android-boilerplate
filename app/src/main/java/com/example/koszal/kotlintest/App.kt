package com.example.koszal.kotlintest

import android.app.Application
import com.example.koszal.kotlintest.injection.component.ApplicationComponent
import com.example.koszal.kotlintest.injection.component.DaggerApplicationComponent
import com.example.koszal.kotlintest.injection.module.ApplicationModule

/**
 * Created by koszal on 14/08/16.
 */
class App : Application() {

    var applicationComponent: ApplicationComponent? = null

    override fun onCreate() {
        super.onCreate()
        applicationComponent.
    }

    fun getComponent() : ApplicationComponent
            = applicationComponent
            ?: DaggerApplicationComponent.builder().applicationModule(ApplicationModule(this)).build()

    fun setComponent(component: ApplicationComponent) {
        applicationComponent = component
    }

}