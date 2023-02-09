package com.KAI_Studios.money_spliter.core.domain.util


import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow

actual open class CommonFlow<T> actual constructor(
        private val flow: Flow<T>
): Flow<T> by flow {

    private fun subscribe(
            coroutineScope: CoroutineScope,
            dispatcher: CoroutineDispatcher,
            onCollect: (T) -> Unit
    ): kotlinx.coroutines.DisposableHandle {
        val job = coroutineScope.launch(dispatcher) {
            flow.collect(onCollect)
        }
        return DisposableHandle { job.cancel() }
    }

    fun subscribe(
            onCollect: (T) -> Unit
    ): kotlinx.coroutines.DisposableHandle {
        return subscribe(
                coroutineScope = GlobalScope,
                dispatcher = Dispatchers.Main,
                onCollect = onCollect
        )
    }
}