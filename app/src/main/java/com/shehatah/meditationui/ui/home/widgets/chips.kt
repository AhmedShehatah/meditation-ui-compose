package com.shehatah.meditationui.ui.home.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.shehatah.meditationui.ui.theme.ButtonBlue
import com.shehatah.meditationui.ui.theme.DarkerButtonBlue
import com.shehatah.meditationui.ui.theme.TextWhite


@Composable
fun ChipsSection(
    chips: List<String>
) {
    var selectedIndex by remember {
        mutableStateOf(0)
    }
    LazyRow {
        items(chips.size) {
            Box(
                modifier = Modifier
                    .padding(top = 15.dp, bottom = 15.dp, start = 15.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .clickable {
                        selectedIndex = it
                    }
                    .background(
                        if (it == selectedIndex) ButtonBlue else DarkerButtonBlue
                    )
                    .padding(15.dp)

            ) {
                Text(text = chips[it], color = TextWhite)
            }

        }
    }
}