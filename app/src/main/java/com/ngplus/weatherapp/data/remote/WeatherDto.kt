package com.ngplus.weatherapp.data.remote

import com.ngplus.weatherapp.domain.weather.WeatherInfo
import com.squareup.moshi.Json
import java.time.LocalDateTime

data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)

fun WeatherDto.toWeatherInfo() : WeatherInfo {
    val weatherDataMap = weatherData.toWeatherDataMap()
    val now = LocalDateTime.now()
    val currentWeatherData = weatherDataMap[0]?.find{
        val hour = if(now.minute<30) now.hour else now.hour + 1
        it.time.hour == hour
    }
    return WeatherInfo(
        weatherDataMap,
        currentWeatherData
    )
}