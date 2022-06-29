package com.dicoding.jetpacksubmission3.data.source.local

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import com.dicoding.jetpacksubmission3.data.source.local.entity.MovieTrendEntity
import com.dicoding.jetpacksubmission3.data.source.local.entity.MoviesEntity
import com.dicoding.jetpacksubmission3.data.source.local.entity.TvPopularEntity
import com.dicoding.jetpacksubmission3.data.source.local.entity.TvShowEntity
import com.dicoding.jetpacksubmission3.data.source.local.room.FilmDao
import com.dicoding.jetpacksubmission3.utils.SortUtils
import com.dicoding.jetpacksubmission3.utils.SortUtils.MOVIES_ENTITY
import com.dicoding.jetpacksubmission3.utils.SortUtils.MOVIES_TREND_ENTITY
import com.dicoding.jetpacksubmission3.utils.SortUtils.TV_POPULAR_ENTITY
import com.dicoding.jetpacksubmission3.utils.SortUtils.TV_SHOWS_ENTITY


class LocalDataSource private constructor(private val mFilmDao: FilmDao){

    companion object {

        private var INSTANCE: LocalDataSource? = null

        fun getInstance(filmDao : FilmDao): LocalDataSource {
            if (INSTANCE == null) {
                INSTANCE = LocalDataSource(filmDao)
            }
            return INSTANCE as LocalDataSource
        }
    }


    fun getAllMovies(sort: String): DataSource.Factory<Int, MoviesEntity> = mFilmDao.getMovies(SortUtils.getSortedQuery(sort, MOVIES_ENTITY))
    fun getMoviesById(movieId: Int): LiveData<MoviesEntity> = mFilmDao.getMovieById(movieId)
    fun getMoviesFav(): DataSource.Factory<Int, MoviesEntity> = mFilmDao.getMovieFav()

    fun getAllMoviesTrend(sort: String): DataSource.Factory<Int, MovieTrendEntity> = mFilmDao.getMoviesTrend(SortUtils.getSortedQuery(sort, MOVIES_TREND_ENTITY))
    fun getMoviesTrendById(movieId: Int): LiveData<MovieTrendEntity> = mFilmDao.getMovieTrendById(movieId)
    fun getMoviesTrendFav(): DataSource.Factory<Int, MovieTrendEntity> = mFilmDao.getMovieTrendFav()

    fun getAllTvShows(sort: String): DataSource.Factory<Int, TvShowEntity> = mFilmDao.getTvShows(SortUtils.getSortedQuery(sort, TV_SHOWS_ENTITY))
    fun getTvShowById(tvId: Int): LiveData<TvShowEntity> = mFilmDao.getTvShowById(tvId)
    fun getTvShowsFav(): DataSource.Factory<Int, TvShowEntity> = mFilmDao.getTvShowFav()

    fun getAllTvPopular(sort: String): DataSource.Factory<Int, TvPopularEntity> = mFilmDao.getTvPopular(SortUtils.getSortedQuery(sort, TV_POPULAR_ENTITY))
    fun getTvPopularById(tvId: Int): LiveData<TvPopularEntity> = mFilmDao.getTvPopularById(tvId)
    fun getTvPopularFav(): DataSource.Factory<Int, TvPopularEntity> = mFilmDao.getTvPopularFav()

    fun insertMovies(movies: List<MoviesEntity>) = mFilmDao.insertMovies(movies)
    fun setMoviesFavorite(movie: MoviesEntity, newState: Boolean){
        movie.favorite = newState
        mFilmDao.updateMovie(movie)
    }
    fun updateMovie(movie: MoviesEntity, newState: Boolean) {
        movie.favorite = newState
        mFilmDao.updateMovie(movie)
    }

    fun insertMoviesTrend(movies: List<MovieTrendEntity>) = mFilmDao.insertMoviesTrend(movies)
    fun setMovieTrendFavorite(movie: MovieTrendEntity, newState: Boolean){
        movie.favorite = newState
        mFilmDao.updateMovieTrend(movie)
    }
    fun updateMovieTrend(movie: MovieTrendEntity, newState: Boolean) {
        movie.favorite = newState
        mFilmDao.updateMovieTrend(movie)
    }

    fun insertTvShow(tv: List<TvShowEntity>) = mFilmDao.insertTvShows(tv)
    fun setTvShowFavorite(tv: TvShowEntity, newState: Boolean){
        tv.favorite = newState
        mFilmDao.updateTvShow(tv)
    }
    fun updateTvShow(tv: TvShowEntity, newState: Boolean) {
        tv.favorite = newState
        mFilmDao.updateTvShow(tv)
    }

    fun insertTvPopular(tv: List<TvPopularEntity>) = mFilmDao.insertTvPopular(tv)
    fun setTvPopularFavorite(tv: TvPopularEntity, newState: Boolean){
        tv.favorite = newState
        mFilmDao.updateTvPopular(tv)
    }
    fun updateTvPopular(tv: TvPopularEntity, newState: Boolean) {
        tv.favorite = newState
        mFilmDao.updateTvPopular(tv)
    }
}