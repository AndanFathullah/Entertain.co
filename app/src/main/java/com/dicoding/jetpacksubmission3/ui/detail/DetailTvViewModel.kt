package com.dicoding.jetpacksubmission3.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.jetpacksubmission3.data.FilmRepository
import com.dicoding.jetpacksubmission3.data.source.local.entity.TvPopularEntity
import com.dicoding.jetpacksubmission3.data.source.local.entity.TvShowEntity
import com.dicoding.jetpacksubmission3.vo.Resource

class DetailTvViewModel(private val filmRepository: FilmRepository): ViewModel() {

    private lateinit var detailTvShow: LiveData<Resource<TvShowEntity>>
    private lateinit var detailTvPopular: LiveData<Resource<TvPopularEntity>>

    fun setSelectedTv(tvId: Int, film: String){
        when(film){
            "SHOW" -> detailTvShow = filmRepository.getDetailTvShow(tvId)
            "POPULAR" -> detailTvPopular = filmRepository.getDetailTvPopular(tvId)
        }
    }

    fun getTvShow() = detailTvShow

    fun getTvPopular() = detailTvPopular

    fun setFavoriteTvShow(){
        val filmResource = detailTvShow.value
        if(filmResource != null){
            val filmResourceData = filmResource.data

            if(filmResourceData != null){
                val newState = !filmResourceData.favorite
                filmRepository.setTvShowFavorite(filmResourceData, newState)
            }
        }
    }

    fun setFavoriteTvPopular(){
        val filmResource = detailTvPopular.value
        if(filmResource != null){
            val filmResourceData = filmResource.data

            if(filmResourceData != null){
                val newState = !filmResourceData.favorite
                filmRepository.setTvPopularFavorite(filmResourceData, newState)
            }
        }
    }
}