package com.shehatah.meditationui.ui.home.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shehatah.meditationui.models.Feature
import com.shehatah.meditationui.ui.theme.TextWhite

@Composable
fun MeditationGrid(meditations: List<Feature>) {

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),

        ) {
        items(meditations.size) {
            FeatureItem(feature = meditations[it])
        }
    }
}

@Composable
fun FeatureItem(feature: Feature) {

    Column(
        modifier = Modifier
            .padding(start = 15.dp, top = 15.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(feature.mediumColor)
            .padding(15.dp),

        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = feature.title,
            style = MaterialTheme.typography.h2,
            fontSize = 24.sp,
            lineHeight = 26.sp,
            color = TextWhite,
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp)

        ) {
            Icon(
                painter = painterResource(id = feature.iconId),
                contentDescription = "icon",
                tint = Color.White
            )
            Box(
                modifier = Modifier
                    .padding(5.dp)
                    .clip(RoundedCornerShape(5.dp))
                    .background(Color.Blue)
                    .clickable { }
                    .padding(10.dp)
            ) {
                Text(text = "Start", color = TextWhite)
            }
        }
    }

}