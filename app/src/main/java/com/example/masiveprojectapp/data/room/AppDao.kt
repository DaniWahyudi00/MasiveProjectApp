package com.example.masiveprojectapp.data.room

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.example.masiveprojectapp.data.entity.AddressEntity
import com.example.masiveprojectapp.data.entity.ContactInformationEntity
import com.example.masiveprojectapp.data.entity.ProjectEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface AppDao {

    @Upsert
    suspend fun  upsertProject(projectEntity: ProjectEntity)

    @Query("SELECT * FROM project_table")
    suspend fun getAllProject(): List<ProjectEntity>

    @Query("SELECT * FROM project_table WHERE id_project = :projectId")
    fun getProjectById(projectId: Int): Flow<ProjectEntity>

    @Query("DELETE FROM project_table WHERE id_project = :projectId")
    suspend fun deleteProjectById(projectId: Int)


    @Upsert
    suspend fun upsertAddress(addressEntity: AddressEntity)

    @Query("SELECT * FROM address_table")
    suspend fun getAllAddress(): List<AddressEntity>

    @Query("SELECT * FROM address_table WHERE address_id = :addressId")
    fun getAddressById(addressId: Int): Flow<AddressEntity>

    @Query("DELETE FROM address_table WHERE address_id = :addressId")
    suspend fun deleteAddressById(addressId: Int)


    @Upsert
    suspend fun upsertContactInformation(contactInformationEntity: ContactInformationEntity)

    @Query("SELECT * FROM contact_information_table")
    suspend fun getAllContactInformation(): List<ContactInformationEntity>

    @Query("SELECT * FROM contact_information_table WHERE contact_id = :contactId")
    fun getContactInformationById(contactId: Int): Flow<ContactInformationEntity>

    @Query("DELETE FROM contact_information_table WHERE contact_id = :contactId")
    suspend fun deleteContactInformationById(contactId: Int)



}