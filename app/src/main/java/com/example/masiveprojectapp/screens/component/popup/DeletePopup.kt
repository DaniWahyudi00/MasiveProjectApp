package com.example.masiveprojectapp.screens.component.popup

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun DeleteConfirm(

    title: String,
    message: String,
    message1: String,
    onCancel: ()-> Unit,
    onConfirm: ()->Unit,
//    confirmText: String = stringResource(id = R.string.confirm),
//    cancelText: String = stringResource(id = R.string.app_cancel),
    modifier: Modifier = Modifier
){
    Column(
        modifier = Modifier
            .width(347.dp)
            .height(225.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = title,
            style = MaterialTheme.typography.headlineMedium,

            )
        Text(text = message,
            style = MaterialTheme.typography.bodyMedium)
        Text(text = message1,
            style = MaterialTheme.typography.bodyMedium)
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ){
            Button(onClick = onCancel,
                colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
                modifier = Modifier
                    .width(128.dp)
                    .height(40.dp)
                    .padding(start = 10.dp)
                    .weight(1f)) {
                Text(text = "Cancel", color = Color.Black)
                
            }
            Button(onClick = onConfirm,
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                modifier = Modifier
                    .width(128.dp)
                    .height(40.dp)
                    .padding(end = 10.dp)
                    .weight(1f)) {
                Text(text = "Delete")
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
private fun Popupprev(){
    
    MasiveProjectAppTheme {
        DeleteConfirm(
            title = "Confirmation",
            message = "You are Going to Delete your accunt",
            message1 = "You won't be able to restore your data",
            onCancel = { /*TODO*/ }, onConfirm = { /*TODO*/ })
    }
}



