package com.example.domain.usecases.products

import com.example.domain.models.Product
import com.example.adapters.repositories.ProductsRepository

class GetProductsUseCase(private val productsRepository: ProductsRepository) {
    suspend fun getProducts(): List<Product> {
        return productsRepository.getProducts()
    }
    suspend fun getProduct(): List<Product> {
        return productsRepository.getProduct()
    }
}