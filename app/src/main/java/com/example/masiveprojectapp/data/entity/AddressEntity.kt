package com.example.masiveprojectapp.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "address_table")
data class AddressEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo("address_id")
    val addressId: Int? = null,

    @ColumnInfo("address_name")
    val name: String,

    @ColumnInfo("town_address")
    val town: String,

    @ColumnInfo("country_address")
    val country: String,

    @ColumnInfo("province_address")
    val province: String
)
