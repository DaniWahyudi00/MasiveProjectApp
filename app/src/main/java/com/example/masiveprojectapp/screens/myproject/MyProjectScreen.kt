package com.example.masiveprojectapp.screens.myproject

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.example.masiveprojectapp.myprofil.Myproject
import com.example.masiveprojectapp.utils.FileHelper

@Composable
fun MyProjectScreen(
        navController: NavController,
        modifier: Modifier = Modifier
    ) {
        val context = LocalContext.current
        val myproject = Myproject()

        var title by remember {
            mutableStateOf("")
        }
        var desc by remember {
            mutableStateOf("")
        }
        MyProjectContent(
            header = "Task Baru",
            title = title,
            onTitleChange = { title = it },
            desc = desc,
            onDescChange = { desc = it },
            onBackClick = { navController.navigateUp() },
            onSaveFileClick = {
                myproject.fileName = title
                myproject.data = desc
                FileHelper.writeToFile(myproject, context)
                Toast.makeText(
                    context,
                    "Menyimpan File " + myproject.fileName + "Berhasil",
                    Toast.LENGTH_SHORT
                ).show()
                navController.navigateUp()
            },
            modifier = modifier
        )
    }