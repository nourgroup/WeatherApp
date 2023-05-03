package com.ngplus.weatherapp.data.repositories

import com.ngplus.weatherapp.data.remote.WeatherApi
import com.ngplus.weatherapp.data.remote.toWeatherInfo
import com.ngplus.weatherapp.domain.repositories.WeatherRepository
import com.ngplus.weatherapp.domain.util.Resource
import com.ngplus.weatherapp.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api : WeatherApi
) : WeatherRepository{
    override suspend fun getWeatherData(lat : Double, long:Double): Resource<WeatherInfo> {
        return try{
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        }catch (e : Exception){
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown eror occured.")
        }
    }

}