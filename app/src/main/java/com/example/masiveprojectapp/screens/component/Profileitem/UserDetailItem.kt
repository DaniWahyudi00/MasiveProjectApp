package com.example.masiveprojectapp.screens.component.Profileitem

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.navigation.Screen
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily


@Composable
fun UserDetailItem(
    modifier: Modifier,
    navController : NavController

){ var name by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("")}
    var telephone by remember { mutableStateOf("")}
    var email by remember { mutableStateOf("")}
    var password by remember { mutableStateOf("")}
    var gender by remember { mutableStateOf("")}

    Column(
        modifier = Modifier
            .height(700.dp)
            .fillMaxWidth()
            .padding(23.dp)
    ) {
        Row (
            modifier = Modifier


        ) {
            Spacer(modifier = Modifier.width(24.dp))
            Image(
                painter = painterResource(id = R.drawable.user),
                contentDescription = null,
                modifier = Modifier
                    .clip(shape = CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(modifier = Modifier .weight(1f), text = "Hi, ", fontFamily = poppinsFontFamily)
            OutlinedTextField(
                value = "Richard Solikin",
                onValueChange = {name = it},
                label = { Text("name :")},
                singleLine = true,
                shape = RoundedCornerShape(8.dp),
                modifier = modifier
                    .padding(top = 35.dp)
                    .border(
                        width = 1.dp,
                        color = Color("#D1D5DB".toColorInt()),
                        shape = RoundedCornerShape(8.dp)
                    )

                    .fillMaxWidth(),
                colors = TextFieldDefaults.run {
                    colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                    )
                },
              )


        }

        Text(text = "Description : ",
            modifier = Modifier
                .padding(top = 10.dp),
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall,
        )
        OutlinedTextField(
            value = description,
            onValueChange = {description = it},
            maxLines = 3,
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done
            ),
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.run {
                colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                )
            },
            modifier = modifier
                .border(
                    width = 1.dp,
                    color = Color("#D1D5DB".toColorInt()),
                    shape = RoundedCornerShape(8.dp)
                )
//                .defaultMinSize(minHeight = 40.dp)
                .fillMaxWidth()
//                .height(70.dp)
                )

        Text(text = "Telephone :",
            modifier = Modifier
                .padding(top = 10.dp),
            fontSize = 15.sp,
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall
        )
        TextField(
            value = telephone,
            onValueChange = {telephone = it},
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done),
            singleLine = true,
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

        )
        Text(text = "Email :",
            modifier = Modifier
                .padding(top = 10.dp),
            fontSize = 15.sp,
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall
        )
        TextField(
            value = email,
            onValueChange = {email = it},
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done),
            singleLine = true,
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

        )
        Text(text = "Password :",
            modifier = Modifier
                .padding(top = 10.dp),
            fontSize = 15.sp,
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall
        )
        TextField(
            value = password,
            onValueChange = { password = it },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done),
            singleLine = true,
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
                    fontSize = 10.sp,
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

        )
        Text(text = "Gender :",
            modifier = Modifier
                .padding(top = 10.dp),
            fontSize = 15.sp,
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall
        )
        TextField(
            value = gender,
            onValueChange = { gender = it },
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done),
            singleLine = true,
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
        )

        Row (
            modifier = Modifier
                .fillMaxWidth()
        ){
        Button(modifier = Modifier
            .padding(top = 16.dp,
                end = 10.dp,
                start = 250.dp,
                bottom = 4.dp)
            .width(100.dp)
            .height(32.dp)
            .clickable {  },
            shape = RoundedCornerShape(4.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary)
            ,onClick = { navController.navigate(Screen.UserProfile.route) }) {
            Text(text = "Save", color = MaterialTheme.colorScheme.primary)
        }
        }
    }



}

@Preview(showBackground = true)
@Composable
private fun UserDetailItemPrev(){
    MasiveProjectAppTheme {
        UserDetailItem(modifier = Modifier, navController = rememberNavController())
    }
}