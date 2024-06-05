package com.example.masiveprojectapp.screens.component.contactinformationitem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
fun ContactInformationItem(
    modifier: Modifier
){
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
            .padding(all = 15.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .requiredWidth(width = 330.dp)
        ) {
            Text(
                text = "Contact Information",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = (-0.22).sp)
            )
            Icon(
                painter = painterResource(R.drawable.icon_typeno),
                contentDescription = "Close_Icon",
                modifier = Modifier
                    .requiredSize(size = 16.dp))
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(15.dp, Alignment.Top),
            modifier = Modifier
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.Top)
            ) {
                Text(
                    text = "Number",
                    color = Color.Black,
                    lineHeight = 1.54.em,
                    style = TextStyle(
                        fontSize = 14.sp))
                TextField(
                    value = "(+62)xxxxxxxxxx",
                    onValueChange = {""},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp,
                            vertical = 8.dp))
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.Top)
            ) {
                Text(
                    text = "Email",
                    color = Color.Black,
                    lineHeight = 1.54.em,
                    style = TextStyle(
                        fontSize = 14.sp))
                TextField(
                    value = "rizvinaimani@gmail.com",
                    onValueChange = {""},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp,
                            vertical = 8.dp))
            }
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp)
        ) {
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
                modifier = Modifier
                    .requiredWidth(width = 247.dp)
                    .requiredHeight(height = 41.dp)
                    .background(
                        color = MaterialTheme.colorScheme.primary,
                        shape = RoundedCornerShape(size = 11.dp)
                    )
            ) {
                Text(
                    text = "Save Changes",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 25.sp,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight(500),
                        textAlign = TextAlign.Center,
                    )
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview(){
    MaterialTheme{
        ContactInformationItem(modifier = Modifier)
    }
}
