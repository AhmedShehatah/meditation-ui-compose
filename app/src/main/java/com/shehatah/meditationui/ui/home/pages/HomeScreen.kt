package com.shehatah.meditationui.ui.home.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shehatah.meditationui.R
import com.shehatah.meditationui.models.Feature
import com.shehatah.meditationui.models.MenuItem
import com.shehatah.meditationui.ui.home.widgets.*
import com.shehatah.meditationui.ui.theme.*

@Preview
@Composable
fun HomeScreen() {
    Box() {
        Column(
            modifier = Modifier
                .background(DeepBlue)
                .fillMaxSize()
        ) {
            GreetingHeader()
            ChipsSection(
                chips = listOf(
                    "Sweet sleep",
                    "Insomnia",
                    "Depression",
                )
            )
            CurrentMeditation()
            Text(
                text = "Featured",
                style = MaterialTheme.typography.h1,
                modifier = Modifier.padding(15.dp)
            )
            MeditationGrid(
                listOf(
                    Feature(
                        title = "Sleep meditation",
                        R.drawable.ic_headphone,
                        BlueViolet1,
                        BlueViolet2,
                        BlueViolet3
                    ),
                    Feature(
                        title = "Tips for sleeping",
                        R.drawable.ic_videocam,
                        LightGreen1,
                        LightGreen2,
                        LightGreen3
                    ),
                    Feature(
                        title = "Night island",
                        R.drawable.ic_headphone,
                        OrangeYellow1,
                        OrangeYellow2,
                        OrangeYellow3
                    ),
                    Feature(
                        title = "Calming sounds",
                        R.drawable.ic_headphone,
                        Beige1,
                        Beige2,
                        Beige3
                    )
                )
            )


        }
        BottomMenu(
            menuItems = listOf(
                MenuItem("home", R.drawable.ic_home),
                MenuItem("Meditate", R.drawable.ic_bubble),
                MenuItem("Sleep", R.drawable.ic_moon),
                MenuItem("Music", R.drawable.ic_music),
                MenuItem("Profile", R.drawable.ic_profile),

                ),
            modifier = Modifier.align(Alignment.BottomCenter)

        )

    }

}

