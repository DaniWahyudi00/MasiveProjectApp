package com.example.masiveprojectapp.screens.component.popup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme


@Composable
fun DonePopup(
    modifier: Modifier,
    onConfirm: ()->Unit,
    message: String,
    title: String,
){

    Column(
        modifier = Modifier
            .width(347.dp)
            .height(194.dp)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = title,
            style = MaterialTheme.typography.headlineMedium,
            )

        Text(text = message,
            style = MaterialTheme.typography.bodyMedium)
            Button(onClick = onConfirm,
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                modifier = Modifier
                    .height(40.dp)
                    .padding(end = 10.dp)) {
                Text(text = "Done")
            }
        }
    }


@Preview(showBackground = true)
@Composable
private fun DonePrev(){

    MasiveProjectAppTheme {
        DonePopup(modifier = Modifier, onConfirm = { /*TODO*/ }, message = "Your project has been successfully added", title = "Done !" )
    }
}