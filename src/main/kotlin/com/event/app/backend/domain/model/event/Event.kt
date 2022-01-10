package com.event.app.backend.domain.model.event

import com.event.app.backend.domain.model.error.ErrorMessage
import com.event.app.backend.domain.model.exception.MethodArgumentNotValidException
import java.time.LocalDate

class Event(
  val name: String,
  val description:String,
  val date:LocalDate,
  val availableTickets:Int
){
  companion object{
    fun of(
      name:String,
      description: String,
      date:LocalDate,
      availableTickets: Int
    ) = Event(
      name = name,
      description = description,
      date = date,
      availableTickets
    )
  }
  /**
   * check Available Tickets
   */
  fun checkAvailableTicket(addTicketCnt:Int){
    if(addTicketCnt>this.availableTickets)
    throw MethodArgumentNotValidException(ErrorMessage.MSG_ERROR001.format(availableTickets))
  }
}
