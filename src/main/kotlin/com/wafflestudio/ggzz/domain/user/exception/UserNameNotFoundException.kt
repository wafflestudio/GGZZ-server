package com.wafflestudio.ggzz.domain.user.exception

import com.wafflestudio.ggzz.global.common.exception.CustomException.NotFoundException
import com.wafflestudio.ggzz.global.common.exception.ErrorType.NotFound.USER_NOT_FOUND

class UserNameNotFoundException(val username: String): NotFoundException(USER_NOT_FOUND, "User '$username' does not exists.")