package com.ae.webfluxdemo.book.data.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate

@Table(name = "books")
data class BookEntity(
    @Id
    @Column("book_id")
    val id: Long? = null,

    val title: String,

    @Column("totalPages")
    val totalPages: String,

    @Column("publishedDate")
    val publishedDate: LocalDate? = null,
)
