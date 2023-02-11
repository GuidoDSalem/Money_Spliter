package com.KAI_Studios.money_spliter.android.FirebaseCRUD.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.KAI_Studios.money_spliter.FirebaseCRUD.presentation.CRUDEvent
import com.KAI_Studios.money_spliter.FirebaseCRUD.presentation.CRUDViewModel
import com.KAI_Studios.money_spliter.core.domain.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

@HiltViewModel
class AndroidFirebaseCRUDViewModel @Inject constructor(
        private val viewModelScope: CoroutineScope,
        private val crudRepository: Repository
): ViewModel() {

    private val viewModel by lazy {
        CRUDViewModel(
                crudRepository = crudRepository,
                coroutineScope = viewModelScope
        )
    }

    val state = viewModel.state

    fun onEvent(event: CRUDEvent){
        viewModel.onEvent(event)
    }


}