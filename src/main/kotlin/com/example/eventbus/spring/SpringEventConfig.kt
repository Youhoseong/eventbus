package com.example.eventbus.spring

import com.example.eventbus.spring.publisher.SpringEventPublisher
import com.example.eventbus.spring.subscriber.SpringEventSubscriber
import org.springframework.context.ApplicationEventPublisher
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SpringEventConfig {
    @Bean(name = ["springEventSubscriber"])
    fun eventSubscriber(): SpringEventSubscriber {
        // no event bus
        return SpringEventSubscriber()
    }

    @Bean(name = ["springEventPublisher"])
    fun eventPublisher(applicationEventPublisher: ApplicationEventPublisher): SpringEventPublisher {
        return SpringEventPublisher(applicationEventPublisher = applicationEventPublisher)
    }
}