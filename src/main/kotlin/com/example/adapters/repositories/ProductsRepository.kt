package com.example.adapters.repositories


import com.example.domain.models.Product

interface ProductsRepository {
    suspend fun getProducts(): List<Product>
    suspend fun getProduct(): List<Product>
}

class ProductsRepositoryImpl : ProductsRepository {
    override suspend fun getProducts(): List<Product> {
        val prod1 = Product(name="Some product", id=1, image = "some-img")
        val prod2 = Product(name="Some product 2", id=2, image = "some-img")
        return listOf(prod1, prod2)
    }

    override suspend fun getProduct(): List<Product> {
        val prod1 = Product(name="Some product", id=1, image = "some-img")
        return listOf(prod1)
    }
}

