package com.dicoding.jetpacksubmission3.data

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.dicoding.jetpacksubmission3.data.source.local.entity.*
import com.dicoding.jetpacksubmission3.vo.Resource

interface FilmDataSource {
    fun getMovies(sort: String): LiveData<Resource<PagedList<MoviesEntity>>>
    fun getMoviesTrend(sort: String): LiveData<Resource<PagedList<MovieTrendEntity>>>
    fun getDetailMovies(movieId: Int): LiveData<Resource<MoviesEntity>>
    fun getDetailMoviesTrend(movieId: Int): LiveData<Resource<MovieTrendEntity>>

    fun getMoviesFavorite(): LiveData<PagedList<MoviesEntity>>
    fun setMoviesFavorite(movie: MoviesEntity, state: Boolean)

    fun getMoviesTrendFavorite(): LiveData<PagedList<MovieTrendEntity>>
    fun setMoviesTrendFavorite(movie: MovieTrendEntity, state: Boolean)

    fun getTvShows(sort: String): LiveData<Resource<PagedList<TvShowEntity>>>
    fun getTvPopular(sort: String): LiveData<Resource<PagedList<TvPopularEntity>>>
    fun getDetailTvShow(tvId: Int): LiveData<Resource<TvShowEntity>>
    fun getDetailTvPopular(tvId: Int): LiveData<Resource<TvPopularEntity>>

    fun getTvShowFavorite(): LiveData<PagedList<TvShowEntity>>
    fun setTvShowFavorite(movie: TvShowEntity, state: Boolean)

    fun getTvPopularFavorite(): LiveData<PagedList<TvPopularEntity>>
    fun setTvPopularFavorite(movie: TvPopularEntity, state: Boolean)
}