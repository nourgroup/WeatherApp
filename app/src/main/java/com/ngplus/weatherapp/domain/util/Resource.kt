package com.ngplus.weatherapp.domain.util

sealed class Resource<T>(val data : T?, val message : String? ="") {
    class Success<T>(data : T) : Resource<T>(data)
    class Error<T>(message : String, data : T): Resource<T>(data,message)
}