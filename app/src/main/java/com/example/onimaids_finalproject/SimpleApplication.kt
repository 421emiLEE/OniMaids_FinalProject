package com.example.onimaids_finalproject

import android.app.Application
import com.example.onimaids_finalproject.di.appModules
import org.koin.core.context.startKoin

class SimpleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin{
            modules(appModules)
        }
    }
}