package com.example.adapters.repositories

import com.example.domain.entities.UserResponse

interface AuthRepository {
    suspend fun auth(): UserResponse
}

class AuthRepositoryImplementation: AuthRepository {
    override suspend fun auth(): UserResponse {
        return UserResponse(username="franquito", jwt="some-jwt")
    }
}