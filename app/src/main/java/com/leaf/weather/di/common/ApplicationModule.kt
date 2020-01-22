package com.leaf.weather.di.common

import android.app.Application
import android.content.Context
import com.leaf.weather.WeatherApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val weatherApplication: WeatherApplication) {

    @Provides
    @Singleton
    fun providesApplication(): Application {
        return weatherApplication
    }
}
