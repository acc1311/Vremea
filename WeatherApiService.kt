package com.example.weatherapp

import retrofit2.http.GET

interface WeatherApiService {
    @GET("/exec")
    suspend fun getWeather(): WeatherResponse
}