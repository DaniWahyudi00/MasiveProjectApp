package com.example.masiveprojectapp.screens.component.Profileitem

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.model.Arsitek
import com.example.masiveprojectapp.myprofil.Myprofil
import com.example.masiveprojectapp.myprofil.MyprofilItem
import com.example.masiveprojectapp.screens.component.BottomNavigation
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily

@Composable
fun MyProfileScreen(
    modifier: Modifier = Modifier,
    myprofile: MyprofilItem,
    onItemClicked: (Int) -> Unit
) {
    Row(

        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .height(70.dp)
            .width(335.dp)
            .clip(RoundedCornerShape(5.dp))
            .clickable { onItemClicked(myprofile.id) }
            .then(modifier)
    ) {
        Spacer(modifier = Modifier.width(24.dp))
        Icon(
            painter = painterResource(id = myprofile.icon),
            contentDescription = null,
            tint = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.width(16.dp))
        Text(modifier = Modifier .weight(1f), text = myprofile.title, fontFamily = poppinsFontFamily)
        Icon(
            painter = painterResource(id = R.drawable.icon_arrow_nav),
            contentDescription = "Arrow"
        )
    }
}
@Composable
fun Myprofil1(
    modifier: Modifier = Modifier,
    navController: NavController = rememberNavController()
//    onItemClicked: (Int) -> Unit
){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .height(70.dp)
            .width(335.dp)
            .clip(RoundedCornerShape(5.dp),
                )
    ) {
        Spacer(modifier = Modifier.width(24.dp))
        Icon(
            painter = painterResource(id = R.drawable.icon_profile_on_profile_screen),
            contentDescription = stringResource(id = R.string.Profile_Menu),
            tint = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.width(16.dp))
            Text(modifier = Modifier .weight(1f), text = "Profile", fontFamily = poppinsFontFamily)
        Icon(
            painter = painterResource(id = R.drawable.icon_arrow_nav),
            contentDescription = "Arrow"
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun BottomNavigationPreview() {
    MasiveProjectAppTheme {
        Myprofil1()
    }
}

