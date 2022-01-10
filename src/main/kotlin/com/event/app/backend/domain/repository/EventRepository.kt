package com.event.app.backend.domain.repository

import com.event.app.backend.domain.model.event.Event

interface EventRepository {

  /**
   * get Event
   */
  fun getEvents():List<Event>

  /**
   * get eventById
   */
  fun getEventById(eventId:String): Event

  /**
   * bookTickets
   */
  fun bookTickets(eventId:String,bookTicketCnt:Int,userId:String)

  /**
   * cancel event
   */
  fun cancel(eventId:String,userId:String)
}
