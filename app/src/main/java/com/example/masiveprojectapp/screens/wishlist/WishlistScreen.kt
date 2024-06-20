package com.example.masiveprojectapp.screens.wishlist

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Divider
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
import com.example.masiveprojectapp.navigation.Screen
import com.example.masiveprojectapp.screens.component.SearchBar
import com.example.masiveprojectapp.screens.component.transaction.TransactionScreenItem
import com.example.masiveprojectapp.screens.component.wishlist.WishlistScreenItem
import com.example.masiveprojectapp.screens.desain.DesainScreen
import com.example.masiveprojectapp.screens.transaction.TransactionScreen
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WishlistScreen(
    modifier: Modifier = Modifier,
    navigateBack: () -> Unit,
    navController : NavController
) {
    Scaffold(
        containerColor = MaterialTheme.colorScheme.background,
        topBar = {
            Column {
                TopAppBar(
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.background
                    ),
                    modifier = Modifier
                        .padding(horizontal = 16.dp),
                    title = {
                        Text(
                            text = "Wishlist",
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
                Divider()
            }
        }
    )
    { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(26.dp),
                modifier = modifier.padding(16.dp)
            ) {
                items(2){
                    WishlistScreenItem(modifier = Modifier, onLihat = { navController.navigate(
                        Screen.Checkout.route) }, navController = navController)
                }
            }
        }
    }
}

@Preview
@Composable
private fun WishlistScreenPreview() {
    MasiveProjectAppTheme(dynamicColor = false) {
        WishlistScreen(
            navController = rememberNavController(),
            navigateBack = {}
        )
    }
}