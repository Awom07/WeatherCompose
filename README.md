# Jetpack Compose WeatherApp 

WeatherApp is an application that shows you the weather according to your location. You can find out by searching the weather information of the city you want. 

<br/>

## Api
* [Free Weather API](https://www.weatherapi.com/)

## Libraries

* [Retrofit](https://square.github.io/retrofit)

* [LiveData](https://developer.android.com/topic/libraries/architecture/livedata)

* [Coil](https://coil-kt.github.io/coil/compose/)

##  Screenshots

(file:///C:/Users/azoma/Desktop/Screenshot_2024-07-24-21-05-36-196_com.example.weathercomposeapp.jpg)

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
