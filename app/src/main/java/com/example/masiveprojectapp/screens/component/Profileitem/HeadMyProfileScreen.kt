package com.example.masiveprojectapp.screens.component.Profileitem

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.myprofil.MyprofilItem
import com.example.masiveprojectapp.myprofil.UsertItem
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily

@Composable
fun HeadMyProfileScreen(
    modifier: Modifier = Modifier,
    userprofile: UsertItem
){
    Row(

        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .height(40.dp)
            .width(229.dp)
    ) {
        Spacer(modifier = Modifier.width(24.dp))
            Image(
                painter = painterResource(id = userprofile.photo),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .clip(shape = CircleShape)
            )
        Spacer(modifier = Modifier.width(16.dp))
        Text(modifier = Modifier .weight(1f), text = "Hi, "+ userprofile.username, fontFamily = poppinsFontFamily)
    }

}

@Preview(showBackground = true)
@Composable
private fun HeadMyprofileScreenPrev(){
    MasiveProjectAppTheme {
       HeadMyProfileScreen(userprofile = UsertItem(1,"Richard",R.drawable.user))
    }
}