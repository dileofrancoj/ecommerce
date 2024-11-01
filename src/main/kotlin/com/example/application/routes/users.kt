package com.example.application.routes

import com.example.adapters.controllers.UserController
import com.example.domain.entities.User
import io.ktor.http.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.users() {
    post("/users/auth") {
        try {
            val usersController by inject<UserController>()
            val (username, password) = call.receive<User>()
            val response = usersController.authenticate(username, password)
            call.respond(message = response)
        } catch (e: IllegalArgumentException) {
            call.respondText("Bad request", status = HttpStatusCode.BadRequest)
        }

    }
}