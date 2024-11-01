
package com.example.di

import com.example.adapters.controllers.ProductsController
import com.example.adapters.controllers.UserController
import com.example.adapters.repositories.AuthRepository
import com.example.adapters.repositories.AuthRepositoryImplementation
import com.example.adapters.repositories.ProductsRepository
import com.example.adapters.repositories.ProductsRepositoryImpl
import com.example.domain.usecases.products.GetProductsUseCase
import com.example.domain.usecases.users.AuthUseCase
import org.koin.dsl.module

val koinModule = module {
    // Products
    single<ProductsRepository> { ProductsRepositoryImpl() }
    single { GetProductsUseCase(get()) }
    single { ProductsController(get()) }
    // Users
    single<AuthRepository> {AuthRepositoryImplementation()}
    single { AuthUseCase(get()) }
    single {UserController(get())}

}