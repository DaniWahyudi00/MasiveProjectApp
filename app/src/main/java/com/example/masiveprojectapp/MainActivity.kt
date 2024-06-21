package com.example.masiveprojectapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.screens.splash.SplashScreen
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MasiveProjectAppTheme(dynamicColor = false) {

                val navController = rememberNavController()

                NavHost(navController, startDestination = "splash") {
                    composable("splash") {
                        SplashScreen(navController)
                    }
                    composable("Builder") {
                        BuilderHomeApp()
                    }
                }
            }
        }
    }
}

