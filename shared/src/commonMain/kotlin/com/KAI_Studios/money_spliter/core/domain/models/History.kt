package com.KAI_Studios.money_spliter.core.domain.models

import com.KAI_Studios.money_spliter.core.data.EventDto
import com.KAI_Studios.money_spliter.core.data.UserDto
import kotlinx.datetime.Instant

data class History (
        val id: Int,
        val created: Instant,
        val title: String,
        val description: String,
        val events: List<Event>?,
        val participants: List<User>,
        val totalAmount: Int
)



/*
data class HistoryDto(
        val id: Int,
        val created: Long,
        val title: String,
        val description: String,
        val events: List<EventDto>?,
        val participants: List<UserDto>,
        val totalAmount: Int
)
*/
