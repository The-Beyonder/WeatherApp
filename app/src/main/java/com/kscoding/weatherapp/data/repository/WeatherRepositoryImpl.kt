package com.kscoding.weatherapp.data.repository

import com.kscoding.weatherapp.data.mappers.toWeatherInfo
import com.kscoding.weatherapp.data.remote.WeatherApi
import com.kscoding.weatherapp.domain.repository.WeatherRepository
import com.kscoding.weatherapp.domain.util.Resource
import com.kscoding.weatherapp.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
    ) : WeatherRepository {
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch (e: Exception){
            e.printStackTrace()
            Resource.Error(e.message?:"Error")
        }
    }
}