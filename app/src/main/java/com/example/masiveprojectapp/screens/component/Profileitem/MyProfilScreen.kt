package com.example.masiveprojectapp.screens.component.Profileitem

import android.app.AlertDialog
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.model.Arsitek
import com.example.masiveprojectapp.myprofil.Myprofil
import com.example.masiveprojectapp.myprofil.MyprofilItem
import com.example.masiveprojectapp.navigation.Screen
import com.example.masiveprojectapp.screens.component.BottomNavigation
import com.example.masiveprojectapp.screens.component.alertdialog.AlertProfileLogout
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily

//@Composable
//fun MyProfileScreen(
//    modifier: Modifier = Modifier,
//    myprofile: MyprofilItem,
//    navController: NavController,
////    onItemClicked: () -> Unit,
//) {
//    Row(
//
//        verticalAlignment = Alignment.CenterVertically,
//        modifier = modifier
//            .height(70.dp)
//            .width(335.dp)
//            .clip(RoundedCornerShape(5.dp))
//            .clickable { navController.navigate(Screen.MyProfile.route) }
//            .then(modifier)
//    ) {
//        Spacer(modifier = Modifier.width(24.dp))
//        Icon(
//            painter = painterResource(R.drawable.icon_profile_on_profile_screen),
//            contentDescription = null,
//            tint = MaterialTheme.colorScheme.primary
//        )
//
//        Spacer(modifier = Modifier.width(16.dp))
//        Text(modifier = Modifier .weight(1f), text = myprofile.title, fontFamily = poppinsFontFamily)
//        Icon(
//            painter = painterResource(id = R.drawable.icon_arrow_nav),
//            contentDescription = "Arrow"
//        )
//    }
//}
@Composable
fun MyProfileScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
//    onItemClicked: (Int) -> Unit
) {
    Column {
        val openDialog = remember { mutableStateOf(false) }
        Row(

            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .height(70.dp)
                .width(335.dp)
                .clickable { navController.navigate(Screen.UserProfile.route) }
                .clip(
                    RoundedCornerShape(5.dp),
                )
        ) {
            Spacer(modifier = Modifier.width(24.dp))
            Icon(
                painter = painterResource(id = R.drawable.icon_profile_on_profile_screen),
                contentDescription = stringResource(id = R.string.Profile_Menu),
                tint = MaterialTheme.colorScheme.primary,
            )

            Spacer(modifier = Modifier.width(16.dp))
            Text(modifier = Modifier.weight(1f), text = "Profile", fontFamily = poppinsFontFamily,
                    fontSize = 20.sp
                )
            Icon(
                painter = painterResource(id = R.drawable.icon_arrow_nav),
                contentDescription = "Arrow"
            )

        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .height(70.dp)
                .width(335.dp)
                .clickable { navController.navigate(Screen.MyProject.route) }
                .clip(
                    RoundedCornerShape(5.dp),
                )
        ) {
            Spacer(modifier = Modifier.width(24.dp))
            Icon(
                painter = painterResource(id = R.drawable.icon_my_project_on_profile_screen),
                contentDescription = stringResource(id = R.string.Profile_Menu),
                tint = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.width(16.dp))
            Text(modifier = Modifier.weight(1f), text = "My Project", fontFamily = poppinsFontFamily, fontSize = 20.sp)
            Icon(
                painter = painterResource(id = R.drawable.icon_arrow_nav),
                contentDescription = "Arrow"
            )

        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .height(70.dp)
                .width(335.dp)
                .clickable { navController.navigate(Screen.MyProfile.route) }
                .clip(RoundedCornerShape(5.dp),
                )
        ) {
            Spacer(modifier = Modifier.width(24.dp))
            Icon(
                painter = painterResource(id = R.drawable.icon_forum_on_profile_screen),
                contentDescription = stringResource(id = R.string.Profile_Menu),
                tint = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.width(16.dp))
            Text(modifier = Modifier .weight(1f), text = "Forum", fontFamily = poppinsFontFamily, fontSize = 20.sp)
            Icon(
                painter = painterResource(id = R.drawable.icon_arrow_nav),
                contentDescription = "Arrow"
            )

        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .height(70.dp)
                .width(335.dp)
                .clickable { navController.navigate(Screen.MyProfile.route) }
                .clip(RoundedCornerShape(5.dp),
                )
        ) {
            Spacer(modifier = Modifier.width(24.dp))
            Icon(
                painter = painterResource(id = R.drawable.icon_help_center_on_profile_screen),
                contentDescription = stringResource(id = R.string.Profile_Menu),
                tint = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.width(16.dp))
            Text(modifier = Modifier .weight(1f), text = "Help Center", fontFamily = poppinsFontFamily, fontSize = 20.sp)
            Icon(
                painter = painterResource(id = R.drawable.icon_arrow_nav),
                contentDescription = "Arrow"
            )

        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .height(70.dp)
                .width(335.dp)
                .clickable { openDialog.value = true}
                .clip(RoundedCornerShape(5.dp),
                ),

        ) {
            Spacer(modifier = Modifier.width(24.dp))
            Icon(
                painter = painterResource(id = R.drawable.icon_logout_on_profile_screen),
                contentDescription = stringResource(id = R.string.Profile_Menu),
                tint = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.width(16.dp))
            Text(modifier = Modifier .weight(1f), text = "Log Out", fontFamily = poppinsFontFamily, fontSize = 20.sp
            )
            Icon(
                painter = painterResource(id = R.drawable.icon_arrow_nav),
                contentDescription = "Arrow"
            )

        }
        if (openDialog.value){
            AlertProfileLogout(onDismiss = { openDialog.value = false}, onConfirm = {
                navController.navigate(Screen.Welcome.route)
            })
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun BottomNavigationPreview() {
    MasiveProjectAppTheme {
        MyProfileScreen(modifier = Modifier, navController = rememberNavController())
    }
}

