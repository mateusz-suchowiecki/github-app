package com.example.githubapp.domain

import com.example.githubapp.domain.user.UserUseCase
import com.example.githubapp.domain.user.UserUseCaseImpl
import org.koin.dsl.module

val domainModule = module {
    single<UserUseCase> { UserUseCaseImpl(get()) }
}