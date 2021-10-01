package com.example.githubapp.domain.user

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
        @SerialName("id")
        val id: Long,
//        val login: String,
//        val avatar: String,
//        val name: String,
//        val company: String?,
//        val blog: String?,
//        val location: String?,
//        val email: String?,
//        val bio: String?,
//        val publicRepoCount: Int,
//        val followerCount: Int,
//        val followingCount: Int,
//        val createdAt: Date,
//        val updatedAt: Date,
)