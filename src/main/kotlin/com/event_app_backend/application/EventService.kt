package com.event_app_backend.application

import com.event_app_backend.domain.model.event.Event
import com.event_app_backend.domain.repository.EventRepository
import org.springframework.stereotype.Service

@Service
class EventService (
  private val eventRepository: EventRepository
  ){

  /**
   * get Events
   */
  fun getEvents():List<Event>{
    return eventRepository.getEvents()
  }
}
