package com.event.app.backend.domain.model.error

import org.springframework.boot.logging.LogLevel
import org.springframework.http.HttpStatus
import kotlin.math.log

class Error(
  val status: HttpStatus,
  val message:String,
  val exception:Throwable,
  val errorCode: String,
) {

  companion object{
    fun of (
      status:HttpStatus,
      message:String,
      exception: Throwable,
      errorCode: String
    ): Error =
      Error(
        status = status,
        message = message,
        exception = exception,
        errorCode = errorCode,
      )
  }
}
