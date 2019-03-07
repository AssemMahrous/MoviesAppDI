package com.example.moviesappdi.components

import com.example.moviesappdi.modules.ApiModule
import com.example.moviesappdi.network.MoviesApi
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {
    fun getApiService(): MoviesApi
}