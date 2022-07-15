package com.example.moviesearch.repository

import com.example.moviesearch.data.Movie

class MovieRepository {

    suspend fun getMovie() =
        arrayListOf<Movie>(
            Movie("Tor", "Fantasy", "uhbiutvyivblbu"),
            Movie("Spider Man", "Action", "ihbjhbaskvbskvn"),
            Movie("Classmates", "Comedy", "vhbzjhbsvbaknva"),
            Movie("Raptor", "Horror", "kjcbJHACVCBSJCV")
        )
}