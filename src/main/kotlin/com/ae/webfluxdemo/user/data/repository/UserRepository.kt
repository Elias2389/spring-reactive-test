package com.ae.webfluxdemo.user.data.repository

import com.ae.webfluxdemo.user.data.entity.UserEntity
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: CoroutineCrudRepository<UserEntity, Long>