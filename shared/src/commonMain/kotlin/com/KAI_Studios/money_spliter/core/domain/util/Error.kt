package com.KAI_Studios.money_spliter.core.domain.util

sealed class Error{
    data class AUTHENTICATION(val message:String,val info: Any?): Error()
    sealed class Network: Error() {
        object ERROR_200 : Network()
        object ERROR_300: Network()
        object ERROR_400: Network()
        object ERROR_500: Network()
        object ERROR_UNKNOWN: Network()
    }
    object UNKNOWN: Error()

}
