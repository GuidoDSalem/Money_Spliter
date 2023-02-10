package com.KAI_Studios.money_spliter.Menu.presentation

import com.KAI_Studios.money_spliter.core.domain.Repository
import com.KAI_Studios.money_spliter.core.domain.util.toCommonStateFlow
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow

class MenuViewModel(
        private val menuRepository: Repository,
        private val coroutineScope: CoroutineScope?
) {
    private val viewModelScope = coroutineScope ?: CoroutineScope(Dispatchers.Main)
    private val _state = MutableStateFlow<MenuState>(MenuState())
    val state = _state.toCommonStateFlow()

    init {

    }

}