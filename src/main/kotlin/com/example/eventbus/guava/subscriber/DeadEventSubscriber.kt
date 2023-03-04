package com.example.eventbus.guava.subscriber

import com.google.common.eventbus.DeadEvent
import com.google.common.eventbus.Subscribe
import org.slf4j.LoggerFactory

class DeadEventSubscriber {
    val log = LoggerFactory.getLogger(DeadEventSubscriber::class.java)

    @Subscribe
    fun processDeadLetter(deadEvent: DeadEvent) {
        log.info("DeadEvent Process. deadEvent(${deadEvent.event})")
    }
}