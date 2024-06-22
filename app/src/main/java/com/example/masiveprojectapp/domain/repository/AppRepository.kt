package com.example.masiveprojectapp.domain.repository

import com.example.masiveprojectapp.data.entity.AddressEntity
import com.example.masiveprojectapp.data.entity.ContactInformationEntity
import com.example.masiveprojectapp.data.entity.ProjectEntity
import com.example.masiveprojectapp.data.entity.UserEntity
import kotlinx.coroutines.flow.Flow

interface AppRepository {

    suspend fun upsertProject(projectEntity: ProjectEntity)

    suspend fun getAllProject(): Flow<List<ProjectEntity>>

    suspend fun getProjectById(projectId: Int): Flow<ProjectEntity>

    suspend fun deleteProjectById(projectId: Int)

    suspend fun upsertAddress(addressEntity: AddressEntity)

    suspend fun getAllAddress(): Flow<List<AddressEntity>>

    suspend fun getAddressById(addressId: Int): Flow<AddressEntity>

    suspend fun deleteAddressById(addressId: Int)

    suspend fun upsertContactInformation(contactInformationEntity: ContactInformationEntity)

    suspend fun getAllContactInformation(): Flow<List<ContactInformationEntity>>

    suspend fun getContactInformationById(contactId: Int): Flow<ContactInformationEntity>

    suspend fun deleteContactInformationById(contactId: Int)

    suspend fun upsertUser(userEntity: UserEntity)

    suspend fun deleteUserById(userId: Int)

    fun getUserById(userId: Int): Flow<UserEntity?>

    fun getAllUser(): Flow<List<UserEntity>>

}