package com.example.githubapp.user

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules

class UserActivity : AppCompatActivity(R.layout.user_activity) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        loadKoinModules(userModule)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.user_nav_host) as NavHostFragment
        navHostFragment.navController.setGraph(R.navigation.user_nav_graph, intent.extras)
    }

    override fun onDestroy() {
        unloadKoinModules(userModule)
        super.onDestroy()
    }
}