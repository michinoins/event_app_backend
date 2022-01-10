package com.event.app.backend.domain.model.exception

import com.event.app.backend.domain.model.error.Error
import org.springframework.boot.logging.LogLevel
import org.springframework.http.HttpStatus
import javax.servlet.http.HttpServletRequest
import kotlin.math.log

abstract class BaseException(
  private val status: HttpStatus,
  private val debugMessage: String,
  private val errorCode:String
  ):RuntimeException(){
  /**
   * make error
   */
  fun createError(): Error = Error.of(
    status = status,
    message = debugMessage,
    exception = this,
    errorCode = errorCode
  )
}

