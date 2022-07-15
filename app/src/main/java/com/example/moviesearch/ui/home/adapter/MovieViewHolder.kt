package com.example.moviesearch.ui.home.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.moviesearch.data.Movie
import com.example.moviesearch.databinding.ItemMovieBinding

class MovieViewHolder(
    private val binding: ItemMovieBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Movie) {
        binding.title.text = item.title
        binding.genre.text = item.genre
        binding.description.text = item.description
    }
}