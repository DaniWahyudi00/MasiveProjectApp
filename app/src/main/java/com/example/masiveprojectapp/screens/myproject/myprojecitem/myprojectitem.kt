package com.example.masiveprojectapp.screens.myproject.myprojecitem

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme
@Composable
fun myprojectitem(

) {
    Column(
        modifier = Modifier
            .background(color = Color.White)
            .wrapContentHeight()
            .width(169.dp)
            .clip(RoundedCornerShape(8.dp))
    ) {
        Image(
            painter = painterResource(R.drawable.rumah1),
            contentDescription = "Japan Modern Sakura",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
        )
        Text(
            text = "Rizvina",
            fontSize = 8.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier
                .padding(top = 8.dp, start = 8.dp)
        )
        Text(
            text = "Office",
            fontSize = 12.sp,
            modifier = Modifier
                .padding(start = 8.dp),
            fontWeight = FontWeight.SemiBold
        )
        Text(
            text = "Rp. 45.000.000.00",
            fontSize = 12.sp,
            modifier = Modifier
                .padding(start = 8.dp),
            fontWeight = FontWeight.SemiBold
        )
    }
    }

@Preview(showBackground = true)
@Composable
private fun DesainItemPreview() {
    MasiveProjectAppTheme {
        myprojectitem()
    }
}