package com.dicoding.jetpacksubmission3.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.jetpacksubmission3.data.FilmRepository
import com.dicoding.jetpacksubmission3.data.source.local.entity.MovieTrendEntity
import com.dicoding.jetpacksubmission3.data.source.local.entity.MoviesEntity
import com.dicoding.jetpacksubmission3.vo.Resource

class DetailMoviesViewModel(private val filmRepository: FilmRepository): ViewModel() {

    private lateinit var detailMovie: LiveData<Resource<MoviesEntity>>
    private lateinit var detailMovieTrend: LiveData<Resource<MovieTrendEntity>>

    fun setSelectedMovie(movieId: Int, film: String){
        when(film) {
            "MOVIES" -> detailMovie = filmRepository.getDetailMovies(movieId)
            "TREND" -> detailMovieTrend = filmRepository.getDetailMoviesTrend(movieId)
        }

    }

    fun getMovie() = detailMovie

    fun getTrendMovie() = detailMovieTrend

    fun setFavoriteMovie(){
        val filmResource = detailMovie.value
        if(filmResource != null){
            val filmResourceData = filmResource.data

            if(filmResourceData != null){
                val newState = !filmResourceData.favorite
                filmRepository.setMoviesFavorite(filmResourceData, newState)
            }
        }
    }

    fun setFavoriteMovieTrend(){
        val filmResource = detailMovieTrend.value
        if(filmResource != null){
            val filmResourceData = filmResource.data

            if(filmResourceData != null){
                val newState = !filmResourceData.favorite
                filmRepository.setMoviesTrendFavorite(filmResourceData, newState)
            }
        }
    }


}