package com.event_app_backend.domain.repository

import com.event_app_backend.domain.model.event.Event

interface EventRepository {

  /**
   * get Event
   */
  fun getEvents():List<Event>
}
