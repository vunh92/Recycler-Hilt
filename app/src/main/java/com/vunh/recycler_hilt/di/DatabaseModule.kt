package com.vunh.recycler_hilt.di

import android.content.Context
import androidx.room.Room
import com.vunh.recycler_hilt.database.AppDatabase
import com.vunh.recycler_hilt.database.MovieDao
import com.vunh.recycler_hilt.utils.AppUtils
import com.vunh.recycler_hilt.utils.Constant
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun provideAppDatabase(appContext: Context) : AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            Constant.DATABASENAME,
        ).allowMainThreadQueries().build()
    }

    @Singleton
    @Provides
    fun provideMovieDao(appDatabase: AppDatabase) : MovieDao {
        return appDatabase.movieDao
    }
}