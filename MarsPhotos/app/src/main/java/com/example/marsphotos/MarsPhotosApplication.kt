package com.example.marsphotos

import com.example.marsphotos.data.AppContainer
import com.example.marsphotos.data.DefaultAppContainer
import android.app.Application

class MarsPhotosApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}