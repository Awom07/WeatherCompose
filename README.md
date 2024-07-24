# Jetpack Compose WeatherApp 🌡

WeatherApp is an application that shows you the weather according to your location. You can find out by searching the weather information of the city you want. You can save the weather of the city you want. If you have an internet connection, the weather conditions of these cities are updated automatically. Weather information is saved on the device.

<br/>

## Api
* (https://www.weatherapi.com/)

## Libraries

* [Retrofit](https://square.github.io/retrofit)

* [LiveData](https://developer.android.com/topic/libraries/architecture/livedata)

* [Coil](https://coil-kt.github.io/coil/compose/)

## 📱 Screenshots



## Project Structure 
```
WeatherComposeApp
│
|
└───app 
|   |   Constant
|   |   MainActivity.kt
|   |
|   └───theme
|   |   |
|   |   |   Color.kt
|   |   |   Theme.kt
|   |   |   Type.kt
|
└──data
|   |  
|   |___model  
|   |     |  Condition
|   |     |  Current
|   |     |  Location
|   |     |  WeatherModel
|   |   
|   └───network
|   |   |   NetWorkResponse
|   |   |   WeatherApi
|   
└───di
|   |  RetrofitInstance
|
|
|___presentation
|   |  WeatherPage
|   |  WeatherViewModel
```
