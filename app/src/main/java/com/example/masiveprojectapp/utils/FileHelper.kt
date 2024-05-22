package com.example.masiveprojectapp.utils

import android.content.Context
import com.example.masiveprojectapp.myprofil.Myproject
import com.example.masiveprojectapp.navigation.Screen

object FileHelper {
    fun writeToFile(fileProject: Myproject, context: Context) {
        context.openFileOutput(fileProject.fileName, Context.MODE_PRIVATE).use {
            it.write(fileProject.data?.toByteArray())
        }
    }

    fun readFromFile(context: Context, fileName: String): Myproject {
        val fileModel = Myproject()
        fileModel.fileName = fileName
        fileModel.data = context.openFileInput(fileName).bufferedReader().useLines { lines ->
            lines.fold("") { some, text ->
                "$some$text\n"
            }
        }
        return fileModel
    }
}