package com.example.koszal.kotlintest.injection.module

import android.app.Application
import android.content.Context
import com.example.koszal.kotlintest.data.Api
import com.example.koszal.kotlintest.data.ApiProvider
import com.example.koszal.kotlintest.injection.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by koszal on 14/08/16.
 */
@Module
class ApplicationModule(private val application: Application) {

    @Provides
    fun provideApplication(): Application {
        return application
    }

    @Provides
    @ApplicationContext
    fun provideApplicationContext(): Context {
        return application
    }

    @Provides
    @Singleton
    fun provideApi(): Api {
        return ApiProvider().api()
    }

}