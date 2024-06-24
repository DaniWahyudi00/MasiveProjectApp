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
import androidx.compose.foundation.lazy.items
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
import com.example.masiveprojectapp.data.local.datadummy
import com.example.masiveprojectapp.model.DesainNew
import com.example.masiveprojectapp.screens.component.SearchBar
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun DetailArsitek(
    modifier: Modifier = Modifier,
    id: Int,
    navigateBack: () -> Unit
) {

    val arsitek = datadummy.arsiteksNew
    val desain = datadummy.designNew

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
                    painter = painterResource(arsitek[id].image),
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
                    text = arsitek[id].name,
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
                        bottom = 10.dp
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
                    items(desain.size) {
                        ProjectItem(
                            desain = desain[it]
                        )
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
                            text = arsitek[id].nohp,
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
                            text = arsitek[id].hargajasa,
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
fun ProjectItem(
    desain: DesainNew
) {
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
                painter = painterResource(desain.image),
                contentDescription = "Project",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(100.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProjectItemPreview() {
    MasiveProjectAppTheme(dynamicColor = false) {
        ProjectItem(
            DesainNew(
                image = R.drawable.rumah1,
                name = "Modern House White",
                designBy = "Bali",
                description = "Modern House White",
                rating = "5/5",
                review = "30",
                nohp = "+628574701234",
                hargaDesain = "Rp 30.000.000,00"
            )
        )
    }
}

@Preview
@Composable
private fun DetailArsitekPreview() {
    MasiveProjectAppTheme(dynamicColor = false) {
        DetailArsitek(
            id = 0,
            navigateBack = {}
        )
    }
}