package com.example.masiveprojectapp.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Service : Screen("service")
    object Transaction : Screen("transaction")
    object Profile : Screen("profile")
    object Desain : Screen("desain")
    object Arsitek : Screen("arsitek")
    object MyProfile : Screen("MyProfile")
    object MyProject : Screen("myproject")
    object Forum : Screen("Forum")
    object HelpCenter : Screen("HelpCenter")
    object Logout : Screen("Logout")
    object AddProject : Screen("addproject")
    object Login : Screen("login")
    object SignUp : Screen("signup")
    object Welcome : Screen("welcome")
}