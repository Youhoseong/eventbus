package com.example.eventbus.spring

import com.example.eventbus.spring.event.SpringEvent
import com.example.eventbus.spring.publisher.SpringEventPublisher
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class SpringTestRunner(private val springEventPublisher: SpringEventPublisher) : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        val springEvent = SpringEvent(
            source = "",
            contents = "spring"
        )
        springEventPublisher.publish(springEvent)
    }
}