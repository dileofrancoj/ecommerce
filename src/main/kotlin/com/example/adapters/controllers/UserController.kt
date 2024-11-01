package com.example.adapters.controllers

import com.example.adapters.dtos.Response
import com.example.domain.entities.UserResponse
import com.example.domain.usecases.users.AuthUseCase

interface UserControllerProps {
    suspend fun authenticate(username: String, password: String): Response<UserResponse>
    suspend fun refreshToken(jwt: String): Response<UserResponse>
}

class UserController(private val authUseCase: AuthUseCase): UserControllerProps {
    override  suspend fun authenticate(username: String, password: String): Response<UserResponse> {
        val data = authUseCase.authUser()
        return Response(data = data)
    }

    override suspend fun refreshToken(jwt: String): Response<UserResponse> {
        TODO("Not yet implemented")
    }
}