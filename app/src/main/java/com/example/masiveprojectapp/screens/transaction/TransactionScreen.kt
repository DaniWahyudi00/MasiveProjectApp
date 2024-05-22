package com.example.masiveprojectapp.screens.transaction

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.masiveprojectapp.screens.component.transaction.TransactionScreenItem


@Composable
fun TransactionScreen(
    modifier: Modifier = Modifier,
)
{
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(26.dp),
            modifier = modifier
                .height(330.dp)
                .width(130.dp)
                .padding(start = 15.dp, end = 15.dp, top = 9.dp),
            ) {
            item(2) {TransactionScreenItem() }
        }
}