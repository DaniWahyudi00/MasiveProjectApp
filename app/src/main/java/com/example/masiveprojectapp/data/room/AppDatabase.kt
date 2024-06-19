package com.example.masiveprojectapp.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.masiveprojectapp.data.entity.AddressEntity
import com.example.masiveprojectapp.data.entity.ContactInformationEntity
import com.example.masiveprojectapp.data.entity.ProjectEntity

@Database(entities = [ProjectEntity::class, AddressEntity::class, ContactInformationEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun appDao(): AppDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase{
            val tempinstance = INSTANCE
            if(tempinstance != null){
                return tempinstance
            }

            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}