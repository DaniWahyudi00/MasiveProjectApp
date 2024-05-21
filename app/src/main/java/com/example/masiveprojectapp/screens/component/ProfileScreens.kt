package com.example.masiveprojectapp.screens.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.data.datadummy
import com.example.masiveprojectapp.myprofil.MyprofilItem
import com.example.masiveprojectapp.myprofil.UsertItem
import com.example.masiveprojectapp.screens.component.Profileitem.HeadMyProfileScreen
import com.example.masiveprojectapp.screens.component.Profileitem.MyProfileScreen
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun ProfileScreens(
    navController: NavController = rememberNavController(),
    modifier: Modifier = Modifier,
    myprofils: List<MyprofilItem> = datadummy.MyprofilItems,
    userprofiles : List<UsertItem> = datadummy.UsertItems


    ) {
    Column (verticalArrangement = Arrangement.spacedBy(31.dp),
        modifier = Modifier .padding(top = 30.dp)
        ) {
        HeadMyProfileScreen(
            modifier = Modifier .padding(top = 30.dp),
            userprofile = UsertItem(1, "Richard Solikin", R.drawable.user)
        )
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(26.dp),
            modifier = modifier
        ) {
            items(myprofils, key = { it.id }) {
                MyProfileScreen(myprofile = it, modifier = Modifier.padding(horizontal = 10.dp))
                {
                }
                //( modifier = Modifier.padding(horizontal = 16.dp))
            }
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