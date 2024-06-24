package com.example.masiveprojectapp.screens.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.navigation.Screen


@Composable
fun SearchBar(
    navController: NavController
) {
    Row(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Search(
            modifier = Modifier
                .weight(1f)
        )
        Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = "Favourite",
            modifier = Modifier
                .padding(start = 16.dp)
                .clickable { navController.navigate(Screen.Wishlist.route) }
        )
        Icon(
            imageVector = Icons.Default.Notifications,
            contentDescription = "Notifications",
            modifier = Modifier
                .padding(start = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SearchBarPreview() {
    MasiveProjectAppTheme {
        SearchBar(navController = rememberNavController())
    }
}