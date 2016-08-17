package com.example.koszal.kotlintest.injection.module

import android.app.Activity
import android.content.Context
import com.example.koszal.kotlintest.injection.ActivityContext
import dagger.Module
import dagger.Provides

/**
 * Created by koszal on 14/08/16.
 */
@Module
class ActivityModule(private val activity : Activity) {

    @Provides
    fun provideActivity(): Activity {
        return activity
    }

    @Provides
    @ActivityContext
    fun provideActivityContext(): Context {
        return activity
    }

}