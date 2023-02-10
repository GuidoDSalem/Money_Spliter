package com.KAI_Studios.money_spliter.core.data

data class EventDto(
        val id: Int,
        val author: UserDto,
        val title: String,
        val description: String,
        val amount: Int,
        val participants: List<UserDto>,
        val time: Long
)
