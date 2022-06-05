package com.indialone.hilttutorial.apicalling.api

import com.indialone.hilttutorial.apicalling.models.MainResponse
import com.indialone.hilttutorial.apicalling.utils.ApiConstants
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(ApiConstants.END_POINT_TOP_HEADLINES)
    suspend fun getNewsBySources(
        @Query(ApiConstants.QUERY_SOURCES) sources: String,
        @Query(ApiConstants.QUERY_API) apiKey: String
    ) : MainResponse

}