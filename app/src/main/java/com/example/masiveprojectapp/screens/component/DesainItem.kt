package com.example.masiveprojectapp.screens.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
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
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.model.DesainNew
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun DesainItem(
    modifier: Modifier = Modifier,
    desain: DesainNew
) {
    Column(
        modifier = modifier
            .background(color = Color.White)
            .wrapContentHeight()
            .width(169.dp)
            .clip(RoundedCornerShape(8.dp))
    ) {
        Image(
            painter = painterResource(desain.image),
            contentDescription = "Japan Modern Sakura",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(125.dp)
        )
        Text(
            text = desain.name,
            fontSize = 13.sp,
            maxLines = 1,
            modifier = Modifier
                .padding(top = 8.dp, start = 8.dp),
            fontWeight = FontWeight.SemiBold
        )
        Text(
            text = desain.designBy,
            fontSize = 12.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier
                .padding(start = 8.dp)
        )
        Row(
            verticalAlignment = Alignment.Top,
            modifier = Modifier.padding(top = 6.dp)
        ) {
            Icon(
                modifier = Modifier
                    .padding(start = 8.dp)
                    .size(26.dp),
                painter = painterResource(R.drawable.icon_arrows_expand),
                contentDescription = "Arrows Expand",
            )
            Column(modifier = Modifier.padding(start = 8.dp)) {
                Text(
                    text = "Lahan Minimal",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light
                )
                Text(
                    text = "16 m x 7 m",
                    fontSize = 12.sp,
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
                    .size(26.dp),
                painter = painterResource(R.drawable.icon_cash),
                contentDescription = "Cash",
            )
            Column(modifier = Modifier.padding(start = 8.dp)) {
                Text(
                    text = "Biaya Konstruksi",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light
                )
                Text(
                    text = "Rp 5.000.000,00",
                    fontSize = 12.sp,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DesainItemPreview() {
    MasiveProjectAppTheme {
        DesainItem(
            desain = DesainNew(
                image = R.drawable.desain1,
                name = "Japan Modern Sakura",
                designBy = "design by indah NW",
                description = "Halo, saya merupakan seorang arsitek yang sudah berpengalaman menyelesaikan beberapa project Pembuatan arsitektur rumah. Saat ini, saya sudah membuat banyak kebutuhan klien, mulai dari kebutuhan arsitektur. Saya siap melayani Anda dengan memberikan hasil yang terbaik. Segera konsultasikan kebutuhan Anda!",
                nohp = "+628574701234",
                hargaDesain = "Rp 5.000.000,00",
                rating = "5/5",
                review = "30",
            )
        )
    }
}