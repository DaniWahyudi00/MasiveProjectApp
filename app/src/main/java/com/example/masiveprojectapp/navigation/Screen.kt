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
    object UserProfile : Screen ("userprofile")
    object Checkout : Screen ("checkout")
    object DetailProduct : Screen ("detailproduct")
    object Forum : Screen("Forum")
    object HelpCenter : Screen("HelpCenter")
    object Logout : Screen("Logout")
    object Login : Screen("login")
    object SignUp : Screen("signup")
    object Welcome : Screen("welcome")
    object ForgotPassword : Screen("forgotpassword")
    object DetailDesain : Screen("home1/{id}") {
        fun createRoute(id: Int) = "home1/$id"
    }
    object DetailArsitek : Screen("home/{id}") {
        fun createRoute(id: Int) = "home/$id"
    }
    object AddProject : Screen("addmyproject")
}