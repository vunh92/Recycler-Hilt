package com.vunh.recycler_hilt.viewmodel.recycler_view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vunh.recycler_hilt.repository.RecyclerRepositoryImpl
import javax.inject.Inject

class RecyclerViewModelFactory @Inject constructor(
    private val recyclerRepositoryImpl: RecyclerRepositoryImpl
    ): ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(RecyclerViewModel::class.java)) {
            RecyclerViewModel(recyclerRepositoryImpl) as T
        }else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}