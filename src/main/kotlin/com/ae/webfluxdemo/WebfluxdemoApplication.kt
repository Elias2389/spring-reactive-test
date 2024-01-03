package com.ae.webfluxdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing

@SpringBootApplication
@EnableR2dbcAuditing
class WebfluxdemoApplication

fun main(args: Array<String>) {
	runApplication<WebfluxdemoApplication>(*args)
}
