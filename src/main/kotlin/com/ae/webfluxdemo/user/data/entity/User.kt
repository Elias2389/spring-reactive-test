package com.ae.webfluxdemo.user.data.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table(name = "users")
data class UserEntity(
    @Id
    val id: Long? = null,
    val name: String,
    @Column("lastName")
    val lastName: String,
    val email: String,
    val birthday: LocalDateTime? = null,
)
