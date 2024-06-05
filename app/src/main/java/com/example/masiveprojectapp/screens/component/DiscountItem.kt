package com.example.masiveprojectapp.screens.component

import android.util.EventLogTags.Description
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun DiscoundItem(modifier: Modifier){

    Column (
        modifier = Modifier
            .clip(shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(R.drawable.icon_discound),
            contentDescription = "Discount",
            modifier = Modifier
                .clickable {}
        )
        Image(painter = painterResource(R.drawable.icon_discound),
            contentDescription = "Discount",
            modifier = Modifier
                .clickable {}

        )
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview(){
    MasiveProjectAppTheme {
        DiscoundItem(modifier = Modifier)
    }
}

