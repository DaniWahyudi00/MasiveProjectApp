package com.example.masiveprojectapp.screens.component

import android.content.res.Resources.Theme
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily


@Composable
fun UserDetailItem(
    modifier: Modifier,

){
    Column(
        modifier = Modifier
            .height(700.dp)
            .fillMaxWidth()
            .padding(23.dp)
    ) {
        Row (
            modifier = Modifier
                .size(80.dp)

        ) {
            Image(
                painter = painterResource(id = R.drawable.user),
                contentDescription = null,
                modifier = Modifier
                    .height(80.dp)
                    .width(80.dp)
                    .clip(shape = CircleShape)
            )
            Spacer(modifier = Modifier .width(16.dp))
            Text(modifier = Modifier, text = "Hi Your name", fontFamily = poppinsFontFamily)
        }

        Text(text = "Description : ",
            modifier = Modifier
                .weight(0.5f)
                .height(13.dp)
                .padding(top = 17.dp),
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall,
        )
        TextField(
            value = "",
            onValueChange = {},
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.run {
                colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                )
            },
            placeholder = {
                Text(
                    text = "Deskripsi",
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.outline,
                    textAlign = TextAlign.Center,
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
                .height(70.dp))
        Text(text = "Telephone :",
            modifier = Modifier
                .padding(top = 29.dp),
            fontSize = 15.sp,
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall
        )
        TextField(
            value = "",
            onValueChange = {},
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.run {
                colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                )
            },
            placeholder = {
                Text(
                    text = "Telephone",
                    fontSize = 10.sp,
                    color = MaterialTheme.colorScheme.outline,
                    textAlign = TextAlign.Center,
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
                .height(45.dp))
        Text(text = "Email :",
            modifier = Modifier
                .padding(top = 29.dp),
            fontSize = 15.sp,
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall
        )
        TextField(
            value = "",
            onValueChange = {},
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.run {
                colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                )
            },
            placeholder = {
                Text(
                    text = "email@mail.com",
                    fontSize = 10.sp,
                    color = MaterialTheme.colorScheme.outline,
                    textAlign = TextAlign.Center,
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
                .height(45.dp))
        Text(text = "Password :",
            modifier = Modifier
                .padding(top = 29.dp),
            fontSize = 15.sp,
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall
        )
        TextField(
            value = "",
            onValueChange = {},
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.run {
                colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                )
            },
            placeholder = {
                Text(
                    text = "*********",
                    fontSize = 5.sp,
                    color = MaterialTheme.colorScheme.outline,
                    modifier = Modifier
                        .height(21.dp)
                )
            },
            modifier = modifier
                .border(
                    width = 1.dp,
                    color = Color("#D1D5DB".toColorInt()),
                    shape = RoundedCornerShape(8.dp)
                )
                .fillMaxWidth()
                .height(45.dp))
        Text(text = "Gender :",
            modifier = Modifier
                .padding(top = 29.dp),
            fontSize = 15.sp,
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall
        )
        TextField(
            value = "",
            onValueChange = {},
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.run {
                colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                )
            },
            placeholder = {
                Text(
                    text = "Gender",
                    fontSize = 10.sp,
                    color = MaterialTheme.colorScheme.outline,
                    textAlign = TextAlign.Center,
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
                .height(45.dp))

        Button(modifier = Modifier
            .padding(top = 16.dp,
                bottom = 4.dp)
            .width(100.dp)
            .height(32.dp)
            .clickable {  },
            shape = RoundedCornerShape(4.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary)
            ,onClick = { /*TODO*/ }) {
            Text(text = "Save", color = MaterialTheme.colorScheme.primary)
            
        }
    }



}

@Preview(showBackground = true)
@Composable
private fun UserDetailItemPrev(){
    MasiveProjectAppTheme {
        UserDetailItem(modifier = Modifier)
    }
}