package com.example.masiveprojectapp.screens.detailproduct

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.model.DetailProject
import com.example.masiveprojectapp.screens.component.detailprodukitem.DetailProjectItem

@Composable
fun DetailProductItem(
) {

    Scaffold(containerColor = MaterialTheme.colorScheme.background,)
    { innerPadding ->
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(innerPadding).fillMaxWidth()
        ) {
            DetailProjectItem(
                modifier = Modifier.padding(top = 30.dp), navController = rememberNavController(),detailproject = DetailProject(1,"Modern Home","Rivza","Rp xxx.xxx.xxx","10 X 10 M","Ini Berisi Deskripsi Project", "Perfect")  )
        }
    }
}