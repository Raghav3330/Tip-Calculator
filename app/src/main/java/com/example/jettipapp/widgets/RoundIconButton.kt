package com.example.jettipapp.widgets

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.jettipapp.MyApp

val IconButtonSizeModifier = Modifier.size(40.dp)

@Composable
fun RoundIconButton(
    imageVector: ImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    tint: Color = Color.Black.copy(alpha = 0.8f),
    backgroundColor: Color = MaterialTheme.colorScheme.background,
    elevation: Dp = 4.dp) {
    Card(
        modifier = modifier
            .padding(all = 4.dp)
            .clickable(onClick = onClick)
            .then(IconButtonSizeModifier),
        shape = CircleShape,
        colors = CardDefaults.cardColors(
             backgroundColor),
        elevation = CardDefaults.cardElevation(elevation)
    ) {
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
            Icon(imageVector, null, tint = tint)
        }
    }
}
@Preview
@Composable
private fun RoundIconPreview() {
    MyApp {
        RoundIconButton(

            imageVector = Icons.Default.Remove,
            onClick = {},
            modifier = Modifier.padding(vertical = 3.dp)
        )
    }
}
