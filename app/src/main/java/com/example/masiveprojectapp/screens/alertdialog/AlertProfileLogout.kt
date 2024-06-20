package com.example.masiveprojectapp.screens.alertdialog

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily

@Composable
fun AlertProfileLogout(
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(dismissOnClickOutside = false)
    ) {
        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier.fillMaxWidth()

        ) {
            Column(
                modifier = Modifier
                    .size(width = 347.dp, height = 273.dp)
                    .padding(top = 50.dp, bottom = 0.dp, start = 0.dp, end = 0.dp)
                    .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 19.dp)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = R.drawable.warning),
                    contentDescription = "warning",
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp)
                        .offset(y = (-30).dp)
                )

                Text(
                    text = "Quit Builder Home?",
                    style = TextStyle(
                        fontSize = 19.sp,
                        lineHeight = 27.sp,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight(700),
                        color = Color(0xFF202020),
                        textAlign = TextAlign.Center,
                    ),
                    modifier = Modifier
                        .offset(y = (-30).dp)
                )

                Text(
                    text = "Are you sure you are logging out of your\nhome builder account?",
                    style = TextStyle(
                        fontSize = 13.sp,
                        lineHeight = 20.sp,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),

                        textAlign = TextAlign.Center,
                    ),
                    modifier = Modifier
                        .offset(y = (-30).dp)
                )

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth().offset(y = (-20).dp)
                ) {
                    Button(
                        onClick = onDismiss,
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD9D9D9)),
                        modifier = Modifier
                            .width(128.dp)
                            .height(40.dp)
                            .background(
                                color = Color(0xFFD9D9D9),
                                shape = RoundedCornerShape(size = 11.dp)
                            )
                    ) {
                        Text(
                            text = "Cancel",
                            style = TextStyle(
                                fontSize = 16.sp,
                                lineHeight = 25.sp,
                                fontFamily = poppinsFontFamily,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF000000),

                                textAlign = TextAlign.Center,
                            )
                        )
                    }

                    Button(
                        onClick = onConfirm,
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE30000)),
                        modifier = Modifier
                            .width(128.dp)
                            .height(40.dp)
                            .background(
                                color = Color(0xFFE30000),
                                shape = RoundedCornerShape(size = 11.dp)
                            )
                    ) {
                        Text(
                            text = "Delete",
                            style = TextStyle(
                                fontSize = 16.sp,
                                lineHeight = 25.sp,
                                fontFamily = poppinsFontFamily,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF000000),

                                textAlign = TextAlign.Center,
                            )
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun AlertDialogLogOutPreview() {
    AlertProfileLogout(
        onDismiss = { /* Preview action */ },
        onConfirm = { /* Preview action */ }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewAlertDialogLogOut() {
    AlertDialogLogOutPreview()
}