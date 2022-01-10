package com.event.app.backend.infrastructure.table

import org.seasar.doma.Column
import org.seasar.doma.Entity
import org.seasar.doma.Id
import org.seasar.doma.Table
import org.seasar.doma.jdbc.entity.NamingType
import java.time.LocalDate
import java.time.LocalDateTime

@Entity(immutable = true,naming=NamingType.SNAKE_LOWER_CASE)
@Table(name = "events")
class EventsTableRecord(
  @Id
  val id:String,
  @Column(name = "name")
  val name:String,
  @Column(name = "description")
  val description:String,
  @Column(name = "event_date")
  val eventDate: LocalDate,
  @Column(name = "availableTickets")
  val availableTickets:Int,
  @Column(name = "created_at")
  val createdAt:LocalDateTime,
  @Column(name = "updated_at")
  val updatedAt:LocalDateTime,
) {
  companion object{

  }

}
