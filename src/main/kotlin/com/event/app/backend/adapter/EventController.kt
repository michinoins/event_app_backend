package com.event.app.backend.adapter

import com.event.app.backend.application.EventService
import com.event.app.backend.domain.model.event.Event
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/event")
class EventController
(
  private val eventService: EventService
  ) {
  /**
   * get events
   */
  @GetMapping("/")
  fun getEvents(): List<Event> = eventService.getEvents()

  /**
   * book tickets
   */
  @PostMapping("/book/{eventId}/{bookTicketsCnt}")
  fun bookTickets(
    @PathVariable("eventId") eventId:String,
    @PathVariable("tickets") bookTicketCnt:Int,
  ): HttpStatus = eventService.bookTickets(eventId,bookTicketCnt,userId ="user01")

  /**
   * update tickets
   */
  @PutMapping("/book/{eventId}/{updateTicketsCnt}")
  fun updateTickets(
    @PathVariable("eventId") eventId:String,
    @PathVariable("tickets") bookTicketCnt:Int,
  ): HttpStatus = eventService.updateTickets(eventId,bookTicketCnt,userId ="user01")

  /**
   * cancel tickets
   */
  @PostMapping("/book/{eventId}/cancel")
  fun bookTickets(
    @PathVariable("eventId") eventId:String,
  ): HttpStatus = eventService.cancel(eventId,userId = "user01")


}
