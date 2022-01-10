package com.event.app.backend.domain.repository

import com.event.app.backend.domain.model.event.Event

interface UserRepository {

  /**
   * get tickets by user,event id
   */
  fun getTicketCntByEventUserId(eventId:String,userId:String):Int
}
