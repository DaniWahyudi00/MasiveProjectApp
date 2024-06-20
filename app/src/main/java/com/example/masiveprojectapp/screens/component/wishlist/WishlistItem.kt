package com.example.masiveprojectapp.screens.component.wishlist

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily

@Composable
fun WishlistItem(
    modifier: Modifier = Modifier
) {
    Column(

        modifier = Modifier
            .background(color = Color.White)
            .clip(RoundedCornerShape(8.dp))
            .fillMaxWidth()

    ) {
        Row(
            verticalAlignment = Alignment.Top,
            modifier = Modifier
                .padding(top = 6.dp)
                .fillMaxWidth()){
            Text(
                text = "Allisa Gerand",
                fontSize = 12.sp,
                modifier = Modifier
                    .weight(1f)
                    .padding(top = 8.dp, start = 16.dp)
            )
            Text(
                text = "Progress",
                fontSize = 12.sp,
                modifier = Modifier.padding(top = 8.dp, end = 16.dp
                )
            )
        }
        Row (verticalAlignment = Alignment.Top,
            modifier = Modifier.padding(top = 6.dp)) {
            Image(painter = painterResource(id = R.drawable.rumah1),
                contentDescription = "Japan Modern Sakura",
                modifier = Modifier
                    .size(50.dp, 100.dp)
                    .weight(1f))
            Column(modifier = Modifier.padding()) {
                Text(
                    text = "Japan Modern Sakura",
                    fontSize = 12.sp,
                    modifier = Modifier
                        .padding(top = 8.dp, start = 16.dp),
                    fontWeight = FontWeight.SemiBold
                )
                Row(
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier.padding(top = 6.dp)
                ) {
                    Icon(
                        modifier = Modifier
                            .padding(start = 8.dp)
                            .size(19.dp),
                        painter = painterResource(R.drawable.icon_arrows_expand),
                        contentDescription = "Arrows Expand",
                    )
                    Column(modifier = Modifier.padding(start = 8.dp)) {
                        Text(
                            text = "Lahan Minimal",
                            fontSize = 12.sp,

                            )
                        Text(
                            text = "16 m x 7 m",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Light
                        )
                    }
                }
                Row(
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier.padding(top = 6.dp, bottom = 8.dp)
                ) {
                    Icon(
                        modifier = Modifier
                            .padding(start = 8.dp)
                            .size(19.dp),
                        painter = painterResource(R.drawable.icon_cash),
                        contentDescription = "Cash",
                    )
                    Column(modifier = Modifier.padding(start = 8.dp)) {
                        Text(
                            text = "Biaya Konstruksi",
                            fontSize = 12.sp,

                            )
                        Text(
                            text = "Biaya Konstruksi",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Light
                        )
                    }
                }
            }
        }

        Button(
            onClick = {},
            modifier = Modifier
                .padding(
                    end = 8.dp,
                    top = 6.dp,
                    bottom = 8.dp
                )
                .align(Alignment.End)
                .wrapContentWidth()
                .height(24.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.surface
            ),
            shape = RoundedCornerShape(8.dp)
        ) {
            Row(modifier = Modifier.scale(1.4f)) {
                Text(
                    text = "Lihat",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(start = 6.dp)
                )
            }
        }
    }
}

@Composable
fun WishlistScreenItem(
    modifier: Modifier,
    navController: NavController,
    onLihat: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = MaterialTheme.shapes.medium)
            .background(color = Color.White)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .wrapContentHeight()
        ) {
            Box(
                modifier = Modifier
                    .width(150.dp)
                    .height(140.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.rumah1),
                    contentDescription = null,
                    modifier = Modifier.matchParentSize(),
                    alignment = Alignment.Center,
                    contentScale = ContentScale.Crop                 )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Bottom)
            ) {
                Text(
                    text = "Japan Modern Sakura",
                    color = Color(0xff111928),
                    lineHeight = 8.33.em,
                    style = MaterialTheme.typography.titleMedium
                )
                Column(
                    verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.Bottom)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(
                            8.dp,
                            Alignment.CenterHorizontally
                        ),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .wrapContentHeight()
                            .wrapContentHeight()
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.icon_arrows_expand),
                            contentDescription = "Icon/Outline/arrows-expand",
                            modifier = Modifier
                                .requiredSize(size = 19.dp)
                        )
                        Column(
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight()
                        ) {
                            Text(
                                text = "Lahan Minimal",
                                color = Color(0xff5c5c5c),
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Light
                                )
                            )
                            Text(
                                text = "3 m x 4 m",
                                color = Color(0xff1c1c1c),
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    letterSpacing = 0.5.sp
                                )
                            )
                        }
                    }
                    Spacer(modifier = Modifier)
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(
                            8.dp,
                            Alignment.CenterHorizontally
                        ),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_cash),
                            contentDescription = "Icon/Outline/cash",
                            modifier = Modifier
                                .requiredSize(size = 19.dp)
                        )
                        Column(
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight()
                        ) {
                            Text(
                                text = "Biaya Konstruksi",
                                color = Color(0xff5c5c5c),
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Light
                                )
                            )
                            Text(
                                text = "Biaya Desain",
                                color = Color(0xff1c1c1c),
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    letterSpacing = 0.5.sp
                                )
                            )
                        }
                    }
                }

                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 6.dp)
                ) {
                    OutlinedButton(
                        onClick = {  },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF42C2C)),
                        modifier = Modifier
                            .width(90.dp)
                            .requiredHeight(27.dp),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = "Delete",
                            style = TextStyle(
                                fontSize = 10.sp,
                                lineHeight = 10.sp,
                                fontFamily = poppinsFontFamily,
                                fontWeight = FontWeight(500),
                                color = Color(0xFFFFFFFF),
                                textAlign = TextAlign.Center,
                            )
                        )
                    }

                    OutlinedButton(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5E8451)),
                        modifier = Modifier
                            .width(114.dp)
                            .height(27.dp),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = "Check Out",
                            fontSize = 10.sp,
                            lineHeight = 10.sp,
                            fontFamily = poppinsFontFamily,
                            fontWeight = FontWeight(500),
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center,
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WishlistScreenPrev(
    modifier: Modifier = Modifier
) {
    MasiveProjectAppTheme {
        WishlistScreenItem(modifier = Modifier, onLihat = { }, navController = rememberNavController() )
    }
}