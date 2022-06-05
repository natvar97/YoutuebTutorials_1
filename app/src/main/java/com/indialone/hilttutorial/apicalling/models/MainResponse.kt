package com.indialone.hilttutorial.apicalling.models

data class MainResponse(
    var articles: List<Article>?,
    var status: String?,
    var totalResults: Int?
)