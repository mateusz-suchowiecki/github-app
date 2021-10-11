package com.example.github.user

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val userModule = module {
    viewModel { ProfileViewModel() }
}