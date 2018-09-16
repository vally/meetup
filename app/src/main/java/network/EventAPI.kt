package network

import entity.Event
import entity.EventType
import java.util.*

interface EventAPI {

    fun getEvents(): List<Event>

    fun findEvents(name: String): List<Event>

    fun findEvents(date: Date): List<Event>

    fun findEvents(from: Date, to: Date): List<Event>

    fun findEvents(type: EventType): List<Event>

}