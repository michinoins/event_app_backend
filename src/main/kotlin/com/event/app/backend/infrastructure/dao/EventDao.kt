
package com.event.app.backend.infrastructure.dao

import com.event.app.backend.infrastructure.table.EventsTableRecord
import org.seasar.doma.Dao
import org.seasar.doma.Select
import org.seasar.doma.Update
import org.seasar.doma.boot.ConfigAutowireable

@ConfigAutowireable
@Dao
interface EventDao {

  @Select
  fun getEvents():List<EventsTableRecord>

  @Select
  fun getEventById(eventId:String):EventsTableRecord

  @Update(sqlFile = true)
  fun updateTicketCnt(eventId:String,bookTicketCnt:Int):Int

  @Update(sqlFile = true)
  fun subtractTicketCnt(eventId:String,subtractCount:Int):Int
}


