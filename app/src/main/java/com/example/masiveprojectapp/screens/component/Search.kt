package com.example.masiveprojectapp.screens.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun Search(modifier: Modifier = Modifier) {
    TextField(
        value = "",
        onValueChange = {},
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search",
                modifier = Modifier
                    .padding(start = 16.dp),
                tint = MaterialTheme.colorScheme.outline,
            )
        },
        shape = RoundedCornerShape(8.dp),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
        ),
        placeholder = {
            Text(
                text = "Search Items",
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.outline,
                modifier = Modifier
            )
        },
        modifier = modifier
            .border(
                width = 1.dp,
                color = Color("#D1D5DB".toColorInt()),
                shape = RoundedCornerShape(8.dp)
            )
            .fillMaxWidth()
            .height(50.dp)
    )
}

@Preview(showBackground = true)
@Composable
private fun SearchPreview() {
    MasiveProjectAppTheme(dynamicColor = false) {
        Search()
    }
}