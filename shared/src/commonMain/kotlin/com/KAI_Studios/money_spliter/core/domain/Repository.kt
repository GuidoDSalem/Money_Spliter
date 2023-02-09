package com.KAI_Studios.money_spliter.core.domain

import com.KAI_Studios.money_spliter.Menu.domain.models.Event
import com.KAI_Studios.money_spliter.Menu.domain.models.History
import com.KAI_Studios.money_spliter.core.domain.util.Resource

interface Repository {

    fun createHistory(history: History): Resource<String>

    fun deleteHistory(history: History):Result<String>

    fun addEvent(history: History,event: Event): Result<String>

    fun deleteEvent(history: History,event: Event): Result<String>

    fun updateHistory(history: History): Result<String>

}