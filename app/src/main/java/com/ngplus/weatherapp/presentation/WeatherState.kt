package com.ngplus.weatherapp.presentation

import com.ngplus.weatherapp.domain.weather.WeatherInfo

data class WeatherState (
    val weatherInfo: WeatherInfo?= null,
    val isLoading : Boolean = false,
    val error : String? = null
)