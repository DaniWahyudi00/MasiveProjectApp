package com.example.masiveprojectapp.screens.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.data.datadummy
import com.example.masiveprojectapp.myprofil.MyprofilItem
import com.example.masiveprojectapp.myprofil.UsertItem
import com.example.masiveprojectapp.navigation.Screen
import com.example.masiveprojectapp.screens.component.Profileitem.HeadMyProfileScreen
import com.example.masiveprojectapp.screens.component.Profileitem.MyProfileScreen
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun ProfileScreens(
    navController: NavController = rememberNavController(),
//    modifier: Modifier = Modifier,
//    myprofils: List<MyprofilItem> = datadummy.MyprofilItems,
//    userprofiles : List<UsertItem> = datadummy.UsertItems

    ) {

    Scaffold(containerColor = MaterialTheme.colorScheme.background,)
    {
            innerPadding ->
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(innerPadding).fillMaxWidth()
        ) {
            HeadMyProfileScreen(
                modifier = Modifier.padding(top = 30.dp),
                userprofile = UsertItem(1, "Richard Solikin", R.drawable.user)
            )

            MyProfileScreen(
                modifier = Modifier.padding(top = 30.dp)
                    .clip(shape = RoundedCornerShape(4.dp))
                    .background(color = Color.White),
                navController = navController
            )

        }

    }
}
@Preview(showBackground = true)
@Composable
private fun ProfileScreenPreview(){
    MasiveProjectAppTheme {
        ProfileScreens(navController = rememberNavController())
    }

}