package com.KAI_Studios.money_spliter.android.core.data

import com.KAI_Studios.money_spliter.core.data.HistoryDto
import com.KAI_Studios.money_spliter.core.data.meppers.toDto
import com.KAI_Studios.money_spliter.core.domain.models.Event
import com.KAI_Studios.money_spliter.core.domain.models.History
import com.KAI_Studios.money_spliter.core.domain.Repository
import com.KAI_Studios.money_spliter.core.domain.util.CommonFlow
import com.KAI_Studios.money_spliter.core.domain.util.Error
import com.KAI_Studios.money_spliter.core.domain.util.Resource
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await

class HistoryRepository(
        val db: FirebaseFirestore
): Repository {
    override suspend fun createHistory(history: History): Resource<String> {
        val task = db.collection("history")
            .add(history.toDto())
        return if(task.isSuccessful){
            Resource.Success("History Successfully Created")
        } else{
            Resource.Fail(type = Error.Network.ERROR_200, message = "Error creating History")
        }
    }

    override suspend fun deleteHistory(history: History): Result<String> {
        TODO("Not yet implemented")
    }

    override suspend fun addEvent(
            history: History,
            event: Event
    ): Result<String> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteEvent(
            history: History,
            event: Event
    ): Result<String> {
        TODO("Not yet implemented")
    }

    override suspend fun updateHistory(history: History): Result<String> {
        TODO("Not yet implemented")
    }

    override suspend fun getAllHistory(): Resource<CommonFlow<List<History>>> {
        TODO("Not yet implemented")
//        val historyTask = db.collection("history").get()
//
//        return if(historyTask.isSuccessful){
//            val allHistory = historyTask.await().documents.mapNotNull {
//                it.toObject<HistoryDto>()
//            }
//
//
//
//        }
//        else{
//            return Resource.Fail("Some Error")
//        }

    }


}