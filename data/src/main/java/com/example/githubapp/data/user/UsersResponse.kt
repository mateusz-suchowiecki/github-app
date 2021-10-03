package com.example.githubapp.data.user

import com.example.githubapp.domain.user.User
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UsersResponse(
        @SerialName("total_count")
        val count: Int,
        val items: List<User>,
)