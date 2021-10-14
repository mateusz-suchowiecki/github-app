package com.example.githubapp.data.user

import com.example.githubapp.domain.user.UserDetails
import io.ktor.client.*
import io.ktor.client.request.*

internal class UserApi(
        private val client: HttpClient
) {

    suspend fun searchUser(phrase: String): UsersResponse = client.get("search/users?q=$phrase")

    suspend fun getUserDetails(login: String): UserDetails = client.get("users/$login")
}