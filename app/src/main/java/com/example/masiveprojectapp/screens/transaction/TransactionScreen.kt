package com.example.masiveprojectapp.screens.transaction

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.navigation.Screen
import com.example.masiveprojectapp.screens.component.SearchBar
import com.example.masiveprojectapp.screens.component.transaction.TransactionScreenItem
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme


@Composable
fun TransactionScreen(
    modifier: Modifier = Modifier,
    navController : NavController
) {
    Scaffold(
        topBar = {
            SearchBar()
        },
        containerColor = MaterialTheme.colorScheme.background,
        )
    { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(26.dp),
                modifier = modifier.padding(16.dp)
            ) {
                items(2){
                    TransactionScreenItem(modifier = Modifier, onLihat = { navController.navigate(Screen.Checkout.route) }, navController = navController)
                }
            }
        }
    }
}

@Preview
@Composable
private fun TransactionScreenPreview() {
    MasiveProjectAppTheme {
        TransactionScreen(navController = rememberNavController())
    }
}