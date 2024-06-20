package com.example.masiveprojectapp.screens.component.detailprodukitem

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
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
import com.example.masiveprojectapp.model.DetailProject
import com.example.masiveprojectapp.screens.component.alertdialog.AlertDeleteProduct
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily

@Composable
fun DetailProjectItem(
    detailproject: DetailProject,
    modifier: Modifier,
    navController: NavController

) {
    val openDialog = remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(start = 15.dp, end = 15.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(245.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.rumah1),
                contentDescription = null,
                modifier = Modifier.matchParentSize(),
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop  // or use ContentScale.FillBounds
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            detailproject.price,
            style = TextStyle(
                fontSize = 22.sp,
                lineHeight = 33.sp,
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight(800),
                color = Color(0xFF111928),

                ),
            modifier = Modifier
                .padding(top = 10.dp)
        )

        Text(
            detailproject.name,
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 18.sp,
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight(600),
                color = Color(0xFF111928),

                ),
            modifier = Modifier
                .padding(top = 10.dp)
        )

        Row() {
            Text(
                "Product Detail :",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 22.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF111928),

                    ),
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
            Text(": " + detailproject.owner, fontWeight = FontWeight.Light)
        }

        Row(
            modifier = Modifier
                .padding(top = 10.dp)

        ) {
            Text("Size house ", modifier = Modifier)
            Spacer(modifier = Modifier.padding(start = 15.dp))
            Text(": " + detailproject.roomarea, fontWeight = FontWeight.Light)
        }

        Row(

            modifier = Modifier
                .padding(top = 10.dp)

        ) {
            Text("Condition ", modifier = Modifier)
            Spacer(modifier = Modifier.padding(start = 20.dp))
            Text(": " + detailproject.condition, fontWeight = FontWeight.Light)


        }
        Text(
            "Project Deskripsi :",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.sp,
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight(600),
                color = Color(0xFF111928),

                ),
            modifier = Modifier.padding(top = 15.dp)
        )
        Text(
            detailproject.description,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier
                .padding(top = 15.dp)
                .fillMaxWidth(),
            fontWeight = FontWeight.Light
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        ) {

            Button(
                onClick = { openDialog.value },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF42C2C)),
                modifier = Modifier
                    .width(160.dp)
                    .height(37.dp)
                    .background(
                        color = Color(0xFFF42C2C),
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
                        color = Color(0xFFFFFFFF),

                        textAlign = TextAlign.Center,
                    )
                )
            }

            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5E8451)),
                modifier = Modifier
                    .width(160.dp)
                    .height(37.dp)
                    .background(
                        color = Color(0xFF5E8451),
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
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Center,
                    )
                )
            }
        }
        if (openDialog.value) {
            AlertDeleteProduct(onDismiss = { openDialog.value = false }, onConfirm = {})
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailProjectItemPreview() {
    MasiveProjectAppTheme {
        DetailProjectItem(
            detailproject = DetailProject(
                1,
                "Modern Home",
                "Rivza",
                "Rp xxx.xxx.xxx",
                "10 X 10 M",
                "Ini Berisi Deskripsi Project",
                "Perfect"
            ), modifier = Modifier, navController = rememberNavController()
        )
    }
}