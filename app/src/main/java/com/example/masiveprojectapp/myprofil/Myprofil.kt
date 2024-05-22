package com.example.masiveprojectapp.myprofil

import com.example.masiveprojectapp.navigation.Screen

data class Myprofil(

        val id: Int,
        val name: String,
        val telephone: String,
        val email: String,
        val password: String,
        val gender: String,
        val screen: Screen
)

