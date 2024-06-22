package com.example.masiveprojectapp.data.room

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.example.masiveprojectapp.data.entity.AddressEntity
import com.example.masiveprojectapp.data.entity.ContactInformationEntity
import com.example.masiveprojectapp.data.entity.ProjectEntity
import com.example.masiveprojectapp.data.entity.UserEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface AppDao {

    @Upsert
    suspend fun  upsertProject(projectEntity: ProjectEntity)

    @Query("SELECT * FROM project_table")
    fun getAllProject(): Flow<List<ProjectEntity>>

    @Query("SELECT * FROM project_table WHERE id_project = :projectId")
    fun getProjectById(projectId: Int): Flow<ProjectEntity>

    @Query("DELETE FROM project_table WHERE id_project = :projectId")
    suspend fun deleteProjectById(projectId: Int)


    @Upsert
    suspend fun upsertAddress(addressEntity: AddressEntity)

    @Query("SELECT * FROM address_table")
    fun getAllAddress(): Flow<List<AddressEntity>>

    @Query("SELECT * FROM address_table WHERE address_id = :addressId")
    fun getAddressById(addressId: Int): Flow<AddressEntity>

    @Query("DELETE FROM address_table WHERE address_id = :addressId")
    suspend fun deleteAddressById(addressId: Int)


    @Upsert
    suspend fun upsertContactInformation(contactInformationEntity: ContactInformationEntity)

    @Query("SELECT * FROM contact_information_table")
    fun getAllContactInformation(): Flow<List<ContactInformationEntity>>

    @Query("SELECT * FROM contact_information_table WHERE contact_id = :contactId")
    fun getContactInformationById(contactId: Int): Flow<ContactInformationEntity>

    @Query("DELETE FROM contact_information_table WHERE contact_id = :contactId")
    suspend fun deleteContactInformationById(contactId: Int)


    @Upsert
    suspend fun upsertUser(userEntity: UserEntity)

    @Query( "SELECT * FROM user_table")
    fun getAllUser(): Flow<List<UserEntity>>

    @Query("SELECT * FROM user_table WHERE id_project = :userId")
    fun getUserById(userId: Int): Flow<UserEntity?>

    @Query("DELETE FROM user_table WHERE id_project = :userId")
    suspend fun deleteUserById(userId: Int)




}