package com.shehatah.meditationui.ui.home.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.shehatah.meditationui.R
import com.shehatah.meditationui.ui.theme.ButtonBlue
import com.shehatah.meditationui.ui.theme.LightRed
import com.shehatah.meditationui.ui.theme.TextWhite

@Composable
fun CurrentMeditation(
    color: Color = LightRed
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier =
        Modifier
            .padding(15.dp)
            .clickable { }
            .clip(RoundedCornerShape(15.dp))
            .background(color)
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .fillMaxWidth()

    ) {

        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Daily Thought",
                style = MaterialTheme.typography.h2
            )
            Text(
                text = "Meditation 3-10 min",
                style = MaterialTheme.typography.body1,
                color = TextWhite
            )
        }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(ButtonBlue)
                .padding(10.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_play),
                contentDescription = "Play",
                tint = Color.White,
                modifier = Modifier.size(16.dp)
            )
        }

    }
}