package com.dicoding.jetpacksubmission3.ui.detail

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.jetpacksubmission3.BuildConfig
import com.dicoding.jetpacksubmission3.R
import com.dicoding.jetpacksubmission3.data.source.local.entity.TvPopularEntity
import com.dicoding.jetpacksubmission3.data.source.local.entity.TvShowEntity
import com.dicoding.jetpacksubmission3.databinding.ActivityDetailTvBinding
import com.dicoding.jetpacksubmission3.viewmodel.ViewModelFactory
import com.dicoding.jetpacksubmission3.vo.Status

class DetailTvActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var detailTvBinding: ActivityDetailTvBinding
    private lateinit var viewModel: DetailTvViewModel
    private var film: String? = null

    companion object {
        const val EXTRA_TV = "extra_tv"
        const val FILM = "film"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailTvBinding = ActivityDetailTvBinding.inflate(layoutInflater)
        setContentView(detailTvBinding.root)

        loading(true)

        val factory = ViewModelFactory.getInstance(this)
        viewModel = ViewModelProvider(this, factory)[DetailTvViewModel::class.java]

        detailTvBinding.btnBack.setNavigationOnClickListener{onBackPressed()}
        detailTvBinding.favButton.setOnClickListener(this)

        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getInt(EXTRA_TV)
            film = extras.getString(FILM)
            film?.let { viewModel.setSelectedTv(movieId, it) }
            setupFilmFav()

            if(film == "SHOW") {
                viewModel.getTvShow().observe(this, {tvShow ->
                    when(tvShow.status){
                        Status.LOADING -> loading(true)
                        Status.SUCCESS -> {
                            loading(false)
                            tvShow.data?.let { populateMovie(it) }
                            tvShow.data?.let { playTrailer(it) }
                        }
                        Status.ERROR -> {
                            loading(false)
                            Toast.makeText(applicationContext, "Something Wrong..", Toast.LENGTH_SHORT).show()
                        }
                    }
                })
            }else if (film == "POPULAR"){
                viewModel.getTvPopular().observe(this, {tvPopular ->
                    when(tvPopular.status){
                        Status.LOADING -> loading(true)
                        Status.SUCCESS -> {
                            Log.d("sss", "Hello")
                            loading(false)
                            tvPopular.data?.let { populateTrendMovie(it) }
                            tvPopular.data?.let { playTrendTrailer(it) }
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

    private fun playTrailer(movieEntity: TvShowEntity){
        detailTvBinding.trailerButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(movieEntity.url))
            startActivity(intent)
        }
    }
    private fun playTrendTrailer(movieEntity: TvPopularEntity){
        detailTvBinding.trailerButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(movieEntity.url))
            startActivity(intent)
        }
    }

    private fun loading(load: Boolean){
        when(load){
            true -> detailTvBinding.progressBar.visibility = View.VISIBLE
            false -> detailTvBinding.progressBar.visibility = View.GONE
        }
    }

    private fun populateMovie(movieEntity: TvShowEntity) {
        with(detailTvBinding){
            yearRelease.text = movieEntity.yearRealese
            title.text = movieEntity.title
            genre.text = movieEntity.genre.toString()
            duration.text = movieEntity.duration
            filmRate.text = movieEntity.rate.toString()
            overview.text = movieEntity.overview
        }
        Glide.with(this)
            .load(BuildConfig.IMG_URL+movieEntity.banner)
            .apply(RequestOptions().override(3500, 2000))
            .into(detailTvBinding.poster)

        loading(false)
    }

    private fun populateTrendMovie(movieEntity: TvPopularEntity) {
        with(detailTvBinding){
            yearRelease.text = movieEntity.yearRealese
            title.text = movieEntity.title
            duration.text = movieEntity.duration
            genre.text = movieEntity.genre.toString()
            filmRate.text = movieEntity.rate.toString()
            overview.text = movieEntity.overview
        }
        Glide.with(this)
            .load(BuildConfig.IMG_URL+movieEntity.banner)
            .apply(RequestOptions().override(3500, 2000))
            .into(detailTvBinding.poster)

        loading(false)
    }

    private fun setupFilmFav(){
        if (film == "SHOW") {
            viewModel.getTvShow().observe(this, {tvShow ->
                when(tvShow.status){
                    Status.LOADING -> loading(true)
                    Status.SUCCESS -> {
                        loading(false)
                        if (tvShow.data !=null){
                            val fav = tvShow.data.favorite
                            setFavorited(fav)
                        }
                    }
                    Status.ERROR -> {
                        loading(false)
                        Toast.makeText(applicationContext, "Something Wrong..", Toast.LENGTH_SHORT).show()
                    }
                }
            })
        }else if(film == "POPULAR") {
            viewModel.getTvPopular().observe(this, {tvPopular ->
                when(tvPopular.status){
                    Status.LOADING -> loading(true)
                    Status.SUCCESS -> {
                        loading(false)
                        if (tvPopular.data !=null){
                            val fav = tvPopular.data.favorite
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
                        viewModel.setFavoriteTvShow()
                    }catch (error: Throwable){
                        viewModel.setFavoriteTvPopular()
                    }
                }
            }
        }
    }

    private fun setFavorited(fav: Boolean){
        when(fav){
            true -> detailTvBinding.favButton
                .setImageResource(R.drawable.ic_baseline_bookmark_24)
            false -> detailTvBinding.favButton
                .setImageResource(R.drawable.ic_baseline_bookmark_border_24)
        }
    }
}