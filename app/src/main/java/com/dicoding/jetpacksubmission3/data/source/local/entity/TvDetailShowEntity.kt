package com.dicoding.jetpacksubmission3.data.source.local.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TvDetailShowEntity(
    var tvId: Int,
    var title: String,
    var yearRealese: String,
    var genre: List<String>,
    var duration: String,
    var rate: Double,
    var overview: String,
    var creator: List<String>,
    var poster: String,
    var banner: String,
    var url: String
):Parcelable