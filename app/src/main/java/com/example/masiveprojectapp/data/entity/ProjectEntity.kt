package com.example.masiveprojectapp.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "project_table")

data class ProjectEntity (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_project")
    val projectId: Int? = null,

    @ColumnInfo(name = "name_project")
    val name: String,

    @ColumnInfo(name = "description_project")
    val description: String,

    @ColumnInfo(name = "image_project")
    val image: String,

    @ColumnInfo(name = "price_project")
    val price: Int,

    @ColumnInfo(name = "date_project")
    val date: Int,

    @ColumnInfo(name = "condition_project")
    val condition: String,

    @ColumnInfo(name = "owner_project")
    val owner: String,

    @ColumnInfo(name = "room_area_project")
    val roomarea: Int,
)