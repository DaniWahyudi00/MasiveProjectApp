package com.example.masiveprojectapp.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contact_information_table")
data class ContactInformationEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo("contact_id")
    val contactId: Int? = null,

    @ColumnInfo("phone_number")
    val phoneNumber: String,

    @ColumnInfo("email")
    val email: String
)
