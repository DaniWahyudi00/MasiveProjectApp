package com.example.masiveprojectapp.screens.transaction

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.masiveprojectapp.screens.component.transaction.TransactionScreenItem
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme


@Composable
fun TransactionScreen(
    modifier: Modifier = Modifier,
)
{
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(26.dp),
            modifier = modifier
                .height(150.dp)
                .width(330.dp)
                .padding(start = 15.dp, end = 15.dp, top = 9.dp),
            ) {
            item(1) {TransactionScreenItem() }
        }
}

@Preview(showBackground = true)
@Composable
private fun TransacntionPrev(){

    MasiveProjectAppTheme {
        TransactionScreen()
    }
}