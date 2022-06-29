package com.dicoding.jetpacksubmission3.ui.favorites.moviefav

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.dicoding.jetpacksubmission3.data.FilmRepository
import com.dicoding.jetpacksubmission3.data.source.local.entity.MovieTrendEntity
import com.dicoding.jetpacksubmission3.data.source.local.entity.MoviesEntity

class MovieFavViewModel(private val filmRepository: FilmRepository): ViewModel() {

    fun getMoviesFav(): LiveData<PagedList<MoviesEntity>> = filmRepository.getMoviesFavorite()

    fun setMoviesFav(moviesEntity: MoviesEntity){
        val newState = !moviesEntity.favorite
        filmRepository.setMoviesFavorite(moviesEntity, newState)
    }

    fun getMoviesTrendFav(): LiveData<PagedList<MovieTrendEntity>> = filmRepository.getMoviesTrendFavorite()

    fun setMoviesTrendFav(moviesTrendEntity: MovieTrendEntity){
        val newState = !moviesTrendEntity.favorite
        filmRepository.setMoviesTrendFavorite(moviesTrendEntity, newState)
    }
}