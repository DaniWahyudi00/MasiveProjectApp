package com.example.masiveprojectapp.screens.registration.login

import android.util.Log
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
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
import com.example.masiveprojectapp.data.Constant.ServerClient
import com.example.masiveprojectapp.data.local.UserData
import com.example.masiveprojectapp.screens.component.alertdialog.registration.AlertLoading
import com.example.masiveprojectapp.screens.component.alertdialog.registration.AlertSuccess
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily
import com.example.masiveprojectapp.utils.SessionPreferences
import com.example.masiveprojectapp.utils.dataStore
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.GoogleAuthProvider
import kotlinx.coroutines.launch

@Composable
fun LoginScreen(
    navigateToHome: () -> Unit,
    navigateToSignUp: () -> Unit,
    navigateToForgotPassword: () -> Unit,
    viewModel: LoginViewModel = hiltViewModel()
) {
    val googleSignState = viewModel.googleState.value

    val launcher =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.StartActivityForResult()) {
            val account = GoogleSignIn.getSignedInAccountFromIntent(it.data)
            try {
                val result = account.getResult(ApiException::class.java)
                val credential = GoogleAuthProvider.getCredential(result.idToken, null)
                viewModel.googleSignIn(credential)
            } catch (it: ApiException) {
                println(it)
            }
        }

    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    val state by viewModel.loginState.collectAsState(initial = null)
    var showDialogSuccess by remember { mutableStateOf(false) }
    var showDialogLoading by remember { mutableStateOf(false) }

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
                onValueChange = {
                    password = it
                    passwordError = password.length < 8
                },
                value = password,
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
                errorMessage = "Password must be at least 8 characters",
                isError = passwordError,
                visualTransformation = if (passwordVisibility) VisualTransformation.None
                else PasswordVisualTransformation(),
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
            onClick = {
                scope.launch {
                    val trimmedEmail = email.trim()
                    val trimmedPassword = password.trim()
                    viewModel.loginUser(trimmedEmail, trimmedPassword)
                }
            },
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
                modifier = Modifier
                    .width(150.dp)
                    .clickable {
                        val gso = GoogleSignInOptions
                            .Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                            .requestEmail()
                            .requestIdToken(ServerClient)
                            .build()
                        val googleSignInClient = GoogleSignIn.getClient(context, gso)
                        launcher.launch(googleSignInClient.signInIntent)
                    }
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

    if (googleSignState.loading) {
        AlertLoading()
    }

    LaunchedEffect(key1 = googleSignState.success) {
        scope.launch {
            if (googleSignState.success != null) {
                showDialogSuccess = true
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
                navigateToHome()
            },
            onDismiss = {},
            text = "Sign In Success"
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
private fun LoginScreenPreview() {
    LoginScreen(
        navigateToHome = {},
        navigateToSignUp = {},
        navigateToForgotPassword = {}
    )
}