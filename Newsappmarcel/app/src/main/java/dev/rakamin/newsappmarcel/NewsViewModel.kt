package dev.rakamin.newsapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.rakamin.newsapp.models.Article
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {
    private val repository = NewsRepository()

    private val _news = MutableStateFlow<List<Article>>(emptyList())
    val news = _news.asStateFlow()

    fun fetchNews() {
        viewModelScope.launch {
            val response = repository.getNews()
            _news.value = response.articles
        }
    }
}
