package com.KAI_Studios.money_spliter.core.domain

import com.KAI_Studios.money_spliter.Menu.domain.models.Event
import com.KAI_Studios.money_spliter.Menu.domain.models.History

interface Repository {

    fun createHistory(history: History): Unit

    fun deleteHistory(history: History):Unit

    fun addEvent(history: History,event: Event): Unit

    fun deleteEvent(history: History,event: Event): Unit

    fun updateHistory(history: History): Unit

}