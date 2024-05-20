package com.example.masiveprojectapp.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Service : Screen("service")
    object Transaction : Screen("transaction")
    object Profile : Screen("profile")
    object MyProfile : Screen("MyProfile")
    object MyProject : Screen("Myproject")
    object Forum : Screen("Forum")
    object HelpCenter : Screen("HelpCenter")
    object Logout : Screen("Logout")
}