package com.example.eventbus

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EventbusApplication

fun main(args: Array<String>) {
    runApplication<EventbusApplication>(*args)
}
