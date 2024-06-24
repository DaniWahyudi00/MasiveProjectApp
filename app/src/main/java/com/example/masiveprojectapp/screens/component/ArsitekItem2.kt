package com.example.masiveprojectapp.screens.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.model.ArsitekNew
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun ArsitekItem2(
    modifier: Modifier = Modifier,
    data: ArsitekNew
) {
    Column(
        modifier = modifier
            .background(color = Color.White)
            .wrapContentHeight()
            .width(169.dp)
            .clip(RoundedCornerShape(8.dp))
    ) {
        Image(
            painter = painterResource(data.image),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
        )
        Text(
            text = data.name,
            fontSize = 14.sp,
            modifier = Modifier
                .padding(top = 8.dp, start = 8.dp),
            fontWeight = FontWeight.SemiBold
        )
        Text(
            text = "Architect & Building Designer",
            fontSize = 14.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier
                .padding(start = 8.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(
                top = 6.dp,
                start = 8.dp
            )
        ) {
            Icon(
                painter = painterResource(R.drawable.icon_star),
                contentDescription = "Rating",
                tint = Color("#FBE418".toColorInt()),
                modifier = Modifier
                    .size(20.dp)
            )
            Row(modifier = Modifier.padding(start = 8.dp)) {
                Text(
                    text = "5.0 ( 30 Reviews )",
                    fontSize = 12.sp,
                    modifier = Modifier
                )
            }
        }
        Row(
            verticalAlignment = Alignment.Top,
            modifier = Modifier.padding(
                top = 6.dp,
                bottom = 8.dp,
                start = 8.dp
            )
        ) {
            Icon(
                modifier = Modifier
                    .size(22.dp),
                painter = painterResource(R.drawable.icon_cash),
                contentDescription = "Cash",
            )
            Column(modifier = Modifier.padding(start = 8.dp)) {
                Text(
                    text = "Verified License",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light
                )
                Text(
                    text = data.hargajasa,
                    fontSize = 12.sp,
                )
            }
        }
        Button(
            onClick = {},
            modifier = Modifier
                .padding(
                    end = 8.dp,
                    top = 6.dp,
                    bottom = 10.dp
                )
                .align(Alignment.End)
                .wrapContentWidth()
                .height(30.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.surface
            ),
            shape = RoundedCornerShape(8.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.icon_email),
                    contentDescription = "Email",
                    modifier = Modifier.size(
                        width = 10.dp,
                        height = 8.dp
                    )
                )
                Text(
                    text = "Send Message",
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(start = 6.dp)
                        .offset(y = (-3).dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun ArsitekItem2Preview() {
    MasiveProjectAppTheme(dynamicColor = false) {
        ArsitekItem2(
            data = ArsitekNew(
                image = R.drawable.arsitek1,
                name = "Allisa Gerand",
                description = "Halo, saya merupakan seorang arsitek yang sudah berpengalaman menyelesaikan beberapa project Pembuatan arsitektur rumah. Saat ini, saya sudah membuat banyak kebutuhan klien, mulai dari kebutuhan arsitektur. Saya siap melayani Anda dengan memberikan hasil yang terbaik. Segera konsultasikan kebutuhan Anda!",
                nohp = "+628574701234",
                hargajasa = "Rp 30.000.000,00",
                rating = "5/5",
                review = "30",
            )
        )
    }
}