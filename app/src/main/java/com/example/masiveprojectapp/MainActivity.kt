package com.example.masiveprojectapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MasiveProjectAppTheme(dynamicColor = false) {
                BuilderHomeApp()
            }
        }
    }
}

