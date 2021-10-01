package com.example.githubapp.data.user

import com.example.githubapp.domain.user.User
import io.ktor.client.*
import io.ktor.client.request.*

internal class UserApi(
        private val client: HttpClient
) {

    suspend fun searchUser(phrase: String): List<User> = client.get("search/users?q=$phrase")
}