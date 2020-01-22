package com.leaf.weather

import android.app.Application
import com.leaf.weather.di.ApplicationComponent
import com.leaf.weather.di.DaggerApplicationComponent
import com.leaf.weather.di.common.ApplicationModule

class WeatherApplication : Application() {
    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        setup()
    }

    private fun setup() {
        component = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this)).build()
        component.inject(this)

    }

    fun getApplicationComponent(): ApplicationComponent {
        return component
    }

    companion object {
        lateinit var instance: WeatherApplication private set
    }
}