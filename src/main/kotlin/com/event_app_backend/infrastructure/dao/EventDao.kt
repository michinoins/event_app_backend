package com.event_app_backend.infrastructure.dao

import com.event_app_backend.infrastructure.table.EventTableRecord
import org.seasar.doma.Dao
import org.seasar.doma.Select
import org.seasar.doma.boot.ConfigAutowireable

@ConfigAutowireable
@Dao
interface EventDao {

  @Select
  fun getEvents():List<EventTableRecord>

}
