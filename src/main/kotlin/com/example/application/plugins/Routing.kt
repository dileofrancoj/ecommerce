package com.example.application.plugins

import com.example.application.routes.products
import com.example.application.routes.users
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        products()
        users()
    }
}
