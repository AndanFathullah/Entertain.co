package com.dicoding.jetpacksubmission3.ui.movies

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
import com.dicoding.jetpacksubmission3.data.source.local.entity.MovieTrendEntity
import com.dicoding.jetpacksubmission3.data.source.local.entity.MoviesEntity
import com.dicoding.jetpacksubmission3.databinding.ListTrendingBinding
import com.dicoding.jetpacksubmission3.ui.detail.DetailMoviesActivity

class MoviesTrendAdapter: PagedListAdapter<MoviesEntity, MoviesTrendAdapter.MoviesTrendViewHolder>(
    DIFF_CALLBACK) {

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<MoviesEntity>() {
            override fun areItemsTheSame(oldItem: MoviesEntity, newItem: MoviesEntity): Boolean {
                return oldItem.movieId == newItem.movieId
            }
            override fun areContentsTheSame(oldItem: MoviesEntity, newItem: MoviesEntity): Boolean {
                return oldItem == newItem
            }
        }
    }

    class MoviesTrendViewHolder(private val binding: ListTrendingBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movies: MoviesEntity) {
            with(binding) {
                bannerTitle.text = movies.title
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailMoviesActivity::class.java)
                    intent.putExtra(DetailMoviesActivity.EXTRA_FILM, movies.movieId)
                    intent.putExtra(DetailMoviesActivity.FILM, "MOVIES")
                    itemView.context.startActivities(arrayOf(intent))
                }
                Glide.with(itemView.context)
                    .load(BuildConfig.IMG_URL + movies.banner)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading_banner)
                        .error(R.drawable.ic_loading_banner))
                    .into(banner)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesTrendAdapter.MoviesTrendViewHolder {
        val listTrendingBinding =
            ListTrendingBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MoviesTrendViewHolder(listTrendingBinding)
    }

    override fun onBindViewHolder(holder: MoviesTrendAdapter.MoviesTrendViewHolder, position: Int) {
        val movies = getItem(position)
        if (movies != null) {
            holder.bind(movies)
        }
    }

}