package com.example.eventbus.subscriber

import com.example.eventbus.publisher.EventPublisher
import com.example.eventbus.event.GeneralEvent
import com.google.common.eventbus.Subscribe
import org.slf4j.LoggerFactory

class EventSubscriber {
    val log = LoggerFactory.getLogger(EventPublisher::class.java)

    @Subscribe
    fun process(generalEvent: GeneralEvent) {
        log.info("Event Process. event(${generalEvent})")
    }
}