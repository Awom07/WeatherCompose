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
![Screenshot_2024-07-24-21-05-22-553_com example weathercomposeapp](https://github.com/user-attachments/assets/e4dec7ee-5950-4c97-a4ad-1a4f54c1c341)


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
