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
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun ArsitekItem2(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .background(color = Color.White)
            .wrapContentHeight()
            .width(169.dp)
            .clip(RoundedCornerShape(8.dp))
    ) {
        Image(
            painter = painterResource(R.drawable.arsitel_cewe1),
            contentDescription = "Allisa Gerand",
            contentScale = ContentScale.FillWidth,
        )
        Text(
            text = "Allisa Gerand",
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 8.dp, start = 8.dp),
            fontWeight = FontWeight.SemiBold
        )
        Text(
            text = "Architect & Building Designer",
            fontSize = 8.sp,
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
                    .size(16.dp)
            )
            Row(modifier = Modifier.padding(start = 8.dp)) {
                Text(
                    text = "5.0 ( 30 Reviews )",
                    fontSize = 8.sp,
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
                    .size(19.dp),
                painter = painterResource(R.drawable.icon_cash),
                contentDescription = "Cash",
            )
            Column(modifier = Modifier.padding(start = 8.dp)) {
                Text(
                    text = "Verified License",
                    fontSize = 6.sp,
                    fontWeight = FontWeight.Light
                )
                Text(
                    text = "$100 - $1500",
                    fontSize = 8.sp,
                )
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
                    fontSize = 6.sp,
                    modifier = Modifier.padding(start = 6.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun ArsitekItem2Preview() {
    MasiveProjectAppTheme(dynamicColor = false) {
        ArsitekItem2()
    }
}