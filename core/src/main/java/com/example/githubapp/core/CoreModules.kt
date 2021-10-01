package com.example.githubapp.core

import com.example.githubapp.data.di.dataModule
import com.example.githubapp.domain.domainModule

val coreModules = arrayOf(
        domainModule,
        dataModule
)
