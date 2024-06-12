package com.example.masiveprojectapp.data.remote.firebase.authentication

import com.example.masiveprojectapp.utils.Resource
import com.google.firebase.auth.AuthResult
import kotlinx.coroutines.flow.Flow

class AuthRepositoryImpl : AuthRepository {
    override fun loginUser(email: String, password: String): Flow<Resource<AuthResult>> {
        TODO("Not yet implemented")
    }

    override fun registerUser(email: String, password: String): Flow<Resource<AuthResult>> {
        TODO("Not yet implemented")
    }
}