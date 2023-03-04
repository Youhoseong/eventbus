package com.example.eventbus.spring.publisher

import com.example.eventbus.spring.SpringEvent
import org.springframework.context.ApplicationEventPublisher

class SpringEventPublisher(
    private val applicationEventPublisher: ApplicationEventPublisher
) {
   fun publish(springEvent: SpringEvent) {
       applicationEventPublisher.publishEvent(springEvent)
   }
}