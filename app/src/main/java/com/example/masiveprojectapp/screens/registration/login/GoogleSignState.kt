package com.example.masiveprojectapp.screens.registration.login

import com.google.firebase.auth.AuthResult

data class GoogleSignState(
    val success: AuthResult? = null,
    val loading: Boolean = false,
    val error: String? = null
)