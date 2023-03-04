package com.example.eventbus.guava

import com.example.eventbus.guava.event.GeneralEvent
import com.example.eventbus.guava.event.SpecifiedEvent
import com.example.eventbus.guava.publisher.EventPublisher
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class TestRunner(private val eventPublisher: EventPublisher): ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        run {
            eventPublisher.publish(GeneralEvent("hello"))
            eventPublisher.publish(SpecifiedEvent("hi"))
        }
    }
}