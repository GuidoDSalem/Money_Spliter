package com.KAI_Studios.money_spliter.Menu.domain.models

data class User(
        val id: Int,
        val name: String,
        val cvu: String,
        val mail: String,
        val password: String,
        val historyDebt: Int? = 0
)


/*
data class UserDto(
        val id: Int,
        val name: String,
        val cvu: String,
        val mail: String,
        val password: String,
)
*/
