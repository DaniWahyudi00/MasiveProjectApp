package com.example.masiveprojectapp.screens.registration

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily

@Composable
fun LoginScreen(
    navigateToHome: () -> Unit,
    navigateToSignUp: () -> Unit,
    navigateToForgotPassword: () -> Unit
) {

    var text by remember { mutableStateOf("") }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.padding(top = 59.dp),
            text = "Hi, Welcome! \uD83D\uDC4B",
            style = TextStyle(
                fontSize = 30.sp,
                lineHeight = 39.sp,
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight(700),
                color = Color(0xFF000000)
            )
        )

        Spacer(modifier = Modifier.height(70.dp))

        Column (
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.width(320.dp)
        ){
            Text(text = "Email Address")

            CustomOutlinedTextField(
                label = "Your Email Address",
                onValueChange = { newText -> text = newText }
            )

            Spacer(modifier = Modifier.height(22.dp))

            Text(text = "Password")

            CustomOutlinedTextField(
                label = "Password",
                onValueChange = { newText -> text = newText }
            )

            Spacer(modifier = Modifier.height(16.dp))
        }

        Column (
            horizontalAlignment = Alignment.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 15.dp)
        ){
            Text(
                text = "Forgot password?",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 17.5.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF000000),
                ),
                modifier = Modifier
                    .clickable {
                        navigateToForgotPassword()
                    }
            )
        }

        Spacer(modifier = Modifier.height(65.dp))

        Button(
            onClick = navigateToHome,
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5E8451)),
            modifier = Modifier
                .width(320.dp)
                .height(56.dp)
                .background(color = Color(0xFF5E8451), shape = RoundedCornerShape(size = 10.dp))
        ) {
            Text(
                text = "Log In",
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 20.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),
                )
            )
        }

        Spacer(modifier = Modifier.height(38.dp))

        Row (
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ){
            Divider(
                thickness = 1.dp,
                color = Color.Black,
                modifier = Modifier
                    .width(92.dp)
                    .background(color = Color(0xFFD8DADC))
                    .padding(end = 20.dp)
            )

            Text(text = "or Log In with")

            Divider(
                thickness = 1.dp,
                color = Color.Black,
                modifier = Modifier
                    .width(92.dp)
                    .background(color = Color(0xFFD8DADC))
                    .padding(start = 20.dp)
            )
        }

        Spacer(modifier = Modifier.height(38.dp))

        Row (
            horizontalArrangement = Arrangement.spacedBy(15.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ){
            Image(
                painter = painterResource(id = R.drawable.facebook),
                contentDescription = "facebook_Icon",
                modifier = Modifier.width(150.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "google_Icon",
                modifier = Modifier.width(150.dp)
            )
        }

        Spacer(modifier = Modifier.height(42.dp))

        Row (
            horizontalArrangement = Arrangement.spacedBy(15.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ){
            Text(
                text = "Don’t have an account?",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 17.5.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight(400),
                    color = Color(0xB2000000),
                )
            )

            Text(
                text = "Sign Up",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 17.5.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF5E8451),
                ),
                modifier = Modifier
                    .clickable {
                        navigateToSignUp()
                    }
            )
        }

    }
}

@Composable
private fun CustomOutlinedTextField(label: String, onValueChange: (String) -> Unit) {
    val textState = remember { mutableStateOf("") }
    val isLabelVisible = textState.value.isEmpty()

    OutlinedTextField(
        value = textState.value,
        onValueChange = {
            textState.value = it
            onValueChange(it)
        },
        label = { if (isLabelVisible) Text (text = label) },
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
        keyboardActions = KeyboardActions(onDone = { /* Handle action done if needed */ }),
        modifier = Modifier.fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
private fun LoginScreenPreview() {
    LoginScreen(
        navigateToHome = {},
        navigateToSignUp = {},
        navigateToForgotPassword = {}
    )
}