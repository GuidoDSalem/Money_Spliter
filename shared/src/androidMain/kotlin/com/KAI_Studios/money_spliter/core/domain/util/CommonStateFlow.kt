package com.KAI_Studios.money_spliter.core.domain.util

import kotlinx.coroutines.flow.StateFlow

actual class CommonStateFlow<T> actual constructor(
        private val flow: StateFlow<T>
) : StateFlow<T> by flow