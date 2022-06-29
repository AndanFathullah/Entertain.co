package com.dicoding.jetpacksubmission3.ui.detail

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.jetpacksubmission3.BuildConfig
import com.dicoding.jetpacksubmission3.R
import com.dicoding.jetpacksubmission3.data.source.local.entity.MovieTrendEntity
import com.dicoding.jetpacksubmission3.data.source.local.entity.MoviesEntity
import com.dicoding.jetpacksubmission3.databinding.ActivityDetailMoviesBinding
import com.dicoding.jetpacksubmission3.viewmodel.ViewModelFactory
import com.dicoding.jetpacksubmission3.vo.Status

class DetailMoviesActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var detailMoviesBinding: ActivityDetailMoviesBinding
    private lateinit var viewModel: DetailMoviesViewModel
    private var film: String? = null

    companion object {
        const val EXTRA_FILM = "extra_film"
        const val FILM = "film"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailMoviesBinding = ActivityDetailMoviesBinding.inflate(layoutInflater)
        setContentView(detailMoviesBinding.root)

        loading(true)

        val factory = ViewModelFactory.getInstance(this)
        viewModel = ViewModelProvider(this, factory)[DetailMoviesViewModel::class.java]

        detailMoviesBinding.btnBack.setNavigationOnClickListener{onBackPressed()}
        detailMoviesBinding.favButton.setOnClickListener(this)

        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getInt(EXTRA_FILM)
            film = extras.getString(FILM)

            film?.let { viewModel.setSelectedMovie(movieId, it) }
            setupFilmFav()

            if (film == "MOVIES") {
                viewModel.getMovie().observe(this, {movies ->
                    when(movies.status){
                        Status.LOADING -> loading(true)
                        Status.SUCCESS -> {
                            loading(false)
                            movies.data?.let { populateMovie(it) }
                            movies.data?.let { playTrailer(it) }
                        }
                        Status.ERROR -> {
                            loading(false)
                            Toast.makeText(applicationContext, "Something Wrong..", Toast.LENGTH_SHORT).show()
                        }
                    }
                })
            }else if(film == "TREND") {
                viewModel.getTrendMovie().observe(this, {trendMovies ->
                    when(trendMovies.status){
                        Status.LOADING -> loading(true)
                        Status.SUCCESS -> {
                            loading(false)
                            trendMovies.data?.let { populateTrendMovie(it) }
                            trendMovies.data?.let { playTrendTrailer(it) }
                        }
                        Status.ERROR -> {
                            loading(false)
                            Toast.makeText(applicationContext, "Something Wrong..", Toast.LENGTH_SHORT).show()
                        }
                    }
                })
            }
        }
    }
    private fun playTrailer(movieDetailEntity: MoviesEntity){
        detailMoviesBinding.trailerButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(movieDetailEntity.url))
            startActivity(intent)
        }
    }
    private fun playTrendTrailer(movieEntity: MovieTrendEntity){
        detailMoviesBinding.trailerButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(movieEntity.url))
            startActivity(intent)
        }
    }

    private fun loading(load: Boolean){
        when(load){
            true -> detailMoviesBinding.progressBar.visibility = View.VISIBLE
            false -> detailMoviesBinding.progressBar.visibility = View.GONE
        }
    }

    private fun populateMovie(movieDetailEntity: MoviesEntity) {
        with(detailMoviesBinding){
            yearRelease.text = movieDetailEntity.yearRealese
            title.text = movieDetailEntity.title
            genre.text = movieDetailEntity.genre.toString()
            filmRate.text = movieDetailEntity.rate.toString()
            duration.text = movieDetailEntity.duration
            overview.text = movieDetailEntity.overview
        }
        Glide.with(this)
            .load(BuildConfig.IMG_URL+movieDetailEntity.banner)
            .apply(RequestOptions().override(3500, 2000))
            .centerCrop()
            .into(detailMoviesBinding.poster)

        loading(false)
    }

    private fun populateTrendMovie(movieEntity: MovieTrendEntity) {
        with(detailMoviesBinding){
            yearRelease.text = movieEntity.yearRealese
            title.text = movieEntity.title
            genre.text = movieEntity.genre.toString()
            filmRate.text = movieEntity.rate.toString()
            duration.text = movieEntity.duration
            overview.text = movieEntity.overview
        }
        Glide.with(this)
            .load(BuildConfig.IMG_URL+movieEntity.banner)
            .apply(RequestOptions().override(3500, 2000))
            .centerCrop()
            .into(detailMoviesBinding.poster)

        loading(false)
    }


    private fun setupFilmFav(){
        if (film == "MOVIES") {
            viewModel.getMovie().observe(this, {movies ->
                when(movies.status){
                    Status.LOADING -> loading(true)
                    Status.SUCCESS -> {
                        if (movies.data !=null){
                            loading(false)
                            val fav = movies.data.favorite
                            setFavorited(fav)
                        }
                    }
                    Status.ERROR -> {
                        loading(false)
                        Toast.makeText(applicationContext, "Something Wrong..", Toast.LENGTH_SHORT).show()
                    }
                }
            })
        }else if(film == "TREND") {
            viewModel.getTrendMovie().observe(this, {trendMovies ->
                when(trendMovies.status){
                    Status.LOADING -> loading(true)
                    Status.SUCCESS -> {
                        if (trendMovies.data !=null){
                            loading(false)
                            val fav = trendMovies.data.favorite
                            setFavorited(fav)
                        }
                    }
                    Status.ERROR -> {
                        loading(false)
                        Toast.makeText(applicationContext, "Something Wrong..", Toast.LENGTH_SHORT).show()
                    }
                }
            })
        }
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.fav_button -> {
                    try {
                        viewModel.setFavoriteMovie()
                    }catch (error: Throwable){
                        viewModel.setFavoriteMovieTrend()
                    }
                }
            }
        }
    }

    private fun setFavorited(fav: Boolean){
        when(fav){
            true -> detailMoviesBinding.favButton
                .setImageResource(R.drawable.ic_baseline_bookmark_24)
            false -> detailMoviesBinding.favButton
                .setImageResource(R.drawable.ic_baseline_bookmark_border_24)
        }
    }
}