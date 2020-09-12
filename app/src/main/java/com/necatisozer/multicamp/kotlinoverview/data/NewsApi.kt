package com.necatisozer.multicamp.kotlinoverview.data

import com.necatisozer.multicamp.kotlinoverview.data.model.ArticlesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String,
    ): ArticlesResponse

}