package com.KAI_Studios.money_spliter.android.core.data

import com.KAI_Studios.money_spliter.Menu.data.meppers.toDto
import com.KAI_Studios.money_spliter.Menu.domain.models.Event
import com.KAI_Studios.money_spliter.Menu.domain.models.History
import com.KAI_Studios.money_spliter.core.domain.Repository
import com.google.firebase.firestore.FirebaseFirestore

class HistoryRepository(
        val db: FirebaseFirestore
): Repository {
    override fun createHistory(history: History) {

        val task = db.collection("history")
            .add(history.toDto())
        


    }

    override fun deleteHistory(history: History) {
        TODO("Not yet implemented")
    }

    override fun addEvent(
            history: History,
            event: Event
    ) {
        TODO("Not yet implemented")
    }

    override fun deleteEvent(
            history: History,
            event: Event
    ) {
        TODO("Not yet implemented")
    }

    override fun updateHistory(history: History) {
        TODO("Not yet implemented")
    }

}