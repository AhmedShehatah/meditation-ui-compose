package com.shehatah.meditationui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.shehatah.meditationui.ui.home.pages.HomeScreen
import com.shehatah.meditationui.ui.theme.MeditationUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MeditationUITheme {
                HomeScreen()
            }
        }
    }
}

@Preview
@Composable
fun PreviewCompose(){
    HomeScreen()
}

