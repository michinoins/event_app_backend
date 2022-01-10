package com.event.app.backend.infrastructure.table

import org.seasar.doma.Column
import org.seasar.doma.Entity
import org.seasar.doma.Id
import org.seasar.doma.Table
import org.seasar.doma.jdbc.entity.NamingType
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

@Entity(immutable = true,naming=NamingType.SNAKE_LOWER_CASE)
@Table(name = "users_tickets")
class UsersTicketsTableRecord(
  @Id
  val id:String,
  @Column(name = "user_id")
  val userId:String,
  @Column(name = "event_id")
  val eventId:String,
  @Column(name = "ticket")
  val ticket: Int,
  @Column(name = "created_at")
  val createdAt:LocalDateTime,
  @Column(name = "updated_at")
  val updatedAt:LocalDateTime,
) {
  companion object{

    fun from(userId:String,eventId:String,ticket:Int): UsersTicketsTableRecord {
      val now = LocalDateTime.now()
      return UsersTicketsTableRecord(
        id = UUID.randomUUID().toString(),
        userId = userId,
        eventId = eventId,
        ticket = ticket,
        createdAt = now,
        updatedAt = now
      )
    }
  }

}
