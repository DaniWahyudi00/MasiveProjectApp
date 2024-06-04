package com.example.masiveprojectapp.screens.component.detailprodukitem

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.model.DetailProject
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun DetailProjectItem (
    detailproject : DetailProject,
    modifier: Modifier,
    navController: NavController

){
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
        Text(detailproject.price, style = MaterialTheme.typography.titleLarge,
            modifier = Modifier
                .padding(top = 10.dp)
        )

        Text(detailproject.name, style = MaterialTheme.typography.titleMedium,
            modifier = Modifier
                .padding(top = 10.dp)
        )
        Row () {
            Text(
                "Product Detail :", style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier
                    .padding(top = 15.dp)
            )
        }
        Row(
            modifier = Modifier
                .padding(top = 15.dp)

        ) {
            Text("Owner ", modifier = Modifier)
            Spacer(modifier = Modifier.padding(start = 50.dp))
            Text(": "+detailproject.owner, fontWeight = FontWeight.Light)

        }
        Row(
            modifier = Modifier
                .padding(top = 10.dp)

        ) {
            Text("Size house ", modifier = Modifier)
            Spacer(modifier = Modifier.padding(start = 15.dp))
            Text(": "+ detailproject.roomarea, fontWeight = FontWeight.Light)
        }
        Row(

            modifier = Modifier
                .padding(top = 10.dp)

        ) {
            Text("Condition ", modifier = Modifier)
            Spacer(modifier = Modifier.padding(start = 20.dp))
            Text(": "+ detailproject.condition, fontWeight = FontWeight.Light)


        }
        Text(
            "Project Deskripsi :",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(top = 15.dp)
        )
        Text(
            detailproject.description,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(top = 15.dp),
            fontWeight = FontWeight.Light
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
        Row(modifier = Modifier) {
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(
                        start = 10.dp,
                        top = 10.dp,
                        bottom = 8.dp
                    )
                    .align(alignment = Alignment.Top)
                    .width(150.dp)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.surface
                ),
                shape = RoundedCornerShape(4.dp)
            ) {

                Text(
                    text = "Cancel",
                    fontSize = 28.sp,
                    modifier = Modifier.padding(start = 6.dp)
                )
            }
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(
                        start = 50.dp,
                        top = 10.dp,
                        bottom = 8.dp
                    )
                    .align(alignment = Alignment.Top)
                    .width(150.dp)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.surface
                ),
                shape = RoundedCornerShape(4.dp)
            ) {

                Text(
                    text = "Save",
                    fontSize = 28.sp,
                    modifier = Modifier.padding(start = 6.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailProjectItemPreview(){
    MasiveProjectAppTheme {
        DetailProjectItem(detailproject = DetailProject(1,"Modern Home","Rivza","Rp xxx.xxx.xxx","10 X 10 M","Ini Berisi Deskripsi Project", "Perfect"), modifier = Modifier, navController = rememberNavController())
    }
}