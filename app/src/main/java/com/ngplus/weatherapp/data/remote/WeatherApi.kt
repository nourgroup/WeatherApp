package com.ngplus.weatherapp.data.remote

import retrofit2.http.GET
import retrofit2.http.Query


//https://api.open-meteo.com
interface WeatherApi {

    @GET("/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m")
    suspend fun getWeatherData(
        @Query("latitude") lat : String,
        @Query("longitude") long : String,
    ) : WeatherDto
}