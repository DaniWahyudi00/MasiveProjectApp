package com.example.masiveprojectapp.screens.profile

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.masiveprojectapp.screens.component.UserDetailItem
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun UserProfileScreeen(){
    
    MasiveProjectAppTheme {
        UserDetailItem(modifier = Modifier)
    }
}