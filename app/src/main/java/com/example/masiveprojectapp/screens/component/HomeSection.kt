package com.example.masiveprojectapp.screens.component

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

@Composable
fun HomeSection(
    title: String,
    showIcon: Boolean = true,
    content: @Composable () -> Unit,
) {
    Column {
        SectionText(
            text = title,
            showIcon = showIcon
        )
        content()
    }
}