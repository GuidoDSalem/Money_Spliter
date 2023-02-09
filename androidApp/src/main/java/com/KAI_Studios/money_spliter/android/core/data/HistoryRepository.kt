package com.KAI_Studios.money_spliter.android.core.data

import com.KAI_Studios.money_spliter.Menu.data.meppers.toDto
import com.KAI_Studios.money_spliter.Menu.domain.models.Event
import com.KAI_Studios.money_spliter.Menu.domain.models.History
import com.KAI_Studios.money_spliter.core.domain.Repository
import com.KAI_Studios.money_spliter.core.domain.util.Error
import com.KAI_Studios.money_spliter.core.domain.util.Resource
import com.google.firebase.firestore.FirebaseFirestore

class HistoryRepository(
        val db: FirebaseFirestore
): Repository {
    override fun createHistory(history: History): Resource<String> {
        val task = db.collection("history")
            .add(history.toDto())
        return if(task.isSuccessful){
            Resource.Success("History Successfully Created")
        } else{
            Resource.Fail(type = Error.Network.ERROR_200, message = "Error creating History")
        }
    }

    override fun deleteHistory(history: History): Result<String> {
        TODO("Not yet implemented")
    }

    override fun addEvent(
            history: History,
            event: Event
    ): Result<String> {
        TODO("Not yet implemented")
    }

    override fun deleteEvent(
            history: History,
            event: Event
    ): Result<String> {
        TODO("Not yet implemented")
    }

    override fun updateHistory(history: History): Result<String> {
        TODO("Not yet implemented")
    }


}