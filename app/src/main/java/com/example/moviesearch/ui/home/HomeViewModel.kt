package com.example.moviesearch.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moviesearch.data.Movie

class HomeViewModel : ViewModel() {

    val listMovies = MutableLiveData<ArrayList<Movie>>()

    fun getMovie() {
        listMovies.value = arrayListOf(
            Movie("Tor", "Fantasy"),
            Movie("Spider Man", "Action"),
            Movie("Classmates", "Comedy"),
            Movie("Raptor", "Horror")
        )
    }
}