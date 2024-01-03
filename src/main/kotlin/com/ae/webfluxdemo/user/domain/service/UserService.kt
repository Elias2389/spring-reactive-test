package com.ae.webfluxdemo.user.domain.service

import com.ae.webfluxdemo.user.data.entity.UserEntity

interface UserService {
    suspend fun findAllUsers(): List<UserEntity>
    suspend fun findUserById(id: String): UserEntity?
    suspend fun createUser(user: UserEntity): UserEntity
    suspend fun deleteUser()
}