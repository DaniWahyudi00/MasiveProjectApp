package com.example.masiveprojectapp.screens.component.alertdialog.registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun AlertLoading() {
    Dialog(onDismissRequest = {  }) {

        Card(
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier,
        ) {
            Column(
                Modifier
                    .background(Color.White)
                    .padding(12.dp)
            ) {
                Text(
                    text = "Loading please wait",
                    Modifier
                        .padding(8.dp), textAlign = TextAlign.Center
                )

                CircularProgressIndicator(
                    color = MaterialTheme.colorScheme.primary,
                    strokeWidth = 4.dp,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(8.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun AlertLoadingPreview() {
    MasiveProjectAppTheme(
        dynamicColor = false
    ) {
        AlertLoading()
    }
}