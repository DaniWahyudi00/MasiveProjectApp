package com.example.masiveprojectapp.data

//import com.example.masiveprojectapp.data.entity.AddressEntity
//import com.example.masiveprojectapp.data.entity.ContactInformationEntity
//import com.example.masiveprojectapp.data.entity.ProjectEntity
//import com.example.masiveprojectapp.data.entity.UserEntity
//import com.example.masiveprojectapp.data.room.AppDao
//import javax.inject.Inject
//import javax.inject.Singleton
//
//
//@Singleton
//class LocalDataSource @Inject constructor(private val appDao: AppDao) {
//
//    suspend fun upsertUser(user: UserEntity) = appDao.upsertUser(user)
//
//    suspend fun deleteUserById(id: Int) = appDao.deleteUserById(id)
//
//    fun getUserById(userId: Int) = appDao.getUserById(userId)
//
//    fun getAllUsers() = appDao.getAllUser()
//
//    suspend fun upsertProject(project: ProjectEntity) = appDao.upsertProject(project)
//
//    suspend fun deleteProjectById(id: Int) = appDao.deleteProjectById(id)
//
//    fun getProjectById(projectId: Int) = appDao.getProjectById(projectId)
//
//    fun getAllProjects() = appDao.getAllProject()
//
//    suspend fun upsertAddress(address: AddressEntity) = appDao.upsertAddress(address)
//
//    suspend fun deleteAddressById(id: Int) = appDao.deleteAddressById(id)
//
//    fun getAddressById(addressId: Int) = appDao.getAddressById(addressId)
//
//    fun getAllAddresses() = appDao.getAllAddress()
//
//    suspend fun upsertContactInformation(contactInformation: ContactInformationEntity) = appDao.upsertContactInformation(contactInformation)
//
//    suspend fun deleteContactInformationById(id: Int) = appDao.deleteContactInformationById(id)
//
//    fun getContactInformationById(contactId: Int) = appDao.getContactInformationById(contactId)
//
//    fun getAllContactInformation() = appDao.getAllContactInformation()
//
//
////    suspend fun upsertTask(task: TaskEntity) = taskDao.upsertTask(task)
////
////    suspend fun deleteTaskById(id: Int) = taskDao.deleteTaskById(id)
////
////    fun getTaskById(taskId: Int) = taskDao.getTaskById(taskId)
////
////    fun getAllTasks() = taskDao.getAllTasks()
//}