package com.example.koszal.kotlintest.data

import com.example.koszal.kotlintest.data.model.response.RepositoriesResponse
import retrofit2.http.GET
import rx.Observable

/**
 * Created by koszal on 14/08/16.
 */
interface Api {

    @GET("4rj1l")
    fun getSomething(): Observable<RepositoriesResponse>

}


// https://api.myjson.com/bins/51dwl
