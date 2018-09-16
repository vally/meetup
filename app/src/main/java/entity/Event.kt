package entity

import java.util.*

data class Event(
        val id: String,
        val type: EventType,
        val name: String,
        val speakers: List<Speaker>,
        val date: Date,
        val venue: String,
        val agenda: String,
        val description: String)
