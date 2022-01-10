package com.event.app.backend.infrastructure.repository

import com.event.app.backend.domain.repository.UserRepository
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl(
  // private val userDao: UserDao
) : UserRepository {

  override fun getTicketCntByEventUserId(eventId: String, userId: String): Int {
    // return userDao.getTicketCntByEventUserId(eventId,userId)
    return 1
  }

}
