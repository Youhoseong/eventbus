package com.example.eventbus.spring.subscriber

import com.example.eventbus.spring.SpringEvent
import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationListener

class SpringEventSubscriber : ApplicationListener<SpringEvent> {
    private val log = LoggerFactory.getLogger(SpringEventSubscriber::class.java)

    override fun onApplicationEvent(event: SpringEvent) {
        log.info("Event Process. event(${event})")
    }
}