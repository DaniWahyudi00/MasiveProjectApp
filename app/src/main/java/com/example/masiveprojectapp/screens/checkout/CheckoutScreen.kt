package com.example.masiveprojectapp.screens.checkout

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.screens.component.transaction.CheckOutItem
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheckOutScreen(
    navController: NavController,
    navigateBack: () -> Unit,
    naviGateToContact: () -> Unit
){
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background
                ),
                modifier = Modifier
                    .padding(horizontal = 16.dp),
                title = {
                    Text(
                        text = "Checkout",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 8.dp)
                    )
                },
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Arrow Back",
                        modifier = Modifier
                            .clickable {
                                navigateBack()
                            }
                    )
                }
            )
        }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            CheckOutItem(modifier = Modifier, navController = navController, navigateToContact = {naviGateToContact})
        }
    }
}

@Preview
@Composable
private fun CheckoutScreenPreview() {
    MasiveProjectAppTheme {
        CheckOutScreen(navController = rememberNavController(), navigateBack = {}, naviGateToContact = {})
    }
}