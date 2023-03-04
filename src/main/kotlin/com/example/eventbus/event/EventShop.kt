package com.example.eventbus.event

sealed interface Event {
    val contents: String
}

data class GeneralEvent(
    override val contents: String,
) : Event

data class SpecifiedEvent(
    override val contents: String,
) : Event