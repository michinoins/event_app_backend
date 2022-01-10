package com.event.app.backend.domain.model.exception

import com.event.app.backend.domain.model.error.ErrorCode
import org.springframework.http.HttpStatus

class MethodArgumentNotValidException(debugMessage: String) : BaseException(
  status = HttpStatus.BAD_REQUEST,
  debugMessage = debugMessage,
  errorCode = ErrorCode.NOT_FOUND
) {


}
