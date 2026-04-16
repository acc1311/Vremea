package com.example.weatherapp

data class WeatherResponse(
    val temperatura: String,
    val umiditate: String,
    val vant: String,
    val descriere: String,
    val oras: String = ""
)