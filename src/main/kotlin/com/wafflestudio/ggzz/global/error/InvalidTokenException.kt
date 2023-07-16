package com.wafflestudio.ggzz.global.error

import com.wafflestudio.ggzz.global.common.exception.CustomException.BadRequestException
import com.wafflestudio.ggzz.global.common.exception.ErrorType.BadRequest.INVALID_TOKEN

class InvalidTokenException(type: String): BadRequestException(INVALID_TOKEN, "The $type token is invalid.")