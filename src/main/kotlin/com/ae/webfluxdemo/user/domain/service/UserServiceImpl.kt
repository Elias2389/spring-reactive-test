package com.ae.webfluxdemo.user.domain.service

import com.ae.webfluxdemo.user.data.entity.UserEntity
import com.ae.webfluxdemo.user.data.repository.UserRepository
import kotlinx.coroutines.flow.toList
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val userRepository: UserRepository) : UserService {

    override suspend fun findAllUsers(): List<UserEntity> = userRepository.findAll().toList()

    override suspend fun findUserById(id: String): UserEntity? = userRepository.findById(id.toLong())

    override suspend fun createUser(user: UserEntity): UserEntity = userRepository.save(user)

    override suspend fun deleteUser() {
        TODO("Not yet implemented")
    }
}
