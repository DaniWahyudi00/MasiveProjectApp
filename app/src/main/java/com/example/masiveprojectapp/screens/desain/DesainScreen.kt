package com.example.masiveprojectapp.screens.desain

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.masiveprojectapp.screens.component.DesainItem
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun DesainScreen(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        modifier = Modifier
            .padding(
                start = 16.dp,
                end = 16.dp,
                top = 8.dp,
                bottom = 12.dp
            )
            .height(221.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        columns = GridCells.Adaptive(161.dp),
    ) {
        items(2){
            DesainItem()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DesainScreenPreview() {
    MasiveProjectAppTheme {
        DesainScreen()
    }
}