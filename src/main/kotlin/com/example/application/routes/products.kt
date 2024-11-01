package com.example.application.routes

import com.example.adapters.controllers.ProductsController
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.products() {
    get("/products") {
        val productsController by inject<ProductsController>()

        val response = productsController.getAllProducts()
        call.respond(message = response, status = HttpStatusCode.OK)
    }
    get("/product/{id}") {
        try {
            // val prods = getProducts()
            val productsController by inject<ProductsController>()

            val id = call.parameters["id"]?.toInt()
            val response = productsController.getProduct(id!!)
            call.respond(message=response)
        } catch (e: NumberFormatException) {
            call.respondText("Only numbers allowed", status = HttpStatusCode.BadRequest)
        }
    }
}