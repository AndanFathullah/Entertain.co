package com.dicoding.jetpacksubmission3.data

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.dicoding.jetpacksubmission3.data.source.local.LocalDataSource
import com.dicoding.jetpacksubmission3.data.source.local.entity.*
import com.dicoding.jetpacksubmission3.data.source.remote.ApiResponse
import com.dicoding.jetpacksubmission3.data.source.remote.RemoteDataSource
import com.dicoding.jetpacksubmission3.data.source.remote.response.*
import com.dicoding.jetpacksubmission3.utils.AppExecutors
import com.dicoding.jetpacksubmission3.vo.Resource

class FilmRepository private constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors
    ) : FilmDataSource {

    companion object{
        @Volatile
        private var instance: FilmRepository? = null
        fun getInstance(remoteData: RemoteDataSource, localData: LocalDataSource, appExecutors: AppExecutors): FilmRepository =
            instance ?: synchronized(this) {
                instance ?: FilmRepository(remoteData, localData, appExecutors).apply {
                    instance = this
                }
            }
    }

    override fun getMovies(sort: String): LiveData<Resource<PagedList<MoviesEntity>>> {
        return object : NetworkBoundResource<PagedList<MoviesEntity>, List<MoviesResponse>>(appExecutors) {
            override fun loadFromDB(): LiveData<PagedList<MoviesEntity>> {
                val config = PagedList.Config.Builder()
                    .setEnablePlaceholders(false)
                    .setInitialLoadSizeHint(4)
                    .setPageSize(4)
                    .build()

                return LivePagedListBuilder(localDataSource.getAllMovies(sort), config).build()
            }
            override fun shouldFetch(data: PagedList<MoviesEntity>?): Boolean =
                data == null || data.isEmpty()

            override fun createCall(): LiveData<ApiResponse<List<MoviesResponse>>> =
                remoteDataSource.getMovies()

            override fun saveCallResult(data: List<MoviesResponse>) {
                val moviesList = ArrayList<MoviesEntity>()
                for (response in data) {
                    val movies = MoviesEntity(
                        movieId = response.id,
                        title = response.title,
                        yearRealese = response.releaseDate,
                        genre = "",
                        duration = "",
                        rate = response.voteAverage,
                        overview = response.overview,
                        poster = response.posterPath,
                        banner = response.backdropPath,
                        url = "",
                        favorite = false
                    )
                    moviesList.add(movies)
                }
                localDataSource.insertMovies(moviesList)
            }
        }.asLiveData()
    }

    override fun getMoviesTrend(sort: String): LiveData<Resource<PagedList<MovieTrendEntity>>> {
        return object : NetworkBoundResource<PagedList<MovieTrendEntity>, List<MoviesTrendResponse>>(appExecutors) {
            override fun loadFromDB(): LiveData<PagedList<MovieTrendEntity>> {
                val config = PagedList.Config.Builder()
                    .setEnablePlaceholders(false)
                    .setInitialLoadSizeHint(4)
                    .setPageSize(4)
                    .build()

                return LivePagedListBuilder(localDataSource.getAllMoviesTrend(sort), config).build()
            }
            override fun shouldFetch(data: PagedList<MovieTrendEntity>?): Boolean =
                data == null || data.isEmpty()

            override fun createCall(): LiveData<ApiResponse<List<MoviesTrendResponse>>> =
                remoteDataSource.getMoviesTrend()

            override fun saveCallResult(data: List<MoviesTrendResponse>) {
                val moviesList = ArrayList<MovieTrendEntity>()
                for (response in data) {
                    val movies = MovieTrendEntity(
                        movieId = response.id,
                        title = response.title,
                        yearRealese = response.releaseDate,
                        genre = "",
                        duration = "",
                        rate = response.voteAverage,
                        overview = response.overview,
                        poster = response.posterPath,
                        banner = response.backdropPath,
                        url = "",
                        favorite = false
                    )
                    moviesList.add(movies)
                }
                localDataSource.insertMoviesTrend(moviesList)
            }
        }.asLiveData()
    }

    override fun getDetailMovies(movieId: Int): LiveData<Resource<MoviesEntity>> {
        return object : NetworkBoundResource<MoviesEntity, MoviesResponse>(appExecutors) {
            override fun loadFromDB(): LiveData<MoviesEntity> = localDataSource.getMoviesById(movieId)

            override fun shouldFetch(data: MoviesEntity?): Boolean =
                data != null && data.duration == "" && data.genre == "" && data.url == ""

            override fun createCall(): LiveData<ApiResponse<MoviesResponse>> =
                remoteDataSource.getDetailMovies(movieId)

            override fun saveCallResult(data: MoviesResponse) {
                val genres = StringBuilder().append("")
                for (i in data.genres.indices) {
                    if (i < data.genres.size - 1) {
                        genres.append("${data.genres[i].name}, ")
                    } else {
                        genres.append(data.genres[i].name)
                    }
                }

                val movie = MoviesEntity(
                    movieId = data.id,
                    title = data.title,
                    yearRealese = data.releaseDate,
                    genre = genres.toString(),
                    duration = data.runtime.toString()+" minutes",
                    rate = data.voteAverage,
                    overview = data.overview,
                    poster = data.posterPath,
                    banner = data.backdropPath,
                    url = data.homepage,
                    favorite = false
                )
                localDataSource.updateMovie(movie, false)
            }
        }.asLiveData()
    }

    override fun getDetailMoviesTrend(movieId: Int): LiveData<Resource<MovieTrendEntity>> {
        return object : NetworkBoundResource<MovieTrendEntity, MoviesTrendResponse>(appExecutors) {
            override fun loadFromDB(): LiveData<MovieTrendEntity> = localDataSource.getMoviesTrendById(movieId)

            override fun shouldFetch(data: MovieTrendEntity?): Boolean =
                data != null && data.duration == "" && data.genre == "" && data.url == ""

            override fun createCall(): LiveData<ApiResponse<MoviesTrendResponse>> =
                remoteDataSource.getDetailMoviesTrend(movieId)

            override fun saveCallResult(data: MoviesTrendResponse) {
                val genres = StringBuilder().append("")

                for (i in data.genres.indices) {
                    if (i < data.genres.size - 1) {
                        genres.append("${data.genres[i].name}, ")
                    } else {
                        genres.append(data.genres[i].name)
                    }
                }

                val movie = MovieTrendEntity(
                    movieId = data.id,
                    title = data.title,
                    yearRealese = data.releaseDate,
                    genre = genres.toString(),
                    duration = data.runtime.toString()+" minutes",
                    rate = data.voteAverage,
                    overview = data.overview,
                    poster = data.posterPath,
                    banner = data.backdropPath,
                    url = data.homepage,
                    favorite = false
                )
                localDataSource.updateMovieTrend(movie, false)
            }
        }.asLiveData()
    }

    override fun getMoviesFavorite(): LiveData<PagedList<MoviesEntity>> {
        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setInitialLoadSizeHint(4)
            .setPageSize(4)
            .build()
        return LivePagedListBuilder(localDataSource.getMoviesFav(), config).build()
    }

    override fun setMoviesFavorite(movie: MoviesEntity, state: Boolean) {
        appExecutors.diskIO().execute { localDataSource.setMoviesFavorite(movie, state)}
    }

    override fun getMoviesTrendFavorite(): LiveData<PagedList<MovieTrendEntity>> {
        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setInitialLoadSizeHint(4)
            .setPageSize(4)
            .build()
        return LivePagedListBuilder(localDataSource.getMoviesTrendFav(), config).build()
    }

    override fun setMoviesTrendFavorite(movie: MovieTrendEntity, state: Boolean) {
        appExecutors.diskIO().execute { localDataSource.setMovieTrendFavorite(movie, state)}
    }

    override fun getTvShows(sort: String): LiveData<Resource<PagedList<TvShowEntity>>> {
        return object : NetworkBoundResource<PagedList<TvShowEntity>, List<TvShowResponse>>(appExecutors) {
            override fun loadFromDB(): LiveData<PagedList<TvShowEntity>> {
                val config = PagedList.Config.Builder()
                    .setEnablePlaceholders(false)
                    .setInitialLoadSizeHint(4)
                    .setPageSize(4)
                    .build()

                return LivePagedListBuilder(localDataSource.getAllTvShows(sort), config).build()
            }
            override fun shouldFetch(data: PagedList<TvShowEntity>?): Boolean =
                data == null || data.isEmpty()

            override fun createCall(): LiveData<ApiResponse<List<TvShowResponse>>> =
                remoteDataSource.getTvShow()

            override fun saveCallResult(data: List<TvShowResponse>) {
                val moviesList = ArrayList<TvShowEntity>()
                for (response in data) {
                    val movies = TvShowEntity(
                        tvId = response.id,
                        title = response.name,
                        yearRealese = response.firstAirDate,
                        genre = "",
                        duration = "",
                        rate = response.voteAverage,
                        overview = response.overview,
                        poster = response.posterPath,
                        banner = response.backdropPath,
                        url = "",
                        favorite = false
                    )
                    moviesList.add(movies)
                }
                localDataSource.insertTvShow(moviesList)
            }
        }.asLiveData()
    }

    override fun getTvPopular(sort: String): LiveData<Resource<PagedList<TvPopularEntity>>> {
        return object : NetworkBoundResource<PagedList<TvPopularEntity>, List<TvPopularResponse>>(appExecutors) {
            override fun loadFromDB(): LiveData<PagedList<TvPopularEntity>> {
                val config = PagedList.Config.Builder()
                    .setEnablePlaceholders(false)
                    .setInitialLoadSizeHint(4)
                    .setPageSize(4)
                    .build()

                return LivePagedListBuilder(localDataSource.getAllTvPopular(sort), config).build()
            }
            override fun shouldFetch(data: PagedList<TvPopularEntity>?): Boolean =
                data == null || data.isEmpty()

            override fun createCall(): LiveData<ApiResponse<List<TvPopularResponse>>> =
                remoteDataSource.getTvPopular()

            override fun saveCallResult(data: List<TvPopularResponse>) {
                val moviesList = ArrayList<TvPopularEntity>()
                for (response in data) {
                    val movies = TvPopularEntity(
                        tvId = response.id,
                        title = response.name,
                        yearRealese = response.firstAirDate,
                        genre = "",
                        duration = "",
                        rate = response.voteAverage,
                        overview = response.overview,
                        poster = response.posterPath,
                        banner = response.backdropPath,
                        url = "",
                        favorite = false
                    )
                    moviesList.add(movies)
                }
                localDataSource.insertTvPopular(moviesList)
            }
        }.asLiveData()
    }

    override fun getDetailTvShow(tvId: Int): LiveData<Resource<TvShowEntity>> {
        return object : NetworkBoundResource<TvShowEntity, TvShowResponse>(appExecutors) {
            override fun loadFromDB(): LiveData<TvShowEntity> = localDataSource.getTvShowById(tvId)

            override fun shouldFetch(data: TvShowEntity?): Boolean =
                data != null && data.duration == "" && data.genre == "" && data.url == ""

            override fun createCall(): LiveData<ApiResponse<TvShowResponse>> =
                remoteDataSource.getDetailTv(tvId)

            override fun saveCallResult(data: TvShowResponse) {
                val genres = StringBuilder().append("")

                for (i in data.genres.indices) {
                    if (i < data.genres.size - 1) {
                        genres.append("${data.genres[i].name}, ")
                    } else {
                        genres.append(data.genres[i].name)
                    }
                }

                val movie = TvShowEntity(
                    tvId = data.id,
                    title = data.name,
                    yearRealese = data.firstAirDate,
                    genre = genres.toString(),
                    duration = data.episodeRunTime.toString() + " minutes",
                    rate = data.voteAverage,
                    overview = data.overview,
                    poster = data.posterPath,
                    banner = data.backdropPath,
                    url = data.homepage,
                    favorite = false
                )
                localDataSource.updateTvShow(movie, false)
            }
        }.asLiveData()
    }

    override fun getDetailTvPopular(tvId: Int): LiveData<Resource<TvPopularEntity>> {
        return object : NetworkBoundResource<TvPopularEntity, TvPopularResponse>(appExecutors) {
            override fun loadFromDB(): LiveData<TvPopularEntity> = localDataSource.getTvPopularById(tvId)

            override fun shouldFetch(data: TvPopularEntity?): Boolean =
                data != null && data.duration == "" && data.genre == "" && data.url == ""

            override fun createCall(): LiveData<ApiResponse<TvPopularResponse>> =
                remoteDataSource.getDetailTvPopular(tvId)

            override fun saveCallResult(data: TvPopularResponse) {
                val genres = StringBuilder().append("")
                for (i in data.genres.indices) {
                    if (i < data.genres.size - 1) {
                        genres.append("${data.genres[i].name}, ")
                    } else {
                        genres.append(data.genres[i].name)
                    }
                }

                val movie = TvPopularEntity(
                    tvId = data.id,
                    title = data.name,
                    yearRealese = data.firstAirDate,
                    genre = genres.toString(),
                    duration = data.episodeRunTime.toString()+" minutes",
                    rate = data.voteAverage,
                    overview = data.overview,
                    poster = data.posterPath,
                    banner = data.backdropPath,
                    url = data.homepage,
                    favorite = false
                )
                localDataSource.updateTvPopular(movie, false)
            }
        }.asLiveData()
    }

    override fun getTvShowFavorite(): LiveData<PagedList<TvShowEntity>> {
        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setInitialLoadSizeHint(4)
            .setPageSize(4)
            .build()
        return LivePagedListBuilder(localDataSource.getTvShowsFav(), config).build()
    }

    override fun setTvShowFavorite(movie: TvShowEntity, state: Boolean) {
        appExecutors.diskIO().execute { localDataSource.setTvShowFavorite(movie, state)}

    }

    override fun getTvPopularFavorite(): LiveData<PagedList<TvPopularEntity>> {
        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setInitialLoadSizeHint(4)
            .setPageSize(4)
            .build()
        return LivePagedListBuilder(localDataSource.getTvPopularFav(), config).build()
    }

    override fun setTvPopularFavorite(movie: TvPopularEntity, state: Boolean) {
        appExecutors.diskIO().execute { localDataSource.setTvPopularFavorite(movie, state)}
    }
}