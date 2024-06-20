package com.example.masiveprojectapp.screens.component.Profileitem

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
import com.example.masiveprojectapp.screens.component.alertdialog.AlertChangeProfile
import com.example.masiveprojectapp.screens.component.alertdialog.AlertProfileLogout
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
    val openDialog = remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .height(700.dp)
            .fillMaxWidth()
            .padding(23.dp)
    ) {
        Row (
            modifier = Modifier
                .background(color = Color.White)
                .clip(RoundedCornerShape(8.dp))
        ) {
            Spacer(modifier = Modifier.width(15.dp))
            Box(
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp, start = 10.dp)
                    .shadow(5.dp, shape = CircleShape)
                    .size(100.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color.White)
            ) {
                Box(
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 10.dp, start = 10.dp, end = 10.dp)
                        .size(100.dp)
                        .clip(shape = CircleShape)
                        .background(color = Color.Gray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.user),
                        contentDescription = "User_photo",
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(100.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier
                    .padding(top = 30.dp)
                    .width(200.dp)
            ) {
                Text(
                    modifier = Modifier,
                    text = "Richard Solikin",
                    fontSize = 14.sp,
                    fontFamily = poppinsFontFamily
                )
                Text(
                    modifier = Modifier,
                    text = "richardsolikin@gmail.com",
                    fontSize = 12.sp,
                    fontFamily = poppinsFontFamily
                )

            }
        }

        Text(text = "Description : ",
            modifier = Modifier
                .padding(top = 10.dp),
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall,
        )
        Row(

            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .background(Color.White)
                .height(42.dp)
                .width(335.dp)
                .clickable { navController.navigate(Screen.UserProfile.route) }
                .clip(
                    RoundedCornerShape(15.dp),
                )
        ) {
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                painter = painterResource(id = R.drawable.icon_document),
                contentDescription = stringResource(id = R.string.Profile_Menu),
            )

            Spacer(modifier = Modifier.width(16.dp))
            Text(modifier = Modifier.weight(1f), text = "Description", fontFamily = poppinsFontFamily,
                style = MaterialTheme.typography.bodyMedium
            )

        }

        Text(text = "Telephone :",
            modifier = Modifier
                .padding(top = 10.dp),
            fontSize = 15.sp,
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall
        )
        Row(

            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .background(Color.White)
                .height(42.dp)
                .width(335.dp)
                .clickable { navController.navigate(Screen.UserProfile.route) }
                .clip(
                    RoundedCornerShape(15.dp),
                )
        ) {
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                painter = painterResource(id = R.drawable.icon_telephone),
                contentDescription = stringResource(id = R.string.Profile_Menu),
            )

            Spacer(modifier = Modifier.width(16.dp))
            Text(modifier = Modifier.weight(1f), text = "Description", fontFamily = poppinsFontFamily,
                style = MaterialTheme.typography.bodyMedium
            )

        }
        Text(text = "Email :",
            modifier = Modifier
                .padding(top = 10.dp),
            fontSize = 15.sp,
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall
        )
        Row(

            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .background(Color.White)
                .height(42.dp)
                .width(335.dp)
                .clickable { navController.navigate(Screen.UserProfile.route) }
                .clip(
                    RoundedCornerShape(15.dp),
                )
        ) {
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                painter = painterResource(id = R.drawable.icon_email),
                contentDescription = stringResource(id = R.string.Profile_Menu),
            )

            Spacer(modifier = Modifier.width(16.dp))
            Text(modifier = Modifier.weight(1f), text = "Description", fontFamily = poppinsFontFamily,
                style = MaterialTheme.typography.bodyMedium
            )

        }
        Text(text = "Password :",
            modifier = Modifier
                .padding(top = 10.dp),
            fontSize = 15.sp,
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall
        )
        Row(

            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .background(Color.White)
                .height(42.dp)
                .width(335.dp)
                .clickable { navController.navigate(Screen.UserProfile.route) }
                .clip(
                    RoundedCornerShape(15.dp),
                )
        ) {
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                painter = painterResource(id = R.drawable.icon_pencil_profile),
                contentDescription = stringResource(id = R.string.Profile_Menu),
            )

            Spacer(modifier = Modifier.width(16.dp))
            Text(modifier = Modifier.weight(1f), text = "*******", fontFamily = poppinsFontFamily,
                style = MaterialTheme.typography.bodyMedium
            )

        }
        Text(text = "Gender :",
            modifier = Modifier
                .padding(top = 10.dp),
            fontSize = 15.sp,
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall
        )
        Row(

            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .background(Color.White)
                .height(42.dp)
                .width(335.dp)
                .clickable { navController.navigate(Screen.UserProfile.route) }
                .clip(
                    RoundedCornerShape(15.dp),
                )
        ) {
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                painter = painterResource(id = R.drawable.icon_user_profile),
                contentDescription = stringResource(id = R.string.Profile_Menu),
            )

            Spacer(modifier = Modifier.width(16.dp))
            Text(
                modifier = Modifier.weight(1f), text = "*******", fontFamily = poppinsFontFamily,
                style = MaterialTheme.typography.bodyMedium
            )
        }

        Row (
            modifier = Modifier
                .fillMaxWidth()
        ){
            Button(modifier = Modifier
                .clickable { openDialog.value = true }
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
        if (openDialog.value){
            AlertChangeProfile(onDismiss = {}, onConfirm = { openDialog.value = false})
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