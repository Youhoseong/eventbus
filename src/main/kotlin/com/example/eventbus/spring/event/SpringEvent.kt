package com.example.eventbus.spring.event

import org.springframework.context.ApplicationEvent

class SpringEvent(
    private val source: Any,
    private val contents: String,
) : ApplicationEvent(source) {
    fun getContents(): String = contents
}