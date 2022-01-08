package com.event_app_backend.infrastructure.repository

import com.event_app_backend.domain.model.event.Event
import com.event_app_backend.domain.repository.EventRepository
import com.event_app_backend.infrastructure.dao.EventDao
import com.event_app_backend.infrastructure.table.EventTableRecord
import org.springframework.stereotype.Repository
import java.time.LocalDate
import java.time.LocalDateTime

@Repository
class EventRepositoryImpl(
   //private val eventDao: EventDao
) : EventRepository {

  override fun getEvents(): List<Event> {
    return listOf(Event(
      name="event1",
      description  ="mock event1",
      date = LocalDate.now(),
      availableTickets = 10),
      Event(
        name="event1",
        description  ="mock event1",
        date = LocalDate.now(),
        availableTickets = 10
      )
    )

    //convertToEvent(eventDao.getEvents())
  }

  /**
   * convert TableRecord to Event
   */
  private fun convertToEvent(eventTableRecords: List<EventTableRecord>):List<Event>
    = eventTableRecords.map{
      Event(
        name = it.name,
        description = it.description,
        date = it.eventDate,
        availableTickets = it.availableTickets
      )
    }
}
