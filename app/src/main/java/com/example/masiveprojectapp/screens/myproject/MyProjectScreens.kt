package com.example.masiveprojectapp.screens.myproject

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.masiveprojectapp.navigation.Screen
import com.example.masiveprojectapp.screens.myproject.myprojecitem.myprojectitem

@Composable
fun MyProjectScreens (
        navController: NavController,
        modifier: Modifier = Modifier
    ) {
    MyProjectContents(
            navController = navController,
            modifier = Modifier,
            onFabClick = { navController.navigate(Screen.AddProject.route) }
        )
    }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyProjectContents(
        navController: NavController,
        modifier: Modifier = Modifier,
        onFabClick: () -> Unit,
    ) {
        Scaffold(

            floatingActionButton = {
                FloatingActionButton(onClick = onFabClick) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "Add Icon")
                }
            }
        ) { innerPadding ->
            LazyColumn(
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier.padding(innerPadding)
            ) {
                item(1) {
                    myprojectitem(navController)
                }
                }
            }
        }

