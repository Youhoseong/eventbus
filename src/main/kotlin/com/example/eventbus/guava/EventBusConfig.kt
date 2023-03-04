package com.example.eventbus.guava

import com.example.eventbus.guava.publisher.EventPublisher
import com.example.eventbus.guava.subscriber.DeadEventSubscriber
import com.example.eventbus.guava.subscriber.EventSubscriber
import com.google.common.eventbus.EventBus
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class EventBusConfig {
    @Bean
    fun generalEventBus(): EventBus {
        // 1:1 with subscribe registry
        val eventBus = EventBus("generalEventBus")
        registerSubscribers(eventBus)
        return eventBus
    }

    @Bean
    fun eventPublisher(eventBus: EventBus): EventPublisher {
        return EventPublisher(eventBus)
    }

    fun registerSubscribers(eventBus: EventBus) {
        val eventSubscriber = EventSubscriber() // no bean
        val deadEventSubscriber = DeadEventSubscriber()
        eventBus.register(eventSubscriber)
        eventBus.register(deadEventSubscriber)
    }
}