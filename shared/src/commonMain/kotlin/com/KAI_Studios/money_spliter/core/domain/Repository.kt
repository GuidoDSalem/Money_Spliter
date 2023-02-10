package com.KAI_Studios.money_spliter.core.domain

import com.KAI_Studios.money_spliter.core.domain.models.Event
import com.KAI_Studios.money_spliter.core.domain.models.History
import com.KAI_Studios.money_spliter.core.domain.util.CommonFlow
import com.KAI_Studios.money_spliter.core.domain.util.Resource
import kotlinx.coroutines.flow.Flow

interface Repository {

    suspend fun createHistory(history: History): Resource<String>

    suspend fun deleteHistory(history: History):Result<String>

    suspend fun addEvent(history: History, event: Event): Result<String>

    suspend fun deleteEvent(history: History, event: Event): Result<String>

    suspend fun updateHistory(history: History): Result<String>

    suspend fun getAllHistory(): Resource<CommonFlow<List<History>>>

}