package com.example.koszal.kotlintest.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by koszal on 15/08/16.
 */
open class Repository {

    var id: Int = 0

    var name: String = ""

    @SerializedName("full_name")
    var fullName: String = ""

    var description: String = ""

}