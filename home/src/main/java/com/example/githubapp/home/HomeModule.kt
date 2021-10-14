package com.example.githubapp.home

import com.example.githubapp.home.search.SearchAdapter
import com.example.githubapp.home.search.SearchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeModule = module {
    viewModel { SearchViewModel(get(), get()) }
    factory { SearchAdapter() }
}