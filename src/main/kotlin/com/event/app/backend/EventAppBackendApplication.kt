package com.event.app.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EventAppBackendApplication

fun main(args: Array<String>) {
	runApplication<EventAppBackendApplication>(*args)
}
