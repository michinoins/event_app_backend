package com.event_app_backend.infrastructure

import com.event_app_backend.domain.repository.EventRepository

class EventRepositoryImpl(
   val eventDao:EventDao
):EventRepository {
}
