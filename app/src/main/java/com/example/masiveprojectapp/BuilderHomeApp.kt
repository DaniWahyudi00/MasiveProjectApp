package com.example.masiveprojectapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.masiveprojectapp.navigation.Screen
import com.example.masiveprojectapp.screens.arsitek.ArsitekScreen
import com.example.masiveprojectapp.screens.component.BottomNavigation
import com.example.masiveprojectapp.screens.desain.DesainScreen
import com.example.masiveprojectapp.screens.profile.ProfileScreens
import com.example.masiveprojectapp.screens.home.HomeScreen
import com.example.masiveprojectapp.screens.myproject.MyProjectContent
import com.example.masiveprojectapp.screens.myproject.MyProjectScreen
import com.example.masiveprojectapp.screens.myproject.MyProjectScreens
import com.example.masiveprojectapp.screens.myproject.myprojecitem.AddProjectScreens
import com.example.masiveprojectapp.screens.service.ServiceScreen
import com.example.masiveprojectapp.screens.transaction.TransactionScreen
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun BuilderHomeApp(
    navController: NavHostController = rememberNavController(),
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    Scaffold(
        bottomBar = {
            if (currentRoute !in listOf(
                Screen.Desain.route,
                Screen.Arsitek.route
            )){
                BottomNavigation(navController = navController)
            }
        }
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
                ProfileScreens(navController)
            }
            composable(route = Screen.MyProject.route){
                MyProjectScreens(navController)
            }
            composable(
                Screen.MyProfile.route + "/{myprofileId}",
                arguments = listOf(navArgument("myprofileId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                MyProjectScreens(
                    navController = navController,
                )
            }
            composable(
                Screen.AddProject.route){
             AddProjectScreens()
            }
            composable(route = Screen.Desain.route){
                DesainScreen(
                    navigateBack = {
                        navController.navigateUp()
                    }
                )
            }
            composable(route = Screen.Arsitek.route){
                ArsitekScreen(
                    navigateBack = {
                        navController.navigateUp()
                    }
                )
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