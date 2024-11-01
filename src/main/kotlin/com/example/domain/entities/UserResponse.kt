package com.example.domain.entities

data class UserResponse(
    val jwt: String,
    val username: String
)

data class User (
    val username: String,
    val password: String
)