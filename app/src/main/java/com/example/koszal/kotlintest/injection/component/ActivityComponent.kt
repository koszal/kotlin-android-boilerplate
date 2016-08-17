package com.example.koszal.kotlintest.injection.component

import com.example.koszal.kotlintest.ui.main.MainActivity
import com.example.koszal.kotlintest.injection.PerActivity
import com.example.koszal.kotlintest.injection.module.ActivityModule
import dagger.Component

/**
 * Created by koszal on 14/08/16.
 */
@PerActivity
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(activity: MainActivity)

}