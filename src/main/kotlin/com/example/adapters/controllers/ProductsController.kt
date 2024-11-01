package com.example.adapters.controllers

import com.example.adapters.dtos.Response
import com.example.domain.models.Product
import com.example.domain.usecases.products.GetProductsUseCase

class ProductsController(private val getProductsUseCase: GetProductsUseCase) {
    suspend fun getAllProducts(): Response<List<Product>> {
        val products = getProductsUseCase.getProducts()
        return Response(data = products)
    }

    suspend fun getProduct(id: Int): Response<List<Product>> {
        val product = getProductsUseCase.getProduct()
        return Response(data = product)
    }
}