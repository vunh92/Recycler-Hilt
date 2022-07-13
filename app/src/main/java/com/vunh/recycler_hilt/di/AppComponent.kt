package com.vunh.recycler_hilt.di

import android.content.Context
import com.vunh.recycler_hilt.view.CreateMovieActivity
import com.vunh.recycler_hilt.view.DetailMovieActivity
import com.vunh.recycler_hilt.view.RecyclerActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModule::class, DatabaseModule::class, ServiceModule::class])
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: RecyclerActivity)
    fun inject(activity: CreateMovieActivity)
    fun inject(activity: DetailMovieActivity)
}