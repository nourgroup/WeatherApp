package com.ngplus.weatherapp.presentation


import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun WeatherCard(
    state : WeatherState,
    backgroundColor : Color,
    modifier : Modifier = Modifier.padding(16.dp)
){
    if(state.isLoading){
        Text("is loading ..")
    }else{
        Log.i("Weather_Project","state : $state")
        state.weatherInfo?.currentWeatherData?.let{ data ->
            Card(
                backgroundColor = backgroundColor,
                shape = RoundedCornerShape(10.dp),
                modifier = modifier.padding(16.dp)
            ){
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ){
                    Text(
                        text = "Today ${data.time}",
                        modifier = Modifier.align(Alignment.End),
                        color = Color.White
                    )
                    Image(
                        painter = painterResource(id = data.weatherType.iconRes),
                        contentDescription = null,
                        modifier = Modifier.width(200.dp)
                    )
                    Text(
                        text = "Today ${data.temperatureCelsius}",
                        modifier = Modifier.align(Alignment.End),
                        color = Color.White
                    )
                    Spacer(
                        modifier = Modifier.height(16.dp)
                    )
                    Text(
                        text = "Today ${data.humidity}",
                        modifier = Modifier.align(Alignment.End),
                        color = Color.White
                    )
                }
            }
        }
    }

}