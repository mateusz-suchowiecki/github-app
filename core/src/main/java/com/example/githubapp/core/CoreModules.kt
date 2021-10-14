package com.example.githubapp.core

import com.example.githubapp.core.routing.Router
import com.example.githubapp.core.routing.RouterImpl
import com.example.githubapp.data.di.dataModule
import com.example.githubapp.domain.domainModule
import org.koin.dsl.module

private val routerModule = module {
    single<Router> { RouterImpl(get()) }
}

val coreModules = arrayOf(
        domainModule,
        dataModule,
        routerModule
)
