package com.voavanga.pos

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform