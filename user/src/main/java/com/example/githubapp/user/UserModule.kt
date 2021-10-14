package com.example.githubapp.user

import com.example.githubapp.user.profile.ProfileViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val userModule = module {
    viewModel { ProfileViewModel(get()) }
}