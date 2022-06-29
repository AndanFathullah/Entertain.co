package com.dicoding.jetpacksubmission3.data.source.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dicoding.jetpacksubmission3.BuildConfig
import com.dicoding.jetpacksubmission3.api.ApiConfig
import com.dicoding.jetpacksubmission3.data.source.remote.response.*
import com.dicoding.jetpacksubmission3.utils.EspressoIdlingRecource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RemoteDataSource private constructor() {
    companion object{
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(): RemoteDataSource = instance ?: synchronized(this) {
            instance ?: RemoteDataSource()
        }
    }

    fun getMovies(): LiveData<ApiResponse<List<MoviesResponse>>> {
        EspressoIdlingRecource.increment()
        val resultMovies = MutableLiveData<ApiResponse<List<MoviesResponse>>>()
        val client = ApiConfig.getApiService().getMovies(BuildConfig.API_KEY)

        client.enqueue(object : Callback<MoviesListResponse> {
            override fun onResponse(call: Call<MoviesListResponse>, response: Response<MoviesListResponse>) {
                resultMovies.value = ApiResponse.success(response.body()?.results as List<MoviesResponse>)
                EspressoIdlingRecource.decrement()
            }

            override fun onFailure(call: Call<MoviesListResponse>, t: Throwable) {
                Log.e("RemoteDataSource", "getMovies onFailure : ${t.message}")
                EspressoIdlingRecource.decrement()
            }
        })

        return resultMovies
    }

    fun getMoviesTrend() : LiveData<ApiResponse<List<MoviesTrendResponse>>> {
        EspressoIdlingRecource.increment()
        val resultFilm = MutableLiveData<ApiResponse<List<MoviesTrendResponse>>>()
        val client = ApiConfig.getApiService().getMoviesTrend(BuildConfig.API_KEY)
        client.enqueue(object : Callback<MovieTrendListResponse> {
            override fun onResponse(call: Call<MovieTrendListResponse>, response: Response<MovieTrendListResponse>) {
                resultFilm.value = ApiResponse.success(response.body()?.results as List<MoviesTrendResponse>)
                EspressoIdlingRecource.decrement()
            }

            override fun onFailure(call: Call<MovieTrendListResponse>, t: Throwable) {
                Log.e("RemoteDataSource", "getMoviesTrend onFailure : ${t.message}")
                EspressoIdlingRecource.decrement()
            }
        })
        return resultFilm
    }

    fun getDetailMovies(movieId: Int): LiveData<ApiResponse<MoviesResponse>> {
        EspressoIdlingRecource.increment()
        val resultFilm = MutableLiveData<ApiResponse<MoviesResponse>>()
        val client = ApiConfig.getApiService().getMovieDetail(movieId, BuildConfig.API_KEY)
        client.enqueue(object : Callback<MoviesResponse> {
            override fun onResponse(call: Call<MoviesResponse>, response: Response<MoviesResponse>) {
                resultFilm.value = ApiResponse.success(response.body() as MoviesResponse)
                EspressoIdlingRecource.decrement()
            }

            override fun onFailure(call: Call<MoviesResponse>, t: Throwable) {
                Log.e("RemoteDataSource", "getDetailMovies onFailure : ${t.message}")
                EspressoIdlingRecource.decrement()
            }
        })
        return resultFilm
    }

    fun getDetailMoviesTrend(movieId: Int): LiveData<ApiResponse<MoviesTrendResponse>> {
        EspressoIdlingRecource.increment()
        val resultFilm = MutableLiveData<ApiResponse<MoviesTrendResponse>>()
        val client = ApiConfig.getApiService().getMovieTrendDetail(movieId, BuildConfig.API_KEY)
        client.enqueue(object : Callback<MoviesTrendResponse> {
            override fun onResponse(call: Call<MoviesTrendResponse>, response: Response<MoviesTrendResponse>) {
                resultFilm.value = ApiResponse.success(response.body() as MoviesTrendResponse)
                EspressoIdlingRecource.decrement()
            }

            override fun onFailure(call: Call<MoviesTrendResponse>, t: Throwable) {
                Log.e("RemoteDataSource", "getDetailMoviesTrend onFailure : ${t.message}")
                EspressoIdlingRecource.decrement()
            }
        })
        return resultFilm
    }

    fun getTvShow() : LiveData<ApiResponse<List<TvShowResponse>>> {
        EspressoIdlingRecource.increment()
        val resultTv = MutableLiveData<ApiResponse<List<TvShowResponse>>>()
        val client = ApiConfig.getApiService().getTvShows(BuildConfig.API_KEY)
        client.enqueue(object : Callback<TvShowListResponse> {
            override fun onResponse(call: Call<TvShowListResponse>, response: Response<TvShowListResponse>) {
                resultTv.value = ApiResponse.success(response.body()?.results as List<TvShowResponse>)
                EspressoIdlingRecource.decrement()
            }

            override fun onFailure(call: Call<TvShowListResponse>, t: Throwable) {
                Log.e("RemoteDataSource", "getTvShow onFailure : ${t.message}")
                EspressoIdlingRecource.decrement()
            }
        })
        return resultTv
    }

    fun getTvPopular() : LiveData<ApiResponse<List<TvPopularResponse>>> {
        EspressoIdlingRecource.increment()
        val resultTv = MutableLiveData<ApiResponse<List<TvPopularResponse>>>()
        val client = ApiConfig.getApiService().getTvPopular(BuildConfig.API_KEY)
        client.enqueue(object : Callback<TvPopularListResponse> {
            override fun onResponse(call: Call<TvPopularListResponse>, response: Response<TvPopularListResponse>) {
                resultTv.value = ApiResponse.success(response.body()?.results as List<TvPopularResponse>)
                EspressoIdlingRecource.decrement()
            }

            override fun onFailure(call: Call<TvPopularListResponse>, t: Throwable) {
                Log.e("RemoteDataSource", "getTvPopular onFailure : ${t.message}")
                EspressoIdlingRecource.decrement()
            }
        })
        return resultTv
    }

    fun getDetailTv(tvId: Int): LiveData<ApiResponse<TvShowResponse>> {
        EspressoIdlingRecource.increment()
        val resultFilm = MutableLiveData<ApiResponse<TvShowResponse>>()
        val client = ApiConfig.getApiService().getTvShowDetail(tvId, BuildConfig.API_KEY)
        client.enqueue(object : Callback<TvShowResponse> {
            override fun onResponse(call: Call<TvShowResponse>, response: Response<TvShowResponse>) {
                resultFilm.value = ApiResponse.success(response.body() as TvShowResponse)
                EspressoIdlingRecource.decrement()
            }

            override fun onFailure(call: Call<TvShowResponse>, t: Throwable) {
                Log.e("RemoteDataSource", "getDetailTv onFailure : ${t.message}")
                EspressoIdlingRecource.decrement()
            }
        })
        return resultFilm
    }

    fun getDetailTvPopular(tvId: Int): LiveData<ApiResponse<TvPopularResponse>> {
        EspressoIdlingRecource.increment()
        val resultFilm = MutableLiveData<ApiResponse<TvPopularResponse>>()
        val client = ApiConfig.getApiService().getTvPopularDetail(tvId, BuildConfig.API_KEY)
        client.enqueue(object : Callback<TvPopularResponse> {
            override fun onResponse(call: Call<TvPopularResponse>, response: Response<TvPopularResponse>) {
                resultFilm.value = ApiResponse.success(response.body() as TvPopularResponse)
                EspressoIdlingRecource.decrement()
            }

            override fun onFailure(call: Call<TvPopularResponse>, t: Throwable) {
                Log.e("RemoteDataSource", "getDetailTv onFailure : ${t.message}")
                EspressoIdlingRecource.decrement()
            }
        })
        return resultFilm
    }


}