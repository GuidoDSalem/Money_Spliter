package com.KAI_Studios.money_spliter

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform