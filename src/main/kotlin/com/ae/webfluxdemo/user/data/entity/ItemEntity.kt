package com.ae.webfluxdemo.user.data.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table(name = "items")
data class ItemEntity(
    @Id
    val id: Long? = null,
    val name: String,
)
