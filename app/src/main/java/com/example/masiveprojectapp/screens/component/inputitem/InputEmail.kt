package com.example.masiveprojectapp.screens.component.inputitem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily


@Composable
fun InputEmail(){
    var text by remember { mutableStateOf("") }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomOutlinedTextFieldInput(
            label = "Name",
            onValueChange = { newText -> text = newText }
        )
        Spacer(modifier = Modifier.height(44.dp))

        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5E8451)),
            modifier = Modifier
                .width(320.dp)
                .height(56.dp)
                .background(color = Color(0xFF5E8451), shape = RoundedCornerShape(size = 10.dp))
        ) {
            Text(
                text = "Save",
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 20.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),
                )
            )
        }
    }

}

@Composable
private fun CustomOutlinedTextFieldInput(label: String, onValueChange: (String) -> Unit) {
    val textState = remember { mutableStateOf("") }
    val isLabelVisible = textState.value.isEmpty()

    OutlinedTextField(
        value = textState.value,
        onValueChange = {
            textState.value = it
            onValueChange(it)
        },
        label = { if (isLabelVisible) Text(text = label) },
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
        keyboardActions = KeyboardActions(onDone = { /* Handle action done if needed */ }),
        modifier = Modifier.fillMaxWidth()
    )
}