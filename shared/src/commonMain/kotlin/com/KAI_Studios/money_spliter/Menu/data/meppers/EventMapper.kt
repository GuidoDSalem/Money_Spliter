package com.KAI_Studios.money_spliter.Menu.data.meppers

import com.KAI_Studios.money_spliter.Menu.data.EventDto
import com.KAI_Studios.money_spliter.Menu.data.UserDto
import com.KAI_Studios.money_spliter.Menu.domain.models.Event
import com.KAI_Studios.money_spliter.Menu.domain.models.User
import kotlinx.datetime.*

fun EventDto.toEvent(): Event {
    return Event(
            id = id,
            author = author.toUser(),
            title = title,
            description = description,
            amount = amount,
            participants = participants.map {
                it.toUser()
            },
            mouth = getMonth(time),
            day = getDay(time),
            hour = getHour(time),
            min = getMinute(time),
            time = time
    )

}

fun Event.toDto(): EventDto{
    return EventDto(
            id = id,
            author = author.toDto(),
            title = title,
            description = description,
            amount = amount,
            participants = participants.mapNotNull {
                it.toDto()
            },
            time = time
    )
}



private fun getMonth(timestamp: Long): Int{
    val zone = TimeZone.currentSystemDefault()
    val time = Instant.fromEpochMilliseconds(timestamp)
    val localDateTime = time.toLocalDateTime(zone)
    return localDateTime.monthNumber
}

private fun getDay(timestamp: Long): Int{
    val zone = TimeZone.currentSystemDefault()
    val time = Instant.fromEpochMilliseconds(timestamp)
    val localDateTime = time.toLocalDateTime(zone)
    return localDateTime.dayOfMonth
}

private fun getHour(timestamp: Long): Int{
    val zone = TimeZone.currentSystemDefault()
    val time = Instant.fromEpochMilliseconds(timestamp)
    val localDateTime = time.toLocalDateTime(zone)
    return localDateTime.hour
}

private fun getMinute(timestamp: Long): Int{
    val zone = TimeZone.currentSystemDefault()
    val time = Instant.fromEpochMilliseconds(timestamp)
    val localDateTime = time.toLocalDateTime(zone)
    return localDateTime.minute
}

