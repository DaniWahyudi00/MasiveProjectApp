package com.example.masiveprojectapp.screens.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel : ViewModel() {
    private val _splashFinished = MutableLiveData<Boolean>()
    val splashFinished: LiveData<Boolean>
        get() = _splashFinished

    init {
        // Simulasi proses splash screen yang berjalan selama beberapa detik
        viewModelScope.launch {
            delay(3000) // Delay simulasi selama 3 detik
            _splashFinished.value = true
        }
    }
}
