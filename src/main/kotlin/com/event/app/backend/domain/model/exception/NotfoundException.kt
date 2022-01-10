package com.event.app.backend.domain.model.exception

import com.event.app.backend.domain.model.error.ErrorCode
import org.springframework.http.HttpStatus

class NotfoundException(debugMessage: String) : BaseException(
  status = HttpStatus.NOT_FOUND,
  debugMessage = debugMessage,
  errorCode = ErrorCode.NOT_FOUND
) {


}
