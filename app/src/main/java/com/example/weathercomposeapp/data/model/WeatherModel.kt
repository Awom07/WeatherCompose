package com.example.weathercomposeapp.data.model

data class WeatherModel(
    val current: Current,
    val forecast: Forecast? = null,
    val location: Location
)