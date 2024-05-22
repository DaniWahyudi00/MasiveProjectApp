package com.example.masiveprojectapp.screens.component.transaction

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily

@Composable
fun TransactionScreenItem(
    modifier: Modifier = Modifier,
) {
//    Box(
//        modifier = Modifier.fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ) {
//        Text(text = "Transaction Screen")
//    }
//Column {
//    Row(
//        modifier = Modifier
//            .width(330.dp)
//    ){
//        Text(modifier = Modifier .weight(1f),text = "Allisa Gerrand", fontFamily = poppinsFontFamily,)
//        Text(modifier = Modifier ,text = "Progres", fontFamily = poppinsFontFamily, style = MaterialTheme.typography.bodySmall )
//    }
//
//    Column (
//        modifier = Modifier ,
//    ) {
//        Row(modifier = Modifier
//            .width(298.dp)
//            .height(63.dp)
//            .align(Alignment.CenterHorizontally)
//        ) {
//            Image(painter = painterResource(id = R.drawable.project1),
//                contentDescription = null,
//                modifier = Modifier )
//        }
//    }
//    }

    Column(

        modifier = Modifier
            .background(color = Color.White)
            .clip(RoundedCornerShape(8.dp))
    ) {
        Row(
            verticalAlignment = Alignment.Top,
            modifier = Modifier.padding(top = 6.dp)){
            Text(
                text = "Allisa Gerand",
                fontSize = 8.sp,
                modifier = Modifier
                    .weight(1f)
                    .padding(top = 8.dp, start = 16.dp)
            )
            Text(
                text = "Progress",
                fontSize = 8.sp,
                modifier = Modifier.padding(top = 8.dp, end = 16.dp
                )
            )
        }
        Row (verticalAlignment = Alignment.Top,
            modifier = Modifier.padding(top = 6.dp)) {
            Image(painter = painterResource(id = R.drawable.rumah1),
                contentDescription = "Japan Modern Sakura",
                modifier = Modifier
                    .size(78.dp, 100.dp)
                    .weight(1f))
            Column(modifier = Modifier.padding(start = 8.dp)) {
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
                            fontSize = 6.sp,
                            fontWeight = FontWeight.Light
                        )
                        Text(
                            text = "16 m x 7 m",
                            fontSize = 8.sp,
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
                            fontSize = 6.sp,
                            fontWeight = FontWeight.Light
                        )
                        Text(
                            text = "Biaya Konstruksi",
                            fontSize = 8.sp,
                        )
                    }
                }
            }
            Button(modifier = Modifier
                .padding(top = 79.dp, end = 16.dp,
                    bottom = 4.dp)
                .width(47.dp)
                .height(16.dp)
                .clickable {  },
                shape = RoundedCornerShape(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary)
                ,onClick = { /*TODO*/ }) {
                Text(text = "Lihat", color = Color.Green, fontSize = 5.sp)
                
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun TransactionScreenPrev(){
    MasiveProjectAppTheme {
        TransactionScreenItem()
    }
}