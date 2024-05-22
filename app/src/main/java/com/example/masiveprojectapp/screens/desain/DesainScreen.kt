package com.example.masiveprojectapp.screens.desain

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DesainScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Hallo"
                    )
                }
            )
        }
    ) {

    }
}

@Preview(showBackground = true)
@Composable
private fun DesainScreenPreview() {
    MasiveProjectAppTheme(dynamicColor = false) {
        DesainScreen()
    }
}