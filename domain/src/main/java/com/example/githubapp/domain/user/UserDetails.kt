package com.example.githubapp.domain.user

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class UserDetails(
        @SerialName("id")
        val id: Long,
        @SerialName("login")
        val login: String,
        @SerialName("avatar_url")
        val avatar: String?,
        @SerialName("name")
        val name: String?,
        @SerialName("company")
        val company: String?,
        val blog: String?,
        val location: String?,
        val email: String?,
        val bio: String?,
        val publicRepoCount: Int,
        val followerCount: Int,
        val followingCount: Int,
)