package com.example.masiveprojectapp.screens.registration.signup

import android.util.Log
import android.widget.Toast
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
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.screens.component.alertdialog.registration.AlertLoading
import com.example.masiveprojectapp.screens.component.alertdialog.registration.AlertSuccess
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily
import kotlinx.coroutines.launch

@Composable
fun SignUpScreen(
    viewModel: SignUpViewModel = hiltViewModel(),
    navigateToLogin: () -> Unit
) {

    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    val state by viewModel.signUpState.collectAsState(initial = null)
    var showDialogSuccess by remember { mutableStateOf(false) }
    var showDialogLoading by remember { mutableStateOf(false) }


    var username by rememberSaveable { mutableStateOf("") }
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var passwordError by remember { mutableStateOf(false) }
    var passwordVisibility by remember { mutableStateOf(false) }

    val icon = if (passwordVisibility)
        painterResource(R.drawable.ic_visibility)
    else
        painterResource(R.drawable.ic_visibility_off)


    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            modifier = Modifier.padding(top = 57.dp),
            text = "Sign Up",
            style = TextStyle(
                fontSize = 30.sp,
                lineHeight = 39.sp,
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight(700),
                color = Color(0xFF000000)
            )
        )

        Spacer(modifier = Modifier.height(50.dp))

        Column (
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.width(320.dp)
        ){
            Text(text = "Username")

            CustomOutlinedTextField(
                errorMessage = "",
                hint = "Enter your username",
                isError = false,
                value = username,
                trailingIcon = {},
                onValueChange = { newText -> username = newText },
            )

            Spacer(modifier = Modifier.height(22.dp))

            Text(text = "Email Address")

            CustomOutlinedTextField(
                value = email,
                hint = "Enter your email",
                onValueChange = { newText -> email = newText },
                trailingIcon = {},
                isError = false,
                errorMessage = ""
            )

            Spacer(modifier = Modifier.height(22.dp))

            Text(text = "Password")

            CustomOutlinedTextField(
                hint = "Enter your password",
                value = password,
                onValueChange = {
                    password = it
                    passwordError = password.length < 8
                },
                trailingIcon = {
                    Icon(
                        painter = icon,
                        contentDescription = null,
                        modifier = Modifier
                            .clickable {
                                passwordVisibility = !passwordVisibility
                            }
                    )
                },
                visualTransformation = if (passwordVisibility) VisualTransformation.None
                        else PasswordVisualTransformation(),
                isError = passwordError,
                errorMessage = "Password must be at least 8 characters"
            )

//            Spacer(modifier = Modifier.height(22.dp))
//
////            Text(text = "Confirm Password")
////
////            CustomOutlinedTextField(
////                label = "Confirm Password",
////                onValueChange = { newText -> text = newText }
////            )
        }

        Spacer(modifier = Modifier.height(44.dp))

        Button(
            onClick = {
                scope.launch {
                    val trimmedUsername = username.trim()
                    val trimmedEmail = email.trim()
                    val trimmedPassword = password.trim()
                    viewModel.registerUser(trimmedUsername, trimmedEmail, trimmedPassword)
                }
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5E8451)),
            modifier = Modifier
                .width(320.dp)
                .height(56.dp)
                .background(color = Color(0xFF5E8451), shape = RoundedCornerShape(size = 10.dp))
        ) {
            Text(
                text = "Sign Up",
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 20.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),
                )
            )
        }

        Spacer(modifier = Modifier.height(42.dp))

        Row (
            horizontalArrangement = Arrangement.spacedBy(15.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ){
            Text(
                text = "Already have an account?",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 17.5.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight(400),
                    color = Color(0xB2000000),
                )
            )

            Text(
                text = "Log In",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 17.5.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF5E8451),
                ),
                modifier = Modifier.clickable {
                    navigateToLogin()
                }
            )
        }
        LaunchedEffect(key1 = state) {
            scope.launch {
                if (state?.isError?.isNotEmpty() == true) {
                    showDialogLoading = false
                    val error = state?.isError
                    Toast.makeText(context, "$error", Toast.LENGTH_SHORT).show()
                    Log.d("Error coi", error.toString())
                } else if (state?.isSucces?.isNotEmpty() == true) {
                    showDialogSuccess = true
                } else if (state?.isLoading == true) {
                    Log.d("Loading", "Loading")
                    showDialogLoading = true
                }
            }
        }
    }

    if (showDialogLoading){
        AlertLoading()
    } else {
        showDialogLoading = false
    }

    if (showDialogSuccess){
        AlertSuccess(
            onConfirm = {
                navigateToLogin()
            },
            onDismiss = {},
            text = "Account has been created"
        )
    }
}

@Composable
fun CustomOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    trailingIcon: @Composable () -> Unit,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    isError: Boolean,
    errorMessage: String,
    hint: String = ""
) {
    val keyboardController = LocalSoftwareKeyboardController.current
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        placeholder =  {
            Text(
                text = hint,
                color = MaterialTheme.colorScheme.outline
            )
        },
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
        keyboardActions = KeyboardActions(onDone = {
            keyboardController?.hide()
        }),
        modifier = Modifier.fillMaxWidth(),
        trailingIcon = {
            trailingIcon()
        },
        visualTransformation = visualTransformation,
        textStyle = TextStyle(
            color = Color.Black,
            fontFamily = poppinsFontFamily,
            fontSize = 14.sp
        ),
        isError = isError,
        supportingText = {
            if (isError) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = errorMessage,
                    color = MaterialTheme.colorScheme.error
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
private fun SignUpPreview() {
    SignUpScreen {}
}