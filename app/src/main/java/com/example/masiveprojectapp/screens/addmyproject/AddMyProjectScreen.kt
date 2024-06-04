package com.example.masiveprojectapp.screens.addmyproject

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.screens.component.detailprodukitem.AddMyProjectItem
import com.example.masiveprojectapp.screens.myproject.myprojecitem.AddProjectScreens

@Composable
fun AddMyProjectScreen(
    navController: NavController = rememberNavController(),
//    modifier: Modifier = Modifier,
//    myprofils: List<MyprofilItem> = datadummy.MyprofilItems,
//    userprofiles : List<UsertItem> = datadummy.UsertItems

    ) {

    Scaffold(containerColor = MaterialTheme.colorScheme.background,)
    {
        innerPadding ->
        Column (verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(innerPadding).fillMaxWidth()) {
            AddMyProjectItem(modifier = Modifier, navController = rememberNavController())
        }
    }
}