package com.kscoding.weatherapp.presentation

import com.kscoding.weatherapp.domain.weather.WeatherData
import com.kscoding.weatherapp.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
    )
