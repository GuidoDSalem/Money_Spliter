package com.KAI_Studios.money_spliter.core.data.meppers

import com.KAI_Studios.money_spliter.core.data.UserDto
import com.KAI_Studios.money_spliter.core.domain.models.User

fun UserDto.toUser(): User {
    return User(
            id = id,
            name = name,
            cvu = cvu,
            mail = mail,
            password = password
    )
}

fun User.toDto(): UserDto {
    return UserDto(
            id = id,
            name = name,
            cvu = cvu,
            mail = mail,
            password = password
    )
}