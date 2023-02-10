package com.KAI_Studios.money_spliter.android.core.presentation

import com.KAI_Studios.money_spliter.core.domain.models.History

sealed class Screen(val route: String) {
    object FirebaseCRUDScreen: Screen("CRUD/")
    object MenuScreen: Screen("menu/")
    object HistoryScreen:Screen("history/{id}"){
        fun withArgs(history: History): String{
            val id = history.id
            return "history/$id"
        }
    }
}