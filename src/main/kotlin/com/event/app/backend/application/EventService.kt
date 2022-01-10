package com.event.app.backend.application

import com.event.app.backend.domain.model.error.ErrorMessage
import com.event.app.backend.domain.model.event.Event
import com.event.app.backend.domain.model.exception.MethodArgumentNotValidException
import com.event.app.backend.domain.repository.EventRepository
import com.event.app.backend.domain.repository.UserRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.client.HttpClientErrorException
import java.lang.Exception

@Service
class EventService (
  private val eventRepository: EventRepository,
  private val userRepository: UserRepository
  ){

  /**
   * get Events
   */
  fun getEvents():List<Event>{
    return eventRepository.getEvents()
  }

  /**
   * book Tickets
   */
  @Transactional
  fun bookTickets(eventId:String,bookTicketCnt:Int,userId:String):HttpStatus{

    // get targetEvent
    val targetEvent = getEventById(eventId)

    // check if you can book tickets
    targetEvent.checkAvailableTicket(bookTicketCnt)

    // book tickets
    eventRepository.bookTickets(eventId,bookTicketCnt,userId)



    return HttpStatus.OK
  }

  /**
   * update Tickets
   */
  @Transactional
  fun updateTickets(eventId:String,updateTicketCnt:Int,userId:String):HttpStatus{

    // get targetEvent
    val targetEvent = getEventById(eventId)

    // current user Tickets
    val userCurrentTickets = userRepository.getTicketCntByEventUserId(eventId,userId)

    // check if you can book tickets considering current user tickets
    targetEvent.checkAvailableTicket(updateTicketCnt-userCurrentTickets)

    // book tickets
    eventRepository.bookTickets(eventId,updateTicketCnt,userId)

    return HttpStatus.OK
  }


  /**
   * cancel Events
   */
  @Transactional
  fun cancel(eventId:String,userId:String):HttpStatus{
    // cancel tickets
    eventRepository.cancel(eventId,userId)
    return HttpStatus.OK
  }

  /**
   * get target Event
   */
  private fun getEventById(eventId:String) = eventRepository.getEventById(eventId)
}
