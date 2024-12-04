package com.example.todoappkotlinkmpcompose

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform