package com.example.githubapp.data.user

import io.ktor.client.*
import io.ktor.client.request.*

internal class UserApi(
        private val client: HttpClient
) {

    suspend fun searchUser(phrase: String): UsersResponse = client.get("search/users?q=$phrase")
}