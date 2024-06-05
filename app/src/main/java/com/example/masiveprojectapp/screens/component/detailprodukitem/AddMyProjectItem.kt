package com.example.masiveprojectapp.screens.component.detailprodukitem

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily

@Composable
fun AddMyProjectItem (
    onDismiss : () -> Unit,
    onConfirm : () -> Unit,
    modifier: Modifier,
    navController: NavController

){ var price by remember { mutableStateOf("")}
    var name by remember { mutableStateOf("")}
    var owner by remember { mutableStateOf("")}
    var size by remember { mutableStateOf("") }
    var condition by remember { mutableStateOf("") }
    val openDialog by remember { mutableStateOf(false)}
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(start = 10.dp, end = 10.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.rumah1), contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(),
            alignment = Alignment.Center,


            )
        Text("Masukkan harga Project :", style = MaterialTheme.typography.bodyLarge)
        OutlinedTextField(
            value = price,
            onValueChange = { price = it },
            singleLine = true,
            textStyle = LocalTextStyle.current.copy(fontSize = 16.sp),
            label = { Text("Price :") },
            modifier = Modifier
                .fillMaxWidth()

        )
        Text("Masukkan nama Project :", style = MaterialTheme.typography.bodyLarge)
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            singleLine = true,
            label = { Text("Name Project :") },
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            "Product Detail :", style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier
                .padding(top = 15.dp)
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),

        ) {
            Text("Owner :", modifier = Modifier)
            Spacer(modifier = Modifier.padding(start = 50.dp))
            OutlinedTextField(
                singleLine = true,
                value = owner,
                onValueChange = { owner = it },
                label = { Text("Owner :") },

                )
        }
        Row(
            modifier = Modifier
                .padding(top = 10.dp)

        ) {
            Text("Size house :", modifier = Modifier)
            Spacer(modifier = Modifier.padding(start = 15.dp))
            OutlinedTextField(
                value = size,
                singleLine = true,
                onValueChange = { size = it },
                label = { Text("Size: ")}

            )
        }
        Row(

            modifier = Modifier
                .padding(top = 10.dp)

        ) {
            Text("Condition :", modifier = Modifier)
            Spacer(modifier = Modifier.padding(start = 20.dp))
            OutlinedTextField(
                value = condition,
                singleLine = true,
                onValueChange = { condition = it },
                label = { Text("Condition :") },

                )
        }
        Text(
            "Project Deskripsi :",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(top = 15.dp)
        )
        OutlinedTextField(
            value = price,
            onValueChange = { price = it },
            singleLine = true,
            label = { Text("Description :") },
            maxLines = 4,

            modifier = Modifier
                .fillMaxWidth()
        )
//        Text("Masukkan harga Project :", style = MaterialTheme.typography.bodyLarge)
//        OutlinedTextField(
//            value = price,
//            onValueChange = { price = it },
//            singleLine = true,
//            label = { Text("Price :") },
//            modifier = Modifier
//                .fillMaxWidth()
//        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth() .padding(top = 15.dp)
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
                    text = "Save",
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



@Preview(showBackground = true)
@Composable
fun DetailProdukItemPreview(){
    MasiveProjectAppTheme {
        AddMyProjectItem(modifier = Modifier, navController = rememberNavController(),
            onConfirm = {}, onDismiss = {})
    }
}