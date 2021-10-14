package com.example.githubapp.domain.user

internal class UserUseCaseImpl(
        private val userRepository: UserRepository
) : UserUseCase {

    override suspend fun searchUser(phrase: String): List<User> {
        return userRepository.searchUser(phrase)
    }

    override suspend fun getUserDetails(login: String): UserDetails {
        return userRepository.getUserDetails(login)
    }
}