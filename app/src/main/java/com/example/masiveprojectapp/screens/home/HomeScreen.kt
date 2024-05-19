package com.example.masiveprojectapp.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.masiveprojectapp.screens.component.HomeSection
import com.example.masiveprojectapp.screens.component.ImageSlider
import com.example.masiveprojectapp.screens.component.SearchBar
import com.example.masiveprojectapp.screens.desain.DesainScreen
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .background(color = MaterialTheme.colorScheme.background)
            ) {
                SearchBar()
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
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
                    DesainScreen()
                }
            )
            HomeSection(
                title = "Rekomendasi Arsitek",
                content = {
                    DesainScreen()
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