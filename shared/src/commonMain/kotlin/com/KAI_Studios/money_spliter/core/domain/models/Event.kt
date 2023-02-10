package com.KAI_Studios.money_spliter.core.domain.models

import com.KAI_Studios.money_spliter.core.data.UserDto
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

data class Event(
        val id: Int,
        val author: User,
        val title: String,
        val description: String,
        val amount: Int,
        val participants: List<User>,
        val mouth: Int,
        val day: Int,
        val hour: Int,
        val min: Int,
        val time: Long
)


