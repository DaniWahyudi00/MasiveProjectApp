package com.example.masiveprojectapp.screens.component.transaction

import android.graphics.drawable.Icon
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily

@Composable
fun CheckOutItem(modifier: Modifier = Modifier,
                 navController: NavController,
                 navigateToContact: () -> Unit
                 ) {
    Column (modifier = Modifier
        .fillMaxHeight()
        .background(color = Color (0xfff6f6f6))
        .padding(10.dp)
    ){
        ShippingAddres(
            navController = navController,
            navigateToAdress = {navController.navigate(Screen.Address.route)},
            navigateToContact = {navigateToContact},
            modifier = Modifier
                .fillMaxWidth()
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp, bottom = 5.dp)
                .requiredHeight(height = 2.dp)
                .background(color = Color(0xffd9d9d9)))
        AddVoucher(modifier = Modifier
            .fillMaxWidth()
        )
        Item(modifier = Modifier
            .fillMaxWidth())

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp, bottom = 5.dp)
                .requiredHeight(height = 2.dp)
                .background(color = Color(0xffd9d9d9)))
        PaymentMethode(modifier = Modifier
            .fillMaxWidth())
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp, bottom = 5.dp)
                .requiredHeight(height = 2.dp)
                .background(color = Color(0xffd9d9d9)))
        PaymentDetail(modifier = Modifier
            .fillMaxWidth())
        ButtonPay(modifier = Modifier, onConfirm = {})

    }

}
@Composable
fun AddVoucher(modifier: Modifier = Modifier){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(topEnd = 10.dp, topStart = 10.dp))
            .background(color = Color.White)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(vertical = 6.dp)
        ) {
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Items",
                color = Color(0xff202020),
                lineHeight = 1.88.em,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                ),
            )

            OutlinedButton(
                modifier = Modifier
                    .padding(start = 170.dp),
                onClick = { },
                shape = RoundedCornerShape(11.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                border = BorderStroke(1.dp, Color(0xff8e5e24))
            ) {
                Text(
                    text = "Add Voucher",
                    color = Color(0xff8e5e24),
                    textAlign = TextAlign.Center,
                    lineHeight = 1.67.em,
                    style = TextStyle(
                        fontSize = 12.sp
                    )
                )
            }
        }
    }
}

@Composable
fun ShippingAddres(
    modifier: Modifier,
    navController: NavController,
    navigateToAdress: () -> Unit,
    navigateToContact: () -> Unit
    ){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Bottom,
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp))
            .background(color = Color.White)
            .padding(vertical = 6.dp)
    ) {
        Column (
            modifier
                .clickable {  navController.navigate(Screen.Address.route)}
        ){
            Row(){
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Shipping Address",
                    color = Color(0xff202020),
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = (-0.14).sp
                    )
                )
            }
            Row (
                modifier
            ) {
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Jl. RS. Fatmawati Raya, Pondok Labu, Kec. Cilandak, Kota Depok, Jawa Barat 12450",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 14.sp
                    ),
                    modifier = Modifier
                        .requiredWidth(width = 273.dp)
                )
                Spacer(modifier = Modifier.width(50.dp))
                Box(
                    modifier = Modifier
                        .requiredSize(size = 30.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.icon_pencil),
                        contentDescription = "edit_icon",
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {navController.navigate(Screen.Address.route)}
                    )
                }
            }
        }
    }
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Bottom,
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(bottomStart = 10.dp, bottomEnd = 10.dp))
            .background(color = Color.White)
            .padding(vertical = 6.dp)
            .clickable { navController.navigate(Screen.Contact.route) }
    ) {
        Column (
            modifier.clickable {  navController.navigate(Screen.Address.route)}
        ){
            Row(){
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Contact Information",
                    color = Color(0xff202020),
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = (-0.14).sp
                    )
                )
            }
            Row {
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "(+62)xxx-xxxx-xxxx",
                    color = Color.Black,

                    style = TextStyle(
                        fontSize = 14.sp
                    ),
                    modifier = Modifier
                        .requiredWidth(width = 273.dp)
                )
                Spacer(modifier = Modifier.width(50.dp))
                Box(
                    modifier = Modifier
                        .requiredSize(size = 30.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.icon_pencil),
                        contentDescription = "edit_icon",
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable { navController.navigate(Screen.Contact.route)}
                    )
                }
            }
        }

    }
}

@Composable
fun Item(modifier: Modifier = Modifier){

    Row (
        modifier = modifier
            .clip(shape = RoundedCornerShape(bottomStart = 10.dp, bottomEnd = 10.dp))
            .background(color = Color.White)
            .fillMaxWidth()
    ){
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
            modifier = modifier
        ) {
            Box(
                modifier = Modifier
                    .requiredHeight(height = 80.dp)
                    .padding(start = 10.dp)
            ) {
                Row(
                    modifier = modifier
                        .fillMaxHeight(),

                    horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 71.dp)
                            .requiredHeight(height = 50.dp)
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(color = Color.White)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.arsitel_cewe1),
                            contentDescription = "arsitek",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                        )
                    }
                    Column() {
                        Text(
                            text = "Alisa Gerald",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium
                            ),
                            modifier = Modifier
                                .requiredWidth(width = 93.dp)
                                .requiredHeight(height = 15.dp)
                                .wrapContentHeight(align = Alignment.CenterVertically)
                        )
                        Text(
                            text = "Architecture",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 12.sp
                            ),
                            modifier = Modifier
                                .requiredWidth(width = 93.dp)
                                .requiredHeight(height = 15.dp)
                                .wrapContentHeight(align = Alignment.CenterVertically)
                        )
                    }

                    Text(
                        text = "Rp 7.800.000",
                        color = Color(0xff202020),
                        textAlign = TextAlign.End,
                        lineHeight = 1.57.em,
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            letterSpacing = (-0.18).sp
                        ),
                        modifier = Modifier
                            .padding (end = 10.dp, start = 80.dp))
                }
            }
        }
    }
}

@Composable
fun PaymentMethode(
    modifier: Modifier = Modifier

){
    Row(
        modifier = modifier
            .clip(shape = RoundedCornerShape(10.dp))
            .background(Color.White)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(3.dp, Alignment.Top),
            modifier = Modifier
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            ) {
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Payment Method",
                    color = Color(0xff202020),
                    lineHeight = 1.88.em,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = (-0.21).sp
                    )
                )
                Spacer(modifier = Modifier.width(200.dp))
                Box(
                    modifier = Modifier
                        .requiredSize(size = 30.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.icon_pencil),
                        contentDescription = "edit_icon",
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable { }
                    )
                }
            }
            Row {
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Card",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    )
                )
            }
        }
    }
}


@Composable
fun PaymentDetail(modifier: Modifier = Modifier)
{
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(10.dp))
            .background(Color.White)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(6.dp, Alignment.Top),
            modifier = Modifier
                .padding(vertical = 4.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(5.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
            ) {
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Payment Details ",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier
                        .requiredHeight(height = 25.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically)
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
            ) {
                Text(
                    text = "Product subtotal ",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    )
                )
                Text(
                    text = "Rp 7.800.000",
                    color = Color.Black,
                    textAlign = TextAlign.End,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, end = 5.dp)
            ) {
                Text(
                    text = "Subtotal delivery",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    )
                )
                Text(
                    text = "Rp 10.000",
                    color = Color.Black,
                    textAlign = TextAlign.End,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, end = 5.dp)
            ) {
                Text(
                    text = "Discount voucher",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    )
                )
                Text(
                    text = "Rp 0",
                    color = Color.Black,
                    textAlign = TextAlign.End,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, end = 5.dp)
            ) {
                Text(
                    text = "Total Payment",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Rp 7.810.000",
                    color = Color.Black,
                    textAlign = TextAlign.End,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
    }
}

@Composable
fun ButtonPay(
    modifier: Modifier,
    onConfirm : () -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth().padding(top = 15.dp)
    ) {
        Button(
            onClick = onConfirm,
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
                text = "Pay",
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


@Preview(showBackground = true)
@Composable
private fun ShippingAddressPreview() {
    CheckOutItem(Modifier, navController = rememberNavController(), navigateToContact = {})
}