package com.example.githubapp.domain.user

interface UserUseCase {

    suspend fun searchUser(phrase: String): List<User>
    suspend fun getUserDetails(login: String): UserDetails
}