package com.dicoding.jetpacksubmission3.ui.favorites.tvshowfav

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.jetpacksubmission3.BuildConfig
import com.dicoding.jetpacksubmission3.R
import com.dicoding.jetpacksubmission3.data.source.local.entity.TvPopularEntity
import com.dicoding.jetpacksubmission3.databinding.ListFavoriteBinding
import com.dicoding.jetpacksubmission3.ui.detail.DetailMoviesActivity

class TvPopAdapter : PagedListAdapter<TvPopularEntity, TvPopAdapter.TvPopFavViewHolder>(DIFF_CALLBACK) {

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<TvPopularEntity>() {
            override fun areItemsTheSame(oldItem: TvPopularEntity, newItem: TvPopularEntity): Boolean {
                return oldItem.tvId == newItem.tvId
            }
            override fun areContentsTheSame(oldItem: TvPopularEntity, newItem: TvPopularEntity): Boolean {
                return oldItem == newItem
            }
        }
    }

    fun getSwipedData(swipedPosition: Int): TvPopularEntity? = getItem(swipedPosition)

    class TvPopFavViewHolder(private val binding: ListFavoriteBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(moviesDetail: TvPopularEntity) {
            with(binding) {
                filmTitle.text = moviesDetail.title
                filmRate.text = moviesDetail.rate.toString()
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailMoviesActivity::class.java)
                    intent.putExtra(DetailMoviesActivity.EXTRA_FILM, moviesDetail.tvId)
                    intent.putExtra(DetailMoviesActivity.FILM, "POPULAR")
                    itemView.context.startActivities(arrayOf(intent))
                }
                Glide.with(itemView.context)
                    .load(BuildConfig.IMG_URL + moviesDetail.poster)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading_poster)
                            .error(R.drawable.ic_loading_poster))
                    .into(banner)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvPopAdapter.TvPopFavViewHolder {
        val listMovieFavBinding =
            ListFavoriteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvPopFavViewHolder(listMovieFavBinding)
    }

    override fun onBindViewHolder(holder: TvPopAdapter.TvPopFavViewHolder, position: Int) {
        val movies = getItem(position)
        if (movies != null) {
            holder.bind(movies)
        }
    }
}