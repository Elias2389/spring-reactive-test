package com.ae.webfluxdemo.user.presentation

import com.ae.webfluxdemo.user.data.entity.UserEntity
import com.ae.webfluxdemo.user.domain.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @GetMapping
    suspend fun findAllUsers(): ResponseEntity<List<UserEntity>> {
        val response = userService.findAllUsers().ifEmpty { emptyList() }
        return ResponseEntity.ok().body(response)
    }

    @GetMapping("/{id}")
    suspend fun findUserById(@PathVariable id: String): ResponseEntity<UserEntity> {
        return ResponseEntity.ok().body(userService.findUserById(id) ?: throw RuntimeException("User not found"))
    }

    @PostMapping
    suspend fun createUser(@RequestBody user: UserEntity): ResponseEntity<UserEntity> {
        return ResponseEntity.ok().body(userService.createUser(user))
    }

    @DeleteMapping
    suspend fun deleteUser() {

    }
}