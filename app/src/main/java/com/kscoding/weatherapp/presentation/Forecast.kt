package com.kscoding.weatherapp.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kscoding.weatherapp.domain.weather.WeatherData

@Composable
fun Forecast(
    state: WeatherState,
    modifier: Modifier = Modifier
){
state.weatherInfo?.weatherDataPerDay?.get(0)?.let { data ->
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp)
    ) {
        Text(text = "Today's Hourly Forecast",
        fontSize = 22.sp,
        color= Color.White)
        Spacer(modifier = Modifier.height(24.dp))
        LazyRow(content = {
            items(data){ weatherData ->
                HourlyCard(
                    weatherData= weatherData,
                    modifier = Modifier
                        .height(110.dp)
                        .padding(horizontal = 20.dp)
                )
            }
        })
    }
}
}