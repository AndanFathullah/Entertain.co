package com.dicoding.jetpacksubmission3.api

import com.dicoding.jetpacksubmission3.data.source.remote.response.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("discover/movie")
    fun getMovies(
        @Query("api_key") apiKey: String
    ) : Call<MoviesListResponse>

    @GET("movie/now_playing")
    fun getMoviesTrend(
        @Query("api_key") apiKey: String
    ) : Call<MovieTrendListResponse>

    @GET("movie/{movie_id}")
    fun getMovieDetail(
        @Path("movie_id") id: Int,
        @Query("api_key") apiKey: String
    ) : Call<MoviesResponse>

    @GET("movie/{movie_id}")
    fun getMovieTrendDetail(
        @Path("movie_id") id: Int,
        @Query("api_key") apiKey: String
    ) : Call<MoviesTrendResponse>

    @GET("discover/tv")
    fun getTvShows(
        @Query("api_key") apiKey: String
    ) : Call<TvShowListResponse>

    @GET("tv/on_the_air")
    fun getTvPopular(
        @Query("api_key") apiKey: String
    ) : Call<TvPopularListResponse>

    @GET("tv/{tv_id}")
    fun getTvShowDetail(
        @Path("tv_id") id: Int,
        @Query("api_key") apiKey: String
    ) : Call<TvShowResponse>

    @GET("tv/{tv_id}")
    fun getTvPopularDetail(
        @Path("tv_id") id: Int,
        @Query("api_key") apiKey: String
    ) : Call<TvPopularResponse>
}