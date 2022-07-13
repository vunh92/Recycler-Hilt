package com.vunh.recycler_hilt.repository

import androidx.lifecycle.LiveData
import com.vunh.recycler_hilt.model.Movie
import com.vunh.recycler_hilt.model.Response
import com.vunh.recycler_hilt.model.Status
import com.vunh.recycler_hilt.usecase.UseCaseResult

interface RecyclerRepository {
    suspend fun getMovieList(): UseCaseResult<List<Movie>>
    suspend fun getMovie(movieId: String): UseCaseResult<Response>
    suspend fun insert(movie: Movie) : UseCaseResult<Status>
    suspend fun update(movie: Movie) : UseCaseResult<Status>
    suspend fun delete(movieId: String) : UseCaseResult<Status>
    suspend fun clear()
    suspend fun insertAll(movies: List<Movie>)
    val movies: LiveData<List<Movie>>
}