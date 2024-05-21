package com.example.masiveprojectapp.screens.component.transaction

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily

@Composable
fun TransactionScreen(
    modifier: Modifier = Modifier,
) {
//    Box(
//        modifier = Modifier.fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ) {
//        Text(text = "Transaction Screen")
//    }
Column {
    Row(
        modifier = Modifier
            .width(330.dp)
    ){
        Text(modifier = Modifier .weight(1f),text = "Allisa Gerrand", fontFamily = poppinsFontFamily,)
        Text(modifier = Modifier ,text = "Progres", fontFamily = poppinsFontFamily, style = MaterialTheme.typography.bodySmall )
    }

    Column (
        modifier = Modifier ,
    ) {
        Row(modifier = Modifier
            .width(298.dp)
            .height(63.dp)
            .align(Alignment.CenterHorizontally)
        ) {
            Image(painter = painterResource(id = R.drawable.project1),
                contentDescription = null,
                modifier = Modifier )
        }
    }
    }
}


@Preview(showBackground = true)
@Composable
private fun TransactionScreenPrev(){
    MasiveProjectAppTheme {
        TransactionScreen()
    }
}