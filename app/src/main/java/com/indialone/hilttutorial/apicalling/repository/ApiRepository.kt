package com.indialone.hilttutorial.apicalling.repository

import com.indialone.hilttutorial.apicalling.api.RetrofitBuilder
import com.indialone.hilttutorial.apicalling.utils.ApiConstants

class ApiRepository {

    suspend fun getNewsBySources() = RetrofitBuilder.getApiService().getNewsBySources(
        sources = ApiConstants.VALUE_SOURCES,
        apiKey = ApiConstants.VALUE_API_KEY
    )

}