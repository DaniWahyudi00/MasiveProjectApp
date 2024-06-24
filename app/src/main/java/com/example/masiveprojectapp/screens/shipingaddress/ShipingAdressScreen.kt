package com.example.masiveprojectapp.screens.shipingaddress

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.screens.component.shipingaddresitem.ShipingAddressItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShippingAddress(
    modifier : Modifier,
    navController : NavController
) {

    Scaffold(containerColor = MaterialTheme.colorScheme.background)
    { innerPadding ->
        ShipingAddressItem(modifier .padding(innerPadding), navController)

    }
}

@Preview(showBackground = true)
@Composable
fun ShippingAddressPreview() {
    ShippingAddress(modifier = Modifier, navController = rememberNavController())

}