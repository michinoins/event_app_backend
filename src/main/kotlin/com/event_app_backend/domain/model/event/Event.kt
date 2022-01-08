package com.event_app_backend.domain.model.event

import java.time.LocalDate

class Event(
  val name: String,
  val description:String,
  val date:LocalDate,
  val availableTickets:Int
){
}
