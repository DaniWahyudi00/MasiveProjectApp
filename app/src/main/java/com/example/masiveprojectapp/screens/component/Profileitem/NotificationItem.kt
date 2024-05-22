package com.example.masiveprojectapp.screens.component.Profileitem

import android.app.Notification
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun NotificationItem() {


    Column(

    ) {

        Image(
            painter = painterResource(id = R.drawable.icon_notification),
            contentDescription = "notif",
            modifier = Modifier
                .padding(top = 20.dp)
        )
        Text(text = "No Notification Right Now!")
        Text(text = "Your'e up-to-date")

        Button(onClick = { /*TODO*/ }) {
        Text(text = "Home Page")
        
    }
    }
}


@Preview(showBackground = true)
@Composable
private fun NotificationPrev(){

    MasiveProjectAppTheme {
        NotificationItem()
    }
}