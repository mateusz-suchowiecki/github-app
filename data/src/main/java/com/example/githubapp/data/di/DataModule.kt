package com.example.githubapp.data.di

import com.example.githubapp.data.user.UserApi
import com.example.githubapp.data.user.UserRepositoryImpl
import com.example.githubapp.domain.user.UserRepository
import org.koin.dsl.module

val dataModule = module {
    single { httpClient }
    single { UserApi(get()) }
    single<UserRepository> { UserRepositoryImpl(get()) }
}