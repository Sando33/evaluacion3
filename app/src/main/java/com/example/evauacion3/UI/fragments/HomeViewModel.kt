package com.example.evauacion3.UI.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.evauacion3.model.Movie
import com.example.evauacion3.model.getData

class HomeViewModel: ViewModel() {
    val products: MutableLiveData<List<Movie>> = MutableLiveData<List<Movie>>()
    fun getProducts(){
        val allProducts = getData()
        products.value = allProducts
    }
}