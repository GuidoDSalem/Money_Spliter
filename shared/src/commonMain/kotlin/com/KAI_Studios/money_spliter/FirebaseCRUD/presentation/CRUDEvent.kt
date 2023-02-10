package com.KAI_Studios.money_spliter.FirebaseCRUD.presentation

sealed class CRUDEvent{
    data class NameChange(val newText:String): CRUDEvent()
    data class CvuChange(val newText:String): CRUDEvent()
    data class EmailChange(val newText:String): CRUDEvent()
    data class PasswordChange(val newText:String): CRUDEvent()
    object CreateClick: CRUDEvent()
    object UpdateClick: CRUDEvent()
    object DeleteClick: CRUDEvent()
    object ReadClick: CRUDEvent()
}
