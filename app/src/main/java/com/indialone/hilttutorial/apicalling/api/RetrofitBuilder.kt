package com.indialone.hilttutorial.apicalling.api

import com.indialone.hilttutorial.apicalling.utils.ApiConstants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitBuilder {

    private val retrofitInstance = Retrofit.Builder()
        .baseUrl(ApiConstants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    fun getApiService(): ApiService {
        return retrofitInstance.create(ApiService::class.java)
    }

}