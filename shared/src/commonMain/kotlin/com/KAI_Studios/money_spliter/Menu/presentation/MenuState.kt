package com.KAI_Studios.money_spliter.Menu.presentation

import com.KAI_Studios.money_spliter.core.domain.models.History

data class MenuState(
        val histories: List<History> = listOf(),
        val error: Error? = null,
)
