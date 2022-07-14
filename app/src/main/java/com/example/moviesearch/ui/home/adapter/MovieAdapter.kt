package com.example.moviesearch.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesearch.data.Movie
import com.example.moviesearch.databinding.ItemMovieBinding

class MovieAdapter(
    private val onClick: (id: String) -> Unit
) : RecyclerView.Adapter<MovieViewHolder>() {

    private var list = arrayListOf<Movie>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            ItemMovieBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        list[position].let { movie ->
            holder.bind(movie)
            holder.itemView.setOnClickListener {
                onClick(movie.title)
            }
        }
    }

    override fun getItemCount() = list.size
    fun setList(list: ArrayList<Movie>) {
        this.list = list
        notifyDataSetChanged()
    }
}