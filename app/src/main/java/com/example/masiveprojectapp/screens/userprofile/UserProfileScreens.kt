package com.example.masiveprojectapp.screens.userprofile

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.screens.component.Profileitem.UserDetailItem
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun UserProfileScreens(){
    MasiveProjectAppTheme {
        UserDetailItem(modifier = Modifier, navController = rememberNavController())
    }
}