package com.example.masiveprojectapp.screens.myproject.myprojecitem

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.screens.component.UserDetailItem
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily

@Composable
fun DetailProductItem(

    modifier: Modifier = Modifier
){
    Column(
        modifier = Modifier
    ) {
        
            Image(
                painter = painterResource(id = R.drawable.project1),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
            )
        Text(text = "Rp. 20.000.000.00 ",
            modifier = Modifier
                .height(13.dp)
                .fillMaxWidth()
                .padding( start = 15.dp),
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleMedium,
        )

        Text(text = "Living Room",
            modifier = Modifier
                .padding(top = 29.dp, start = 15.dp),
            fontSize = 15.sp,
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall
        )

        Text(text = "Product Detail",
            modifier = Modifier
                .padding(top = 20.dp, start = 10.dp),
            fontSize = 15.sp,
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall
        )
        Column {
            Row {
                Text(text = "Owner", modifier = Modifier .padding(start = 15.dp))
                Spacer(modifier = Modifier .width(20.dp))
                Text(text= "Rivza")
            }
            Row {
                Text(text = "Size", modifier = Modifier .padding(start = 15.dp))
                Spacer(modifier = Modifier .width(20.dp))
                Text(text= "Rivza")
            }
            Row {
                Text(text = "Condition", modifier = Modifier .padding(start = 15.dp))
                Spacer(modifier = Modifier .width(20.dp))
                Text(text= "Rivza")
            }
        }

        Text(text = "Project Description",
            modifier = Modifier
                .padding(top = 29.dp, start = 15.dp),
            fontSize = 15.sp,
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleMedium
        )

        Text(text = "Input Project Portofolio",
            modifier = Modifier
                .padding(top = 29.dp, start = 15.dp),
            fontSize = 15.sp,
            fontFamily = poppinsFontFamily,
            style = MaterialTheme.typography.titleSmall
        )
        Button(modifier = Modifier
            .padding(
                top = 16.dp,
                bottom = 4.dp
            )
            .width(100.dp)
            .height(32.dp)
            .clickable { },
            shape = RoundedCornerShape(4.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary)
            ,onClick = { /*TODO*/ }) {
            Text(text = "Save", color = MaterialTheme.colorScheme.primary)

        }
    }

}

@Preview(showBackground = true)
@Composable
private fun UserDetailItemPrev(){
    MasiveProjectAppTheme {
        DetailProductItem(modifier = Modifier)
    }
}