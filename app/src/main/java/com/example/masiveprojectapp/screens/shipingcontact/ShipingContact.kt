package com.example.masiveprojectapp.screens.shipingcontact

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.masiveprojectapp.screens.component.contactinformation.ContactInformationItem


@Composable
fun ShipingContactScreen(
    navController: NavController
){
        Scaffold(containerColor = MaterialTheme.colorScheme.background){

            innerPadding ->
            ContactInformationItem(modifier = Modifier.padding(innerPadding), navController, navigateBack = {navController.navigateUp()})
        }
}