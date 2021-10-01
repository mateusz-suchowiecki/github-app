package com.example.githubapp.domain.user

interface UserRepository {

    suspend fun searchUser(phrase: String): List<User>
}