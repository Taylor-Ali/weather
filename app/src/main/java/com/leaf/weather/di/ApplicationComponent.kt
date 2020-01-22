package com.leaf.weather.di

import com.leaf.weather.WeatherApplication
import com.leaf.weather.di.common.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: WeatherApplication)
}