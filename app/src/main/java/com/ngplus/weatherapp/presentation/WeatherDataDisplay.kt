package com.ngplus.weatherapp.presentation

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle

@Composable
fun  WeatherDataDisplay(
    value : Int,
    unit : String,
    icon : ImageVector,
    modifier : Modifier = Modifier,
    testStyle :TextStyle = TextStyle(),
    iconTint : Color = Color.White
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ){
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = iconTint
        )
    }
}