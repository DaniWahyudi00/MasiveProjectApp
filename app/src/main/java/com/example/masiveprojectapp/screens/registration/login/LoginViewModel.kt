package com.example.masiveprojectapp.screens.registration.login

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.masiveprojectapp.data.local.UserData
import com.example.masiveprojectapp.data.remote.firebase.authentication.AuthRepository
import com.example.masiveprojectapp.data.repository.UserRepository
import com.example.masiveprojectapp.utils.Resource
import com.google.firebase.auth.AuthCredential
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val repository: AuthRepository
): ViewModel() {

    private val _loginState = Channel<LoginState>()
    val loginState = _loginState.receiveAsFlow()

    private val _googleState = mutableStateOf(GoogleSignState())
    val googleState: State<GoogleSignState> = _googleState

    fun googleSignIn(credential: AuthCredential) = viewModelScope.launch {
        repository.googleSignIn(credential).collect { result ->
            when (result) {
                is Resource.Success -> {
                    _googleState.value = GoogleSignState(success = result.data)
                }
                is Resource.Loading -> {
                    _googleState.value = GoogleSignState(loading = true)
                }
                is Resource.Error -> {
                    _googleState.value = GoogleSignState(error = result.message)
                }
            }
        }
    }

    fun loginUser(email: String, password: String) = viewModelScope.launch {
        repository.loginUser(email, password).collect { result ->
            when(result) {
                is Resource.Success -> {
                    val displayName = repository.getDisplayName()
                    _loginState.send(
                        LoginState(
                            isSucces = "Sign In Success",
                            displayName = displayName
                        )
                    )
                }
                is Resource.Loading -> {
                    _loginState.send(LoginState(isLoading = true))
                }
                is Resource.Error -> {
                    _loginState.send(LoginState(isError = result.message))
                }
            }
        }
    }
}