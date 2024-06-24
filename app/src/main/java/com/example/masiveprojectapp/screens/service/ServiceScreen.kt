package com.example.masiveprojectapp.screens.service

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.screens.component.ArsitekItem2
import com.example.masiveprojectapp.screens.component.DesainItem
import com.example.masiveprojectapp.screens.component.SearchBar
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ServiceScreen(
    navigateToDetail: (String) -> Unit,
    navController: NavController
) {
    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .background(color = MaterialTheme.colorScheme.background)
            ) {
                SearchBar(navController)
            }
        }
    ) { innerPadding ->
        val category by remember {
            mutableStateOf(
                listOf(
                    "Arsitek",
                    "Desain"
                )
            )
        }

        val coroutineScope = rememberCoroutineScope()

        val pagerState = rememberPagerState(pageCount = {
            category.size
        })
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .clip(RoundedCornerShape(8.dp))
        ) {
            TabRow(
                containerColor = Color.Transparent,
                divider = {},
                selectedTabIndex = pagerState.currentPage,
                indicator = {},
                modifier = Modifier
                    .padding(start = 16.dp)
                    .width(200.dp)
            ) {
                val tabItem = category
                tabItem.forEachIndexed { index, _ ->
                    Tab(
                        modifier = Modifier
                            .background(
                                color = if (index == pagerState.currentPage) {
                                    MaterialTheme.colorScheme.primary
                                } else {
                                    MaterialTheme.colorScheme.background
                                },
                                shape = RoundedCornerShape(10.dp)
                            ),
                        selected = index == pagerState.currentPage,
                        text = {
                            if (index == pagerState.currentPage){
                                Text(
                                    text = category[index],
                                    fontFamily = poppinsFontFamily,
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold
                                )
                            } else {
                                Text(
                                    text = category[index],
                                    color = Color.Black,
                                    fontFamily = poppinsFontFamily
                                )
                            }
                        },
                        onClick = {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(index)
                            }
                        }
                    )
                }
            }
            HorizontalPager(
                state = pagerState,
                userScrollEnabled = false
            ) { page ->
                Box(modifier = Modifier.fillMaxHeight()){
                    when(page) {
                        0 -> {
                            LazyVerticalGrid(
                                modifier = Modifier
                                    .padding(
                                        start = 16.dp,
                                        end = 16.dp,
                                        top = 16.dp,
                                    )
                                    .fillMaxSize(),
                                verticalArrangement = Arrangement.spacedBy(8.dp),
                                horizontalArrangement = Arrangement.spacedBy(8.dp),
                                columns = GridCells.Adaptive(161.dp),
                            ) {
                                items(20){
                                    ArsitekItem2(
                                        modifier = Modifier
                                            .clickable {
                                                navigateToDetail("arsitek")
                                            }
                                    )
                                }
                            }
                        }
                        1 -> {
                            LazyVerticalGrid(
                                modifier = Modifier
                                    .padding(
                                        start = 16.dp,
                                        end = 16.dp,
                                        top = 16.dp,
                                    )
                                    .fillMaxSize(),
                                verticalArrangement = Arrangement.spacedBy(8.dp),
                                horizontalArrangement = Arrangement.spacedBy(8.dp),
                                columns = GridCells.Adaptive(161.dp),
                            ) {
                                items(20){
                                    DesainItem(
                                        modifier = Modifier
                                            .clickable {
                                                navigateToDetail("desain")
                                            }
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    MasiveProjectAppTheme(dynamicColor = false) {
        ServiceScreen(
            navigateToDetail = {}, navController = rememberNavController()
        )
    }
}