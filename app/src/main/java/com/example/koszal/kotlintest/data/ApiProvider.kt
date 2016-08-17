package com.example.koszal.kotlintest.data

import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by koszal on 14/08/16.
 */
class ApiProvider {

    fun api() : Api {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://api.myjson.com/bins/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()
        return retrofit.create(Api::class.java)
    }

}