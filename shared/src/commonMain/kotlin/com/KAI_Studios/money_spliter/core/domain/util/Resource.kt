package com.KAI_Studios.money_spliter.core.domain.util

sealed class Resource<T>(val data:T? = null, val message: String? = null){
    class Success<T>(data: T) : Resource<T>(data)
    class Fail<T>(message: String, data: T? = null,val type: Error?): Resource<T>(data, message)
}