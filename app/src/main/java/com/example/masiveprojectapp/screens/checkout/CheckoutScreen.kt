package com.example.masiveprojectapp.screens.checkout

import androidx.compose.runtime.Composable
import com.example.masiveprojectapp.screens.component.transaction.CheckOutItem
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun CheckOutScreen(){

    MasiveProjectAppTheme {
        CheckOutItem()
    }
}