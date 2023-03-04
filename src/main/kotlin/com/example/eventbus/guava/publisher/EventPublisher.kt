package com.example.eventbus.guava.publisher

import com.example.eventbus.event.Event
import com.google.common.eventbus.EventBus

class EventPublisher(private val eventBus: EventBus) {
    fun publish(event: Event) {
        // post -> find subscribe by event type -> transfer event with dispatcher
        eventBus.post(event)
    }
}
