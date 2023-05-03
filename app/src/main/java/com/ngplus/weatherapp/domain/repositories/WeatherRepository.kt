package com.ngplus.weatherapp.domain.repositories

import com.ngplus.weatherapp.domain.util.Resource
import com.ngplus.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat : Double, long:Double) : Resource<WeatherInfo>
}