package com.example.githubapp.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules

class HomeActivity : AppCompatActivity(R.layout.home_activity) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadKoinModules(homeModule)
    }

    override fun onDestroy() {
        unloadKoinModules(homeModule)
        super.onDestroy()
    }
}