package com.example.weathercomposeapp.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weathercomposeapp.Constant
import com.example.weathercomposeapp.data.model.WeatherModel
import com.example.weathercomposeapp.data.network.NetworkResponse
import com.example.weathercomposeapp.di.RetrofitInstance
import kotlinx.coroutines.launch
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class WeatherViewModel: ViewModel() {
    private val weatherApi = RetrofitInstance.weatherApi
    private val _weatherResult = MutableLiveData<NetworkResponse<WeatherModel>>()
        val weatherResult : LiveData<NetworkResponse<WeatherModel>> = _weatherResult


    fun getData(city: String){
        _weatherResult.value = NetworkResponse.Loading
        viewModelScope.launch {
            try {
                val response = weatherApi.getWeather(Constant.APIKEY, city, 7, "no", "no")
                if (response.isSuccessful){
                    response.body()?.let {
                        _weatherResult.value = NetworkResponse.Success(it)
                    }
                }else{
                    _weatherResult.value = NetworkResponse.Error("Failed to load data")
                }
            }catch (e: Exception){
                _weatherResult.value = NetworkResponse.Error("Failed to load data")
            }
        }
    }

    fun parseDateToTime(time: String): String {
        val inputSDF = SimpleDateFormat("yyyy-MM-dd hh:mm", Locale.getDefault())
        val outputSDF = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val date: Date? = try {
            inputSDF.parse(time)
        } catch (e: ParseException) {
            return time
        }
        return outputSDF.format(date)

    }

    fun parseDateToDay(dateString: String): String {
        val inputFormat = SimpleDateFormat("yyyy-MM-dd")
        val outputFormat = SimpleDateFormat("EEE, dd MMM")
        val date: Date? = try {
            inputFormat.parse(dateString)
        } catch (e: ParseException) {
            return dateString
        }
        return outputFormat.format(date)
    }
}