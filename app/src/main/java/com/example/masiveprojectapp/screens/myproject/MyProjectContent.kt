package com.example.masiveprojectapp.screens.myproject

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyProjectContent(
    header: String,
    title: String,
    desc: String,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
    onTitleChange: (String) -> Unit = {},
    onDescChange: (String) -> Unit = {},
    onSaveFileClick: () -> Unit = {},
    readOnly: Boolean = false,
) {
}

@Composable
fun OutlinedTextFieldStyle(value: String, onValueChange: (String) -> Unit, label: String, readOnly: Boolean, modifier: Modifier) {

}
