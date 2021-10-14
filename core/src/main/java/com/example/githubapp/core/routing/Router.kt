package com.example.githubapp.core.routing

import com.example.githubapp.domain.user.User

interface Router {
    fun toProfile(user: User)
}