package com.example.masiveprojectapp.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Service : Screen("service")
    object Transaction : Screen("transaction")
    object Profile : Screen("profile")

    object Desain : Screen("desain")
    object Arsitek : Screen("arsitek")
}