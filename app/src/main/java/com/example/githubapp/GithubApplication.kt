package com.example.githubapp

import android.app.Application
import com.example.github.user.userModule
import com.example.githubapp.core.coreModules
import com.example.githubapp.home.homeModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class GithubApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@GithubApplication)
            modules(*coreModules, homeModule, userModule)
        }
    }
}