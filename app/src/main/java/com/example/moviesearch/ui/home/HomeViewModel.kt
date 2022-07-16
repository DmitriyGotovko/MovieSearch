package com.example.moviesearch.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviesearch.data.Movie
import com.example.moviesearch.repository.MovieRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    val listMovies = MutableLiveData<ArrayList<Movie>>()

    private val repository = MovieRepository()

//    lateinit var onLoading: (isLoading: Boolean) -> Unit

    fun getMovie() {
        viewModelScope.launch(Dispatchers.IO) {
//            onLoading(true)
//            delay(5000)
            listMovies.postValue(repository.getMovie())
//            onLoading(false)
        }

    }
}