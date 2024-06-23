package com.example.masiveprojectapp.data.remote.firebase.authentication

import com.example.masiveprojectapp.data.local.UserData
import com.example.masiveprojectapp.utils.Resource
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.AuthResult
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    fun loginUser(email: String, password: String): Flow<Resource<AuthResult>>
    fun registerUser(username: String, email: String, password: String): Flow<Resource<AuthResult>>
    fun getDisplayName() : String
    fun googleSignIn(credential: AuthCredential): Flow<Resource<AuthResult>>
}