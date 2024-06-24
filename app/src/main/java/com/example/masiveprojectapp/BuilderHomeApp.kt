package com.example.masiveprojectapp

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.masiveprojectapp.navigation.Screen
import com.example.masiveprojectapp.screens.addmyproject.AddMyProjectScreen
import com.example.masiveprojectapp.screens.arsitek.ArsitekScreen
import com.example.masiveprojectapp.screens.checkout.CheckOutScreen
import com.example.masiveprojectapp.screens.component.BottomNavigation
import com.example.masiveprojectapp.screens.desain.DesainScreen
import com.example.masiveprojectapp.screens.detailArsitek2.DetailArsitek
import com.example.masiveprojectapp.screens.detailDesain.DetailDesain
import com.example.masiveprojectapp.screens.home.HomeScreen
import com.example.masiveprojectapp.screens.detailproduct.DetailProductItem
import com.example.masiveprojectapp.screens.home.HomeViewModel
import com.example.masiveprojectapp.screens.myproject.MyProjectScreens
import com.example.masiveprojectapp.screens.profile.ProfileScreen
import com.example.masiveprojectapp.screens.profile.ProfileScreens
import com.example.masiveprojectapp.screens.registration.login.LoginScreen
import com.example.masiveprojectapp.screens.registration.signup.SignUpScreen
import com.example.masiveprojectapp.screens.registration.welcome.WelcomeScreen
import com.example.masiveprojectapp.screens.registration.changepassword.ForgotPassScreen
import com.example.masiveprojectapp.screens.userprofile.UserProfileScreens
import com.example.masiveprojectapp.screens.service.ServiceScreen
import com.example.masiveprojectapp.screens.transaction.TransactionScreen
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun BuilderHomeApp(
    navController: NavHostController = rememberNavController(),
    viewModel: HomeViewModel = hiltViewModel()
) {

    val displayName by viewModel.displayName.collectAsState()
    val startDestination = if (displayName == "Unknown") Screen.Welcome.route else Screen.Home.route


    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    Scaffold(
        bottomBar = {
            if (currentRoute !in listOf(
                Screen.Desain.route,
                Screen.Arsitek.route,
                Screen.Welcome.route,
                Screen.Login.route,
                Screen.SignUp.route,
                Screen.DetailDesain.route,
                Screen.Checkout.route
            )){
                BottomNavigation(navController = navController)
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = startDestination,
            modifier = Modifier.padding(innerPadding),
            enterTransition = { fadeIn(tween(500)) },
            exitTransition = { fadeOut(tween(500)) }
        ) {
            composable(route = Screen.Welcome.route){
                WelcomeScreen(
                    navigateToSignIn = {
                        navController.navigate(Screen.Login.route)
                    },
                    navigateToSignUp = {
                        navController.navigate(Screen.SignUp.route)
                    }
                )
            }
            composable(route = Screen.Login.route){
                LoginScreen(
                    navigateToHome = {
                        navController.navigate(Screen.Home.route) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                inclusive = true
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    },
                    navigateToSignUp = {
                        navController.navigate(Screen.SignUp.route)
                    },
                    navigateToForgotPassword = {
                        navController.navigate(Screen.ForgotPassword.route)
                    }
                )
            }
            composable(route = Screen.SignUp.route){
                SignUpScreen(
                    navigateToLogin = {
                        navController.navigate(Screen.Login.route)
                    }
                )
            }
            composable(route = Screen.ForgotPassword.route){
                ForgotPassScreen()
            }
            composable(route = Screen.Home.route) {
                HomeScreen(
                    navigateToSeeAll = {
                        if (it == "desain"){
                            navController.navigate(Screen.Desain.route)
                        } else {
                            navController.navigate(Screen.Arsitek.route)
                        }
                    },
                    navigateToDetailDesain = {
                        navController.navigate(Screen.DetailDesain.createRoute(it))
                    },
                    navigateToDetailArsitek = {
                        navController.navigate(Screen.DetailArsitek.createRoute(it))
                    }
                )
            }
            composable(
                route = Screen.DetailDesain.route,
                arguments = listOf(navArgument("id") {
                    type = NavType.IntType
                })
            ){
                val id = it.arguments?.getInt("id") ?: 0
                DetailDesain(
                    id = id,
                )
            }
            composable(
                route = Screen.DetailArsitek.route,
                arguments = listOf(navArgument("id") {
                    type = NavType.IntType
                })
            ){
                val id = it.arguments?.getInt("id") ?: 0
                DetailArsitek(
                    id = id,
                    navigateBack = {
                        navController.navigateUp()
                    }
                )
            }
            composable(route = Screen.Service.route) {
                ServiceScreen(
                    navigateToDetailArsitek = {
                        navController.navigate(Screen.DetailArsitek.createRoute(it))
                    },
                    navigateToDetailDesain = {
                        navController.navigate(Screen.DetailDesain.createRoute(it))
                    }
                )
            }
            composable(route = Screen.Transaction.route) {
                TransactionScreen(navController = navController)
            }
            composable(route = Screen.Profile.route) {
                ProfileScreens(navController)
            }
            composable(route = Screen.MyProject.route){
                MyProjectScreens(navController)
            }
            composable(route = Screen.MyProfile.route) {
                ProfileScreen()
                //MyProfileScreens(
//                    navController = navController,
//                )
            }
            composable(route = Screen.AddProject.route){
             AddMyProjectScreen()
            }
            composable(route = Screen.UserProfile.route){
                UserProfileScreens()
            }
            composable(route = Screen.Desain.route){
                DesainScreen(
                    navigateBack = {
                        navController.navigateUp()
                    },
                    navigateToDetail = {
                        navController.navigate(Screen.DetailDesain.createRoute(it))
                    }
                )
            }
            composable(route = Screen.Arsitek.route){
                ArsitekScreen(
                    navigateBack = {
                        navController.navigateUp()
                    },
                    navigateToDetail = {
                        navController.navigate(Screen.DetailArsitek.createRoute(it))
                    }
                )
            }
            composable(route = Screen.Checkout.route){
                CheckOutScreen()
            }
            composable(route = Screen.DetailProduct.route){
                DetailProductItem()
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