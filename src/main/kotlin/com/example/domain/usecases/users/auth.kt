package com.example.domain.usecases.users

import com.example.adapters.repositories.AuthRepositoryImplementation
import com.example.domain.entities.UserResponse

class AuthUseCase(private val authRepository: AuthRepositoryImplementation) {
    suspend fun authUser(): UserResponse {
        return authRepository.auth()
    }
}