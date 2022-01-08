package com.event_app_backend.adapter

import com.event_app_backend.application.EventService
import com.event_app_backend.domain.model.event.Event
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/event")
class EventController
(
  private val eventService: EventService
  ) {
  /**
   * get Events
   */
  @GetMapping("/")
  fun getEvents(): List<Event> = eventService.getEvents()
}
