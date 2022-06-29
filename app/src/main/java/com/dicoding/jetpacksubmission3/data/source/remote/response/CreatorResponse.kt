package com.dicoding.jetpacksubmission3.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class CreatorResponse(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
)
