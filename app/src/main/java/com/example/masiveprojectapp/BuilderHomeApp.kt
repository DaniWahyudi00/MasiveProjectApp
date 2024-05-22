package com.example.masiveprojectapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.navigation.Screen
import com.example.masiveprojectapp.screens.arsitek.ArsitekScreen
import com.example.masiveprojectapp.screens.component.BottomNavigation
import com.example.masiveprojectapp.screens.desain.DesainScreen
import com.example.masiveprojectapp.screens.home.HomeScreen
import com.example.masiveprojectapp.screens.profile.ProfileScreen
import com.example.masiveprojectapp.screens.service.ServiceScreen
import com.example.masiveprojectapp.screens.transaction.TransactionScreen
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun BuilderHomeApp(
    navController: NavHostController = rememberNavController(),
) {
    Scaffold(
        bottomBar = { BottomNavigation(navController = navController) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = Screen.Home.route) {
                HomeScreen(
                    navigateToSeeAll = {
                        if (it == "desain"){
                            navController.navigate(Screen.Desain.route)
                        } else {
                            navController.navigate(Screen.Arsitek.route)
                        }
                    }
                )
            }
            composable(route = Screen.Service.route) {
                ServiceScreen()
            }
            composable(route = Screen.Transaction.route) {
                TransactionScreen()
            }
            composable(route = Screen.Profile.route) {
                ProfileScreen()
            }
            composable(route = Screen.Desain.route){
                DesainScreen()
            }
            composable(route = Screen.Arsitek.route){
                ArsitekScreen()
            }
        }
    }
}

@Preview
@Composable
private fun BuilderHomeAppPreview() {
    MasiveProjectAppTheme(dynamicColor = false) {
        BuilderHomeApp()
    }
}