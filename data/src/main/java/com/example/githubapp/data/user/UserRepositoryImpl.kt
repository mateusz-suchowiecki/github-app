package com.example.githubapp.data.user

import com.example.githubapp.domain.user.User
import com.example.githubapp.domain.user.UserDetails
import com.example.githubapp.domain.user.UserRepository

internal class UserRepositoryImpl(
        private val userApi: UserApi
) : UserRepository {

    override suspend fun searchUser(phrase: String): List<User> {
        return userApi.searchUser(phrase).items
    }

    override suspend fun getUserDetails(login: String): UserDetails {
        return userApi.getUserDetails(login)
    }
}