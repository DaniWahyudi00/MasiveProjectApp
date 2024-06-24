package com.example.masiveprojectapp.utils

import android.content.Context
import android.os.PerformanceHintManager.Session
import android.util.Log
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.example.masiveprojectapp.data.local.UserData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "session")

class SessionPreferences private constructor(
    private val dataStore: DataStore<Preferences>
){

    object PreferencesKeys {
        val IS_LOGGED_IN = booleanPreferencesKey("is_logged_in")
    }

    suspend fun saveLoginStatus(isLogged: Boolean) {
        dataStore.edit {
            it[PreferencesKeys.IS_LOGGED_IN] = isLogged
        }
    }

    fun getLoginStatus(): Flow<Boolean> {
        return dataStore.data.map {
            it[PreferencesKeys.IS_LOGGED_IN] ?: false
        }
    }
}