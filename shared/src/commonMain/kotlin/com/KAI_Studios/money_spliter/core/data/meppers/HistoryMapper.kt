package com.KAI_Studios.money_spliter.core.data.meppers

import com.KAI_Studios.money_spliter.core.data.HistoryDto
import com.KAI_Studios.money_spliter.core.domain.models.History
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant

fun HistoryDto.toHistory(): History {
    return History(
            id = id,
            created = Instant.fromEpochMilliseconds(created),
            title = title,
            description = description,
            events = events?.mapNotNull {
                                it.toEvent()
            },
            participants = participants.map {
                                            it.toUser()
            },
            totalAmount = totalAmount
    )
}

fun History.toDto(): HistoryDto {
    return HistoryDto(
            id = id,
            created = created.toEpochMilliseconds(),
            title = title,
            description = description,
            events = events?.mapNotNull { it.toDto() },
            participants = participants.mapNotNull { it.toDto() },
            totalAmount = totalAmount
    )
}