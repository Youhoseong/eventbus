package com.example.eventbus.spring

import com.example.eventbus.spring.publisher.SpringEventPublisher
import com.example.eventbus.spring.subscriber.SpringEventSubscriber
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.context.ApplicationEventPublisher
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.event.ApplicationEventMulticaster
import org.springframework.context.event.SimpleApplicationEventMulticaster
import org.springframework.core.task.SimpleAsyncTaskExecutor

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

    @Bean(name = ["applicationEventMulticaster"]) // bean name must be fixed
    @ConditionalOnMissingBean
    fun applicationEventMulticaster(): ApplicationEventMulticaster {
        val eventMulticaster = SimpleApplicationEventMulticaster()
        eventMulticaster.setTaskExecutor(SimpleAsyncTaskExecutor())
        return eventMulticaster
    }
}