package com.event.app.backend.infrastructure.repository

import com.event.app.backend.domain.model.event.Event
import com.event.app.backend.domain.repository.EventRepository
import com.event.app.backend.infrastructure.table.EventsTableRecord
import org.springframework.stereotype.Repository
import java.time.LocalDate

@Repository
class EventRepositoryImpl(
 // private val eventDao: EventDao,
 // private val userDao: UserDao,
) : EventRepository {

  /**
   * get Events
   */
  override fun getEvents(): List<Event> {
   // return convertToEvent(eventDao.getEvents())
    return listOf(Event(
      name = "event1",
      description =  "description1",
      date = LocalDate.now(),
      availableTickets = 1
    ))
  }

  /**
   * get eventById
   */
  override fun getEventById(eventId:String): Event {
    return Event(
      name="event1",
      description = "event1 description",
      date = LocalDate.now(),
      availableTickets = 10,
    )
    // return convertToEvent(eventDao.getEventById())
  }


  /**
   * book tickets
   */
  override fun bookTickets(eventId: String,bookTicketCnt:Int,userId:String) {

    // update Event Table
    subtractTicketCntForEvent(eventId,bookTicketCnt)


    // update User Table
    // userDao.insertUsersTickets(UsersTicketsTableRecord.from(userId,eventId,bookTicketCnt))
  }

  /**
   * cancel event
   */
  override fun cancel(eventId:String,userId:String) {
    // get user's ticketCnt
    // val cancelTicketCnt =  userDao.getTicketCntByEventUserId(eventId,userId)
    // subtract EventTicket
    // subtractTicketCntForEvent(eventId,cancelTicketCnt)
  }


  private fun subtractTicketCntForEvent(eventId:String,subtractCount:Int){
    // subtract ticket count
    // eventDao.subtractTicketCnt(eventId,subtractCount)
  }

  /**
   * convert TableRecord to Event
   */
  private fun convertToEvent(eventsTableRecords: List<EventsTableRecord>):List<Event>
    = eventsTableRecords.map{
      Event(
        name = it.name,
        description = it.description,
        date = it.eventDate,
        availableTickets = it.availableTickets
      )
    }
  /**
   * convert TableRecord to Event
   */
  private fun convertToEvent(eventsTableRecord: EventsTableRecord):Event
     = eventsTableRecord.let {
    Event(
      name = it.name,
      description = it.description,
      date = it.eventDate,
      availableTickets = it.availableTickets
    )
  }
}
