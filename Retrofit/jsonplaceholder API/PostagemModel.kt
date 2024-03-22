package com.kings.retrofit.retrofit

import com.google.gson.annotations.SerializedName

data class PostagemModel(
    val userId: Int,
    val id: Int?,
    val title: String?,
    @SerializedName("body")
    val descricao: String
)