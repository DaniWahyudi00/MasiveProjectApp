package com.example.masiveprojectapp.screens.component.wishlist

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.masiveprojectapp.navigation.Screen
import com.example.masiveprojectapp.screens.component.SearchBar
import com.example.masiveprojectapp.screens.component.transaction.TransactionScreenItem

@Composable
fun WishlistScreen(modifier: Modifier = Modifier,
                   navController : NavController
) {
    Scaffold(
        topBar = {
            SearchBar(navController)
        },
        containerColor = MaterialTheme.colorScheme.background,
    )
    { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(26.dp),
                modifier = modifier.padding(16.dp)
            ) {
                items(2) {
                    WishlistItem(modifier = Modifier, onLihat = {
                        navController.navigate(
                            Screen.Checkout.route
                        )
                    }, navController = navController)
                }
            }
        }
    }
}