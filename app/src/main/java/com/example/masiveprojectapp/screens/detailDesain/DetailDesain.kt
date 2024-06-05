package com.example.masiveprojectapp.screens.detailDesain

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.screens.component.SearchBar
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun DetailDesain(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            SearchBar()
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
        ){
            Column(
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .verticalScroll(
                        rememberScrollState()
                    )
            ) {
                Image(
                    painter = painterResource(R.drawable.rumah1),
                    contentDescription = "Desain",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(
                            start = 16.dp,
                            end = 16.dp,
                        )
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(10.dp))
                )
                Text(
                    text = "Japan Modern Sakura",
                    modifier = Modifier.padding(
                        top = 16.dp,
                        start = 16.dp,
                        end = 16.dp,
                    ),
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "Interior Designer",
                    modifier = Modifier.padding(
                        top = 6.dp,
                        start = 16.dp,
                        end = 16.dp,
                    ),
                    color = Color("#969696".toColorInt())
                )
                Row(
                    modifier = Modifier.padding(
                        top = 8.dp,
                        bottom = 8.dp,
                        start = 16.dp,
                        end = 16.dp,
                    )
                ) {
                    Icon(
                        painter = painterResource(R.drawable.icon_star),
                        contentDescription = "Star",
                        tint = Color("#FBE418".toColorInt()),
                        modifier = Modifier.padding(end = 4.dp)
                    )
                    Icon(
                        painter = painterResource(R.drawable.icon_star),
                        contentDescription = "Star",
                        tint = Color("#FBE418".toColorInt()),
                        modifier = Modifier.padding(end = 4.dp)
                    )
                    Icon(
                        painter = painterResource(R.drawable.icon_star),
                        contentDescription = "Star",
                        tint = Color("#FBE418".toColorInt()),
                        modifier = Modifier.padding(end = 4.dp)
                    )
                    Icon(
                        painter = painterResource(R.drawable.icon_star),
                        contentDescription = "Star",
                        tint = Color("#FBE418".toColorInt()),
                        modifier = Modifier.padding(end = 4.dp)
                    )
                    Icon(
                        painter = painterResource(R.drawable.icon_star),
                        contentDescription = "Star",
                        tint = Color("#FBE418".toColorInt()),
                        modifier = Modifier.padding(end = 8.dp)
                    )
                    Text(
                        text = "5.0",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 18.sp
                    )
                }
                Text(
                    text = """
                        Japan Modern Sakura adalah desain arsitektur yang memadukan elemen tradisional Jepang dan modern minimalis. Dengan taman sakura sebagai pusat, penggunaan material alami seperti kayu dan batu, serta jendela besar yang memaksimalkan cahaya alami, bangunan ini menciptakan suasana harmonis dan elegan, menggabungkan estetika klasik Jepang dengan fungsionalitas modern.                """.trimIndent(),
                    fontSize = 12.sp,
                    modifier = Modifier.padding(
                        start = 16.dp,
                        end = 16.dp,
                    )
                )
                Text(
                    text = "Project (10)",
                    modifier = Modifier.padding(
                        top = 20.dp,
                        start = 16.dp,
                        end = 16.dp,
                    ),
                    fontWeight = FontWeight.SemiBold
                )
                LazyRow(
                    modifier = Modifier
                        .padding(
                            start = 16.dp,
                            bottom = 25.dp
                        )
                ) {
                    items(10){
                        ProjectItem()
                    }
                }
                Text(
                    text = "Detail",
                    modifier = Modifier.padding(
                        start = 16.dp,
                    ),
                    fontWeight = FontWeight.SemiBold
                )
                Row {
                    Column(
                        modifier = Modifier.padding(
                            end = 24.dp
                        )
                    ) {
                        Text(
                            text = "Webiste",
                            modifier = Modifier.padding(
                                top = 16.dp,
                                start = 16.dp,
                                end = 16.dp,
                            ),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = "www.builderhome.com",
                            modifier = Modifier.padding(
                                start = 16.dp,
                                end = 16.dp,
                            ),
                            fontSize = 12.sp
                        )
                    }
                    Column {
                        Text(
                            text = "Harga Desain",
                            modifier = Modifier.padding(
                                top = 16.dp,
                                start = 16.dp,
                                end = 16.dp,
                            ),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = "Rp 5.000.000,00",
                            modifier = Modifier.padding(
                                start = 16.dp,
                                end = 16.dp,
                            ),
                            fontSize = 12.sp
                        )
                    }
                }
                Button(
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.surface
                    ),
                    modifier = Modifier
                        .padding(top = 16.dp, start = 16.dp)
                        .height(50.dp),
                    shape = RoundedCornerShape(8.dp),
                    onClick = {}
                ) {
                    Text(
                        text = "Add to Wishlist",
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}

@Composable
fun ProjectItem(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .width(170.dp)
    ){
        Column(
            modifier = Modifier.padding(
                top = 4.dp,
                end = 8.dp,
                bottom = 8.dp
            )
        ) {
            Image(
                painter = painterResource(R.drawable.rumah1),
                contentDescription = "Project",
                modifier = Modifier.clip(RoundedCornerShape(8.dp))
            )
            Text(
                text = "Modern House White",
                fontSize = 12.sp
            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = "Location",
                    modifier = Modifier
                        .offset(y = (-1).dp)
                        .size(12.dp),
                    tint = Color("#888888".toColorInt())
                )
                Text(
                    text = "Bali",
                    fontSize = 12.sp,
                    color = Color("#888888".toColorInt())
                )
            }
            Button(
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.surface
                ),
                modifier = Modifier
                    .padding(top = 8.dp, bottom = 16.dp)
                    .height(33.dp),
                shape = RoundedCornerShape(8.dp),
                onClick = {}
            ) {
                Text(
                    text = "Detail",
                    modifier = Modifier.offset(y = -2.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProjectItemPreview() {
    MasiveProjectAppTheme(dynamicColor = false) {
        ProjectItem()
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailDesainPreview() {
    MasiveProjectAppTheme(dynamicColor = false) {
        DetailDesain()
    }
}