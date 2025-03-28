package dev.rakamin.newsapp.network

import dev.rakamin.newsapp.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {
    @GET("v2/top-headlines")
    fun getHeadlines(
        @Query("country") country: String = "id",
        @Query("apiKey") apiKey: String = "84d314754b284e9988d72cdfaccbc189"
    ): Call<NewsResponse>

    @GET("v2/everything")
    fun getAllNews(
        @Query("q") query: String,
        @Query("apiKey") apiKey: String = "84d314754b284e9988d72cdfaccbc189"
    ): Call<NewsResponse>
}
