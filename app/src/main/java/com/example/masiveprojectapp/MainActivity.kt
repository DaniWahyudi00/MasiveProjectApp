package com.example.masiveprojectapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MasiveProjectAppTheme(dynamicColor = false) {
                BuilderHomeApp()
            }
        }
    }
}

