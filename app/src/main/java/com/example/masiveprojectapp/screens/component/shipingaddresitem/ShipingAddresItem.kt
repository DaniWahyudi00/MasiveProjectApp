package com.example.masiveprojectapp.screens.component.shipingaddresitem

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.navigation.Screen
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily


@Composable
fun ShipingAddressItem(
    modifier: Modifier,
    navController : NavController
) {
    var country by rememberSaveable { mutableStateOf("Indonesia") }
    var address by rememberSaveable { mutableStateOf("Jl. RS. Fatmawati Raya, Pondok Labu, Kec. Cilandak") }
    var town by rememberSaveable { mutableStateOf("Depok") }
    var province by rememberSaveable { mutableStateOf("Jawa Barat") }
    var pos by rememberSaveable { mutableStateOf("1240") }
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
            .background(color = Color(0xfff6f6f6))
            .padding(all = 15.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Shipping Address",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = (-0.22).sp
                )
            )
        }
        Text(text = "Country : ",
            modifier = Modifier
                .padding(top = 5.dp),
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall,
        )
        Row(

            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .clip(
                    RoundedCornerShape(15.dp),
                )
                .background(Color.White)
                .fillMaxWidth()
        ) {

            OutlinedTextField(
                value = country,
                onValueChange = {newText -> country = newText},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 10.dp,
                        vertical = 8.dp
                    )
            )

        }

        Text(text = "Address : ",
            modifier = Modifier
                .padding(top = 5.dp),
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall,
        )
        Row(

            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .clip(
                    RoundedCornerShape(15.dp),
                )
                .background(Color.White)
                .fillMaxWidth()
        ) {
            OutlinedTextField(
                value = address,
                onValueChange = {newText -> address = newText},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 10.dp,
                        vertical = 8.dp
                    )
            )

        }

        Text(text = "Town/City : ",
            modifier = Modifier
                .padding(top = 5.dp),
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall,
        )
        Row(

            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .clip(
                    RoundedCornerShape(15.dp),
                )
                .background(Color.White)
                .fillMaxWidth()
        ) {

            OutlinedTextField(
                value = town,
                onValueChange = {newText -> town = newText},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 10.dp,
                        vertical = 8.dp
                    )
            )

        }

        Text(text = "Province : ",
            modifier = Modifier
                .padding(top = 5.dp),
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall,
        )
        Row(

            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .clip(
                    RoundedCornerShape(15.dp),
                )
                .background(Color.White)
                .fillMaxWidth()
        ) {

            OutlinedTextField(
                value = province,
                onValueChange = {newText -> province = newText},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 10.dp,
                        vertical = 8.dp
                    )
            )

        }

        Text(text = "Pos Code : ",
            modifier = Modifier
                .padding(top = 5.dp),
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall,
        )
        Row(

            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .clip(
                    RoundedCornerShape(15.dp),
                )
                .background(Color.White)
                .fillMaxWidth()
        ) {

            OutlinedTextField(
                value = pos,
                onValueChange = {newText -> pos = newText},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 10.dp,
                        vertical = 8.dp
                    )
            )

        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp)
        ) {
            Button(
                onClick = { navController.navigateUp() },
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
                modifier = Modifier
                    .requiredWidth(width = 247.dp)
                    .requiredHeight(height = 41.dp)
                    .background(
                        color = MaterialTheme.colorScheme.primary,
                        shape = RoundedCornerShape(size = 11.dp)
                    )
            ) {
                Text(
                    text = "Save Changes",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 25.sp,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight(500),
                        textAlign = TextAlign.Center,
                    )
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun ShippingAdressPreview(){

    MasiveProjectAppTheme {
        ShipingAddressItem(modifier = Modifier, navController = rememberNavController())
    }
}
