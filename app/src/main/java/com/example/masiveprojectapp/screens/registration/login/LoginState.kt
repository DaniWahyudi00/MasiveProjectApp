package com.example.masiveprojectapp.screens.registration.login

data class LoginState(
    val isLoading: Boolean = false,
    val isSucces: String? = "",
    val isError: String? = ""
)