package com.example.masiveprojectapp.screens.detailArsitek2

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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.screens.component.SearchBar
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun DetailArsitek(modifier: Modifier = Modifier, navController: NavController) {
    Scaffold(
        topBar = {
            SearchBar(navController)
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
                    painter = painterResource(R.drawable.arsitel_cewe1),
                    contentDescription = "Arsitek",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(
                            start = 16.dp,
                            end = 16.dp,
                        )
                        .height(180.dp)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(10.dp))
                )
                Text(
                    text = "Allisa Gerand",
                    modifier = Modifier.padding(
                        top = 16.dp,
                        start = 16.dp,
                        end = 16.dp,
                    ),
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "Architect & Building Designer",
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
                        Halo, saya merupakan seorang arsitek yang sudah berpengalaman menyelesaikan beberapa project Pembuatan arsitektur rumah. Saat ini, saya sudah membuat banyak kebutuhan klien, mulai dari kebutuhan arsitektur. Saya siap melayani Anda dengan memberikan hasil yang terbaik. Segera konsultasikan kebutuhan Anda!
                    """.trimIndent(),
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
                        com.example.masiveprojectapp.screens.detailDesain.ProjectItem()
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
                            text = "Nomor Handphone",
                            modifier = Modifier.padding(
                                top = 16.dp,
                                start = 16.dp,
                                end = 16.dp,
                            ),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = "+62-8123-4567-8901",
                            modifier = Modifier.padding(
                                start = 16.dp,
                                end = 16.dp,
                            ),
                            fontSize = 12.sp
                        )
                    }
                    Column {
                        Text(
                            text = "Harga Jasa",
                            modifier = Modifier.padding(
                                top = 16.dp,
                                start = 16.dp,
                                end = 16.dp,
                            ),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = "Rp 30.000.000,00",
                            modifier = Modifier.padding(
                                start = 16.dp,
                                end = 16.dp,
                            ),
                            fontSize = 12.sp
                        )
                    }
                }
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

@Preview
@Composable
private fun DetailArsitekPreview() {
    MasiveProjectAppTheme(dynamicColor = false) {
        DetailArsitek(navController = rememberNavController())
    }
}