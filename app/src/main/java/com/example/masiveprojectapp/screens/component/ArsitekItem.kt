package com.example.masiveprojectapp.screens.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.model.Arsitek
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun ArsitekItem(
    arsitek: Arsitek,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable
        {
            onItemClicked(arsitek.id)
        }
    ) {
        Image(
            painter = painterResource(id = arsitek.photo),
            contentDescription = arsitek.name,
            modifier= Modifier
                //.clip()
                .fillMaxWidth(),
        )

        Text(
            text = arsitek.name,
            style = MaterialTheme.typography.titleSmall,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Left,
            modifier = Modifier.fillMaxWidth(),
            maxLines = 1

        )
        Text(
            text = arsitek.role,
            color = MaterialTheme.colorScheme.primary,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.fillMaxWidth(),
            maxLines = 1
        )
        Button(
            modifier = Modifier
                .height(35.dp)
                .width(180.dp),
            shape = RoundedCornerShape(20.dp),
            onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.Email, contentDescription = stringResource(id = R.string.menu_message) )
            Text(text = " Send Message")

        }

    }
}


@Preview(showBackground = true)
@Composable
private fun ArsitekItemPrev(){
    MasiveProjectAppTheme {
        ArsitekItem(arsitek = Arsitek(
            1,"Allisa Gerand","Architect & Building Designer", "Halo, saya merupakan seorang arsitek yang sudah berpengalaman menyelesaikan beberapa project Pembuatan arsitektur rumah. \\n\" +\n" +
                    "                    \"Saat ini, saya sudah membuat banyak kebutuhan klien, mulai dari kebutuhan arsitektur. \\n\" +\n" +
                    "                    \"Saya siap melayani Anda dengan memberikan hasil yang terbaik. Segera konsultasikan kebutuhan Anda!\"", R.drawable.arsitel_cewe1, +6212-3456-7890, "Websitte.com", "Rp xx.xx.xx.xx."),
            onItemClicked = {ArsitekId -> println("Arsitek Id : $ArsitekId")}
        )
    }
}