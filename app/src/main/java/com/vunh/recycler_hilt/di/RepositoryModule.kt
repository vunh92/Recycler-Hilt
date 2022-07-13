package com.vunh.recycler_hilt.di

import com.vunh.recycler_hilt.repository.RecyclerRepository
import com.vunh.recycler_hilt.repository.RecyclerRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {
    @Binds
    fun provideRecyclerRepository(recyclerRepositoryImpl: RecyclerRepositoryImpl): RecyclerRepository
}