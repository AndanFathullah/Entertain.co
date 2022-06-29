package com.dicoding.jetpacksubmission3.data.source.local.room

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.room.*
import androidx.sqlite.db.SimpleSQLiteQuery
import com.dicoding.jetpacksubmission3.data.source.local.entity.MovieTrendEntity
import com.dicoding.jetpacksubmission3.data.source.local.entity.MoviesEntity
import com.dicoding.jetpacksubmission3.data.source.local.entity.TvPopularEntity
import com.dicoding.jetpacksubmission3.data.source.local.entity.TvShowEntity


@Dao
interface FilmDao {
    //Movies
    @RawQuery(observedEntities = [MoviesEntity::class])
    fun getMovies(query: SimpleSQLiteQuery): DataSource.Factory<Int, MoviesEntity>

    @Query("SELECT * FROM movies_entity WHERE movieId = :movieId")
    fun getMovieById(movieId: Int): LiveData<MoviesEntity>

    @Query("SELECT * FROM movies_entity WHERE favorite = 1")
    fun getMovieFav(): DataSource.Factory<Int, MoviesEntity>

    //MoviesTrend
    @RawQuery(observedEntities = [MovieTrendEntity::class])
    fun getMoviesTrend(query: SimpleSQLiteQuery): DataSource.Factory<Int, MovieTrendEntity>

    @Query("SELECT * FROM movies_trend_entity WHERE movieId = :movieId")
    fun getMovieTrendById(movieId: Int): LiveData<MovieTrendEntity>

    @Query("SELECT * FROM movies_trend_entity WHERE favorite = 1")
    fun getMovieTrendFav(): DataSource.Factory<Int, MovieTrendEntity>

    //TvShows
    @RawQuery(observedEntities = [TvShowEntity::class])
    fun getTvShows(query: SimpleSQLiteQuery): DataSource.Factory<Int, TvShowEntity>

    @Query("SELECT * FROM tv_shows_entity WHERE tvId= :tvId")
    fun getTvShowById(tvId: Int): LiveData<TvShowEntity>

    @Query("SELECT * FROM tv_shows_entity WHERE favorite = 1")
    fun getTvShowFav(): DataSource.Factory<Int, TvShowEntity>

    //TvPopular
    @RawQuery(observedEntities = [TvPopularEntity::class])
    fun getTvPopular(query: SimpleSQLiteQuery): DataSource.Factory<Int, TvPopularEntity>

    @Query("SELECT * FROM tv_popular_entity WHERE tvId= :tvId")
    fun getTvPopularById(tvId: Int): LiveData<TvPopularEntity>

    @Query("SELECT * FROM tv_popular_entity WHERE favorite = 1")
    fun getTvPopularFav(): DataSource.Factory<Int, TvPopularEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovies(movies: List<MoviesEntity>)

    @Update
    fun updateMovie(movie: MoviesEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMoviesTrend(moviesTrend: List<MovieTrendEntity>)

    @Update
    fun updateMovieTrend(movieTrend: MovieTrendEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTvShows(tvShows: List<TvShowEntity>)

    @Update
    fun updateTvShow(tvShow: TvShowEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTvPopular(tvPopular: List<TvPopularEntity>)

    @Update
    fun updateTvPopular(tvPopular: TvPopularEntity)
}