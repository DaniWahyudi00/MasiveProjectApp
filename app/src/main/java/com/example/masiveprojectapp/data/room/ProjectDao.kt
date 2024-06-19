package com.example.masiveprojectapp.data.room

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.example.masiveprojectapp.data.entity.ProjectEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ProjectDao {

    @Upsert
    suspend fun  upsertProject(projectEntity: ProjectEntity)

    @Query("SELECT * FROM project_table")
    suspend fun getAllProject(): List<ProjectEntity>

    @Query("SELECT * FROM project_table WHERE id_project = :projectId")
    suspend fun getProjectById(projectId: Int): Flow<ProjectEntity>

    @Query("DELETE FROM project_table WHERE id_project = :projectId")
    suspend fun deleteProjectById(projectId: Int)

}