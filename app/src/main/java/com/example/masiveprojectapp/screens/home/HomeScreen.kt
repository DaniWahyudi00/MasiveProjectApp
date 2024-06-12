package com.example.masiveprojectapp.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.masiveprojectapp.screens.component.ArsitekItem2
import com.example.masiveprojectapp.screens.component.DesainItem
import com.example.masiveprojectapp.screens.component.HomeSection
import com.example.masiveprojectapp.screens.component.ImageSlider
import com.example.masiveprojectapp.screens.component.SearchBar
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun HomeScreen(
    navigateToSeeAll: (String) -> Unit,
    navigateToDetail: (String) -> Unit
) {
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
                showIcon = false,
                title = "Hallo Users!",
                content = {
                    ImageSlider()
                },
                navigateToSeeAll = {}
            )
            HomeSection(
                title = "Rekomendasi Desain",
                content = {
                    LazyVerticalGrid(
                        modifier = Modifier
                            .padding(
                                start = 16.dp,
                                end = 16.dp,
                                top = 8.dp,
                                bottom = 12.dp
                            )
                            .height(243.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        columns = GridCells.Adaptive(161.dp),
                    ) {
                        items(2){
                            DesainItem(
                                modifier = Modifier
                                    .clickable {
                                        navigateToDetail("desain")
                                    }
                            )
                        }
                    }
                },
                navigateToSeeAll = {
                    navigateToSeeAll("desain")
                }
            )
            HomeSection(
                title = "Rekomendasi Arsitek",
                content = {
                    LazyVerticalGrid(
                        modifier = Modifier
                            .padding(
                                start = 16.dp,
                                end = 16.dp,
                                top = 8.dp,
                            )
                            .height(340.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        columns = GridCells.Adaptive(161.dp),
                    ) {
                        items(2){
                            ArsitekItem2(
                                modifier = Modifier
                                    .clickable {
                                        navigateToDetail("arsitek")
                                    }
                            )
                        }
                    }
                },
                navigateToSeeAll = {
                    navigateToSeeAll("arsitek")
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    MasiveProjectAppTheme(dynamicColor = false) {
        HomeScreen(
            navigateToSeeAll = {},
            navigateToDetail = {}
        )
    }
}