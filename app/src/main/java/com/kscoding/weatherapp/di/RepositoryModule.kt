package com.kscoding.weatherapp.di

import com.kscoding.weatherapp.data.location.DefaultLocationTracker
import com.kscoding.weatherapp.data.repository.WeatherRepositoryImpl
import com.kscoding.weatherapp.domain.location.LocationTracker
import com.kscoding.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindWeatherRespository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}