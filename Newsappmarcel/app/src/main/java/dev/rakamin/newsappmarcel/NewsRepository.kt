package dev.rakamin.newsapp

import dev.rakamin.newsapp.models.NewsResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NewsRepository {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://newsapi.org/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val service = retrofit.create(NewsService::class.java)

    suspend fun getNews(): NewsResponse {
        return service.getTopHeadlines(apiKey = "YOUR_API_KEY")
    }
}
