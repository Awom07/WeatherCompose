package com.example.weathercomposeapp.data.network

sealed class NetworkResponse<out T> {
    data class Success<T>(val data: T) : NetworkResponse<T>()
    data class Error(val exception: String) : NetworkResponse<Nothing>()
    object Loading : NetworkResponse<Nothing>()

}