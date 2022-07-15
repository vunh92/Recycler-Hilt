package com.vunh.recycler_hilt

import android.app.Application
import com.vunh.recycler_hilt.api.RecyclerService
import com.vunh.recycler_hilt.database.AppDatabase
import com.vunh.recycler_hilt.di.AppComponent
import com.vunh.recycler_hilt.di.DaggerAppComponent
import com.vunh.recycler_hilt.repository.RecyclerRepositoryImpl
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApp : Application() {
}