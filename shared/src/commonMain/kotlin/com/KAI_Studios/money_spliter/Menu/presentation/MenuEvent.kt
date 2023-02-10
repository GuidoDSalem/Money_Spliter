package com.KAI_Studios.money_spliter.Menu.presentation

import com.KAI_Studios.money_spliter.core.domain.models.History

sealed class MenuEvent{
    object OpenHistory: MenuEvent()
    object DeleteHistory: MenuEvent()

}
