package com.example.masiveprojectapp.data.repository

//import com.example.masiveprojectapp.data.LocalDataSource
//import com.example.masiveprojectapp.data.entity.AddressEntity
//import com.example.masiveprojectapp.data.entity.ContactInformationEntity
//import com.example.masiveprojectapp.data.entity.ProjectEntity
//import com.example.masiveprojectapp.data.entity.UserEntity
//import com.example.masiveprojectapp.domain.repository.AppRepository
//import kotlinx.coroutines.flow.Flow
//import javax.inject.Inject
//import javax.inject.Singleton
//
//@Singleton
//class AppRepositoryImpl @Inject constructor(
//    private val localDataSource: LocalDataSource) : AppRepository {
//        override suspend fun upsertUser(userEntity: UserEntity) = localDataSource.upsertUser(userEntity)
//
//        override suspend fun deleteUserById(userId: Int) = localDataSource.deleteUserById(userId)
//
//        override fun getUserById(userId: Int) : Flow<UserEntity?> = localDataSource.getUserById(userId)
//
//        override fun getAllUser(): Flow<List<UserEntity>> = localDataSource.getAllUsers()
//
//        override suspend fun upsertProject(projectEntity: ProjectEntity) = localDataSource.upsertProject(projectEntity)
//
//        override suspend fun deleteProjectById(projectId: Int) = localDataSource.deleteProjectById(projectId)
//
//        override suspend fun getProjectById(projectId: Int): Flow<ProjectEntity> = localDataSource.getProjectById(projectId)
//
//        override suspend fun getAllProject(): Flow<List<ProjectEntity>> = localDataSource.getAllProjects()
//
//        override suspend fun upsertAddress(addressEntity: AddressEntity) = localDataSource.upsertAddress(addressEntity)
//
//        override suspend fun deleteAddressById(addressId: Int) = localDataSource.deleteAddressById(addressId)
//
//        override suspend fun getAddressById(addressId: Int): Flow<AddressEntity> = localDataSource.getAddressById(addressId)
//
//        override suspend fun getAllAddress(): Flow<List<AddressEntity>> = localDataSource.getAllAddresses()
//
//        override suspend fun getAllContactInformation(): Flow<List<ContactInformationEntity>> = localDataSource.getAllContactInformation()
//
//        override suspend fun getContactInformationById(contactId: Int): Flow<ContactInformationEntity> = localDataSource.getContactInformationById(contactId)
//
//        override suspend fun deleteContactInformationById(contactId: Int) = localDataSource.deleteContactInformationById(contactId)
//
//        override suspend fun upsertContactInformation(contactInformationEntity: ContactInformationEntity) = localDataSource.upsertContactInformation(contactInformationEntity)
//
////        fun getAllUsers(): List<UserEntity> = localDataSource.getAllUsers()
////
////        fun getAllProjects(): List<ProjectEntity> = localDataSource.getAllProjects()
////
////        fun getAllAddresses(): List<AddressEntity> = localDataSource.getAllAddresses()
//
//    }
