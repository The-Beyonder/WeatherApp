package com.kscoding.weatherapp.domain.repository

import com.kscoding.weatherapp.domain.util.Resource
import com.kscoding.weatherapp.domain.weather.WeatherData
import com.kscoding.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}