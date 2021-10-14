package com.example.githubapp.core.routing

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.githubapp.domain.user.User

internal class RouterImpl(
        private val context: Context
) : Router {

    override fun toProfile(user: User) = startModule(USER_MODULE, Bundle().apply { putSerializable("user", user) })

    private fun startModule(moduleClass: String, bundle: Bundle? = null) {
        try {
            val intent = Intent(context, Class.forName(moduleClass)).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                bundle?.let { putExtras(it) }
            }
            ContextCompat.startActivity(context, intent, null)
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        }
    }

    companion object {
        private const val USER_MODULE = "com.example.githubapp.user.UserActivity"
    }
}