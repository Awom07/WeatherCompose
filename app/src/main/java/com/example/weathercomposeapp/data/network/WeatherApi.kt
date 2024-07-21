package com.example.weathercomposeapp.data.network


import com.example.weathercomposeapp.data.model.WeatherModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("/v1/forecast.json")
    suspend fun getWeather(
        @Query("key") key: String,
        @Query("q") query: String,
        @Query("days") days: Int,
        @Query("aqi") aqi: String,
        @Query("alerts") alerts: String
    ) : Response<WeatherModel>
}