package com.example.masiveprojectapp.screens.registration.signup

data class SignUpState(
    val isLoading: Boolean = false,
    val isSucces: String? = "",
    val isError: String? = ""
)