package com.example.moviesearch.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviesearch.data.Movie
import com.example.moviesearch.databinding.FragmentHomeBinding
import com.example.moviesearch.ui.home.adapter.MovieAdapter

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private val viewModel by viewModels<HomeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.listMovies.observe(viewLifecycleOwner) {
            setList(it)
        }
        viewModel.getMovie()
    }


    fun setList(list: ArrayList<Movie>) {
        binding.recyclerView.run {
            if (adapter == null) {
                adapter = MovieAdapter { id ->
                    findNavController().navigate(
                        HomeFragmentDirections.actionHomeFragmentToItemFragment(
                            id
                        )
                    )
                }
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            }
            (adapter as? MovieAdapter)?.setList(list)
        }

    }
}