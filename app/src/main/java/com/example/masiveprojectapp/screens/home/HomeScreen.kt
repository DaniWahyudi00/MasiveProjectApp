package com.example.masiveprojectapp.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.masiveprojectapp.screens.component.HomeSection
import com.example.masiveprojectapp.screens.component.ImageSlider
import com.example.masiveprojectapp.screens.component.SearchBar
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            SearchBar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
        ) {
            HomeSection(
                title = "Hallo Users!",
                content = {
                    ImageSlider()
                }
            )
            HomeSection(
                title = "Rekomendasi Desain",
                content = {

                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    MasiveProjectAppTheme(dynamicColor = false) {
        HomeScreen()
    }
}