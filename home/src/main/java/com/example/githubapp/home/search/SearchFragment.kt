package com.example.githubapp.home.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import com.example.githubapp.home.databinding.SearchFragmentBinding
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class SearchFragment : Fragment() {

    private val adapter: SearchAdapter by inject()
    private val viewModel: SearchViewModel by viewModel()
    private lateinit var binding: SearchFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = SearchFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
        setupViewModel()
    }

    private fun setupView() = binding.run {
        searchField.addTextChangedListener { viewModel.searchTextChanged(it.toString()) }
        recyclerView.adapter = adapter
    }

    private fun setupViewModel() = viewModel.run {
        userData.observe(viewLifecycleOwner) {
            adapter.users = it
            adapter.notifyDataSetChanged()
        }
    }

}