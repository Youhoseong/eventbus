package com.example.eventbus.guava

import com.example.eventbus.guava.event.GeneralEvent
import com.example.eventbus.guava.event.SpecifiedEvent
import com.example.eventbus.guava.publisher.EventPublisher
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class GuavaTestRunner(private val guavaEventPublisher: EventPublisher): ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        run {
            guavaEventPublisher.publish(GeneralEvent("hello"))
            guavaEventPublisher.publish(SpecifiedEvent("hi"))
        }
    }
}