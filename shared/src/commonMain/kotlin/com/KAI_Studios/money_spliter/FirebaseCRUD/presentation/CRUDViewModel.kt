package com.KAI_Studios.money_spliter.FirebaseCRUD.presentation

import com.KAI_Studios.money_spliter.core.domain.Repository
import com.KAI_Studios.money_spliter.core.domain.util.toCommonStateFlow
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow

class CRUDViewModel(
        private val crudRepository: Repository,
        private val coroutineScope: CoroutineScope?
) {
    private val viewModelScope = coroutineScope ?: CoroutineScope(Dispatchers.Main)
    private val _state = MutableStateFlow<CRUDState>(CRUDState())
    val state = _state.toCommonStateFlow()

    fun onEvent(event: CRUDEvent){
        when(event){
            CRUDEvent.CreateClick -> TODO()
            is CRUDEvent.CvuChange -> TODO()
            CRUDEvent.DeleteClick -> TODO()
            is CRUDEvent.EmailChange -> TODO()
            is CRUDEvent.NameChange -> TODO()
            is CRUDEvent.PasswordChange -> TODO()
            CRUDEvent.ReadClick -> TODO()
            CRUDEvent.UpdateClick -> TODO()
        }

    }


}