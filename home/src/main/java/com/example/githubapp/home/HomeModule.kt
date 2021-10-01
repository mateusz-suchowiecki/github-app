package com.example.githubapp.home

import com.example.githubapp.home.search.SearchViewModel
import org.koin.dsl.module

val homeModule = module {
    single { SearchViewModel(get()) }
}