package com.example.masiveprojectapp.data.repository

import com.example.masiveprojectapp.data.local.UserData
import com.example.masiveprojectapp.utils.SessionPreferences

class UserRepository private constructor(
    private val preferences: SessionPreferences
){

}