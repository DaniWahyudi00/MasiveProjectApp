package com.example.masiveprojectapp.screens.component

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeSection(
    title: String,
    content: @Composable () -> Unit,
) {
    Column {
        SectionText(text = title)
        content()
    }
}