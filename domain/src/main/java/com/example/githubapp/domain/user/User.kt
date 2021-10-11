package com.example.githubapp.domain.user

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
        @SerialName("id")
        val id: Long,
        @SerialName("login")
        val login: String,
        @SerialName("avatar_url")
        val avatar: String,
) : java.io.Serializable