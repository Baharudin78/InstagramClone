package com.rudy.instagramclone

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform