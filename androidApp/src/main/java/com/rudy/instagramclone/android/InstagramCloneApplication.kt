package com.rudy.instagramclone.android

import android.app.Application
import com.rudy.instagramclone.android.di.appModule
import org.koin.core.context.startKoin

class InstagramCloneApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            modules(appModule)
        }
    }
}