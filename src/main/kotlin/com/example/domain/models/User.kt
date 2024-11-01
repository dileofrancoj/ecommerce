package com.example.domain.models

import kotlinx.serialization.Serializable

@Serializable

data class User(
    val id: Int,
    val username: String,
    val password: String,
    val profilePicture: String,
    val name: String,
    val lastname: String
)