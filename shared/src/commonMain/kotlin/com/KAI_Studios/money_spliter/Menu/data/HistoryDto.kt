package com.KAI_Studios.money_spliter.Menu.data

data class HistoryDto(
        val id: Int,
        val created: Long,
        val title: String,
        val description: String,
        val events: List<EventDto>?,
        val participants: List<UserDto>,
        val totalAmount: Int
)
