package com.example.masiveprojectapp.utils

import com.example.masiveprojectapp.navigation.Screen


fun String?.shouldShowBottomBar(): Boolean {
    return this in setOf(
        Screen.Home.route,
        Screen.Service.route,
        Screen.Transaction.route,
        Screen.Profile.route
    )
}