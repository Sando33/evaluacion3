package com.example.evauacion3.UI.data.retrofit.repository

import com.example.evauacion3.UI.data.RetrofitHelper
import com.example.evauacion3.model.Movie

class PeliculaRepository {
    fun getProducts(): List<Movie>{
        val response = RetrofitHelper.storeInstance.getAllProducts()
        return response.peliculas
    }
}