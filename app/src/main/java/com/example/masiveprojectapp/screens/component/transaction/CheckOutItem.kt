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
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily

@Composable
fun CheckOutItem(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
    ) {
        ShippingAddres(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 10.dp)
        )
        ContactInformation(
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 10.dp)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(height = 2.dp)
                .padding(start = 16.dp, end = 10.dp)
                .background(color = Color(0xffd9d9d9))
        )

        Spacer(modifier = Modifier.height(18.dp))

        AddVoucher(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 10.dp)
        )
        /*Box(
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(height = 2.dp)
                .padding(start = 16.dp, end = 10.dp)
                .background(color = Color(0xffd9d9d9)))*/

        Spacer(modifier = Modifier.padding(10.dp))

        Item(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 10.dp)
        )
        PaymentMethode(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 10.dp)
        )
        PaymentDetail(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 10.dp)
        )
        ButtonPay(modifier = Modifier, onConfirm = {})

    }

}

@Composable
fun ContactInformation(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Bottom,
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(10.dp))
            .background(color = Color(0xfff9f9f9))
            .padding(vertical = 6.dp)
    ) {
        Column {
            Text(
                text = "Contact Information",
                color = Color(0xff202020),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = (-0.14).sp
                )
            )
            Text(
                text = "(+62)xxx-xxxx-xxxx",
                color = Color.Black,
                lineHeight = 1.25.em,
                style = TextStyle(
                    fontSize = 12.sp
                ),
                modifier = Modifier
                    .requiredWidth(width = 273.dp)
                    .requiredHeight(height = 28.dp)
            )
        }
        Button2(modifier = Modifier.padding(end = 10.dp))
    }
}

@Composable
fun AddVoucher(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Row() {
            Text(
                text = "Items",
                color = Color(0xff202020),
                lineHeight = 1.88.em,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = (-0.21).sp
                ),
                modifier = Modifier
                    .requiredWidth(width = 50.dp)
            )
            /*Box(
                modifier = Modifier
                    .requiredWidth(width = 23.dp)
                    .requiredHeight(height = 22.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_items),
                    contentDescription = "Ellipse 149",
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xffe5ebfc)))
                Text(
                    text = "2",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    lineHeight = 2.em,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = (-0.18).sp),
                    modifier = Modifier
                        .align(alignment = Alignment.CenterStart)
                        .offset(x = 0.dp,
                            y = 0.5.dp)
                        .fillMaxWidth()
                        .requiredHeight(height = 15.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }*/
        }

        /*OutlinedButton(
            modifier = Modifier
                .padding(end = 10.dp),
            onClick = { },
            shape = RoundedCornerShape(11.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            border = BorderStroke(1.dp, Color(0xff8e5e24))
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Add Voucher",
                    color = Color(0xff8e5e24),
                    textAlign = TextAlign.Center,
                    lineHeight = 1.67.em,
                    style = TextStyle(
                        fontSize = 12.sp))
            }
        }*/
    }
}

@Composable
fun ShippingAddres(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Bottom,
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(10.dp))
            .background(color = Color(0xfff9f9f9))
            .padding(vertical = 6.dp)
    ) {
        Column {
            Text(
                text = "Shipping Address",
                color = Color(0xff202020),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = (-0.14).sp
                )
            )
            Text(
                text = "Jl. RS. Fatmawati Raya, Pondok Labu, Kec. Cilandak, Kota Depok, Jawa Barat 12450",
                color = Color.Black,
                lineHeight = 1.25.em,
                style = TextStyle(
                    fontSize = 12.sp
                ),
                modifier = Modifier
                    .requiredWidth(width = 273.dp)
                    .requiredHeight(height = 28.dp)
            )
        }
        Button(modifier = Modifier.padding(end = 10.dp))
    }
}

@Composable
fun Item(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .requiredHeight(height = 43.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 74.dp)
                        .requiredHeight(height = 53.dp)
                        .clip(shape = MaterialTheme.shapes.small)
                        .background(color = Color.White)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.arsitel_cewe1),
                        contentDescription = "arsitek",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = (-2).dp,
                                y = (-2).dp
                            )
                            .requiredWidth(width = 73.dp)
                            .requiredHeight(height = 49.dp)
                    )
                }
                Column() {
                    Text(
                        text = "Alisa Gerald",
                        color = Color.Black,
                        lineHeight = 1.33.em,
                        style = TextStyle(
                            fontSize = 12.sp,
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
                        lineHeight = 1.6.em,
                        style = TextStyle(
                            fontSize = 10.sp
                        ),
                        modifier = Modifier
                            .requiredWidth(width = 93.dp)
                            .requiredHeight(height = 15.dp)
                            .wrapContentHeight(align = Alignment.CenterVertically)
                    )
                }
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
                    .align(alignment = Alignment.CenterStart)
                    .offset(
                        x = 0.dp,
                        y = (-0.5).dp
                    )
                    .fillMaxWidth()
            )
        }

        Spacer(modifier = Modifier.height(20.dp))
        /*Box(
            modifier = Modifier
                .requiredHeight(height = 43.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically
            ) {

                *//*Box(
                    modifier = Modifier
                        .requiredWidth(width = 64.dp)
                        .requiredHeight(height = 43.dp)
                        .clip(shape = MaterialTheme.shapes.small)
                        .background(color = Color.White)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rumah1),
                        contentDescription = "desainrumah",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = (-4).dp,
                                y = (-1).dp
                            )
                            .requiredWidth(width = 73.dp)
                            .requiredHeight(height = 49.dp)
                    )
                }*//*
                *//*Column() {
                    Text(
                        text = "Japan Minimalist",
                        color = Color.Black,
                        lineHeight = 1.6.em,
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Medium
                        ),
                        modifier = Modifier
                            .requiredWidth(width = 93.dp)
                            .requiredHeight(height = 15.dp)
                            .wrapContentHeight(align = Alignment.CenterVertically)
                    )
                    Text(
                        text = "Room are 3 x 4 ",
                        color = Color.Black,
                        lineHeight = 1.6.em,
                        style = TextStyle(
                            fontSize = 10.sp
                        ),
                        modifier = Modifier
                            .requiredWidth(width = 93.dp)
                            .requiredHeight(height = 15.dp)
                            .wrapContentHeight(align = Alignment.CenterVertically)
                    )
                }*//*

            }
            *//*Text(
                text = "Rp 4.000.000",
                color = Color(0xff202020),
                textAlign = TextAlign.End,
                lineHeight = 1.57.em,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = (-0.18).sp
                ),
                modifier = Modifier
                    .align(alignment = Alignment.CenterStart)
                    .offset(
                        x = 0.dp,
                        y = (-0.5).dp
                    )
                    .fillMaxWidth()
            )*//*

        }*/
    }
}

@Composable
fun PaymentMethode(
    modifier: Modifier = Modifier

) {
    Column(
        verticalArrangement = Arrangement.spacedBy(3.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
            modifier = Modifier
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding()
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Payment Method",
                    color = Color(0xff202020),
                    modifier = Modifier.padding(start = 16.dp),
                    lineHeight = 1.88.em,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = (-0.21).sp
                    )
                )
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
//                    Image(
//                        painter = painterResource(id = R.drawable.iconmaterialedit),
//                        contentDescription = "Icon material-edit",
//                        modifier = Modifier
//                            .align(alignment = Alignment.TopStart)
//                            .offset(x = 8.70001220703125.dp,
//                                y = 8.dp)
//                            .requiredSize(size = 14.dp))
                }
            }
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
            modifier = Modifier
                .padding(vertical = 4.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(7.dp, Alignment.Top),
                modifier = Modifier
                    .requiredWidth(width = 330.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 328.dp)
                        .requiredHeight(height = 17.dp)
                ) {
                    Text(
                        text = "Card",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium
                        )
                    )
                }
            }
        }
    }
}


@Composable
fun PaymentDetail(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredHeight(height = 323.dp)
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
            Column(
                verticalArrangement = Arrangement.spacedBy(7.dp, Alignment.Top),
                modifier = Modifier
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
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
                            fontSize = 14.sp
                        )
                    )
                }
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                modifier = Modifier
                    .padding(vertical = 4.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(7.dp, Alignment.Top),
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
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
    }
}

@Composable
fun ButtonPay(
    modifier: Modifier,
    onConfirm: () -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 15.dp)
    ) {

        Button(
            onClick = onConfirm,
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5E8451)),
            modifier = Modifier
                .width(300.dp)
                .height(46.dp)
                .background(color = Color(0xFF5E8451), shape = RoundedCornerShape(size = 10.dp))
        ) {
            Text(
                text = "Pay",
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
fun Button(modifier: Modifier = Modifier) {

    Box(
        modifier = modifier
            .requiredSize(size = 30.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.icon_pencil),
            contentDescription = "Ellipse 149",
            modifier = Modifier
                .fillMaxSize()
                .clickable { }
        )
        Image(
            painter = painterResource(id = R.drawable.icon_pencil),
            contentDescription = "Icon material-edit",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 8.70001220703125.dp,
                    y = 8.dp
                )
                .requiredSize(size = 14.dp)
        )
    }
}

@Composable
fun Button2(modifier: Modifier = Modifier) {

    Box(
        modifier = modifier
            .requiredSize(size = 30.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.icon_pencil),
            contentDescription = "Ellipse 149",
            modifier = Modifier
                .fillMaxSize()
                .clickable { }
        )
        Image(
            painter = painterResource(id = R.drawable.icon_pencil),
            contentDescription = "Icon material-edit",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 8.70001220703125.dp,
                    y = 8.dp
                )
                .requiredSize(size = 14.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ShippingAddressPreview() {
    CheckOutItem(Modifier)
}