package com.example.firstretrofit.data

import com.example.firstretrofit.data.model.Product
import kotlinx.coroutines.flow.Flow
import kotlin.Result

interface ProductsRepository {
    suspend fun getProductsList(): Flow<com.example.firstretrofit.data.Result<List<Product>>>
}