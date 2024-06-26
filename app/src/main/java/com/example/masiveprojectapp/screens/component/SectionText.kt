package com.example.masiveprojectapp.screens.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun SectionText(
    text: String,
    showIcon: Boolean,
    navigateToSeeAll: () -> Unit
) {
    Row(
        modifier = Modifier
            .padding(
                start = 16.dp,
                end = 16.dp
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .weight(1f),
            fontSize = 12.sp
        )
        if (showIcon) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = "Arrow",
                modifier = Modifier.clickable {
                    navigateToSeeAll()
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SectionTextPreview() {
    MasiveProjectAppTheme(dynamicColor = false) {
        SectionText("Rekomendasi Desain", true, {})
    }
}