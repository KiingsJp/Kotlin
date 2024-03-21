package com.kings.retrofit

import com.google.gson.annotations.SerializedName

// UTILIZADO O PLUGIN `JSON TO CLASS KOTLIN`

data class Endereco(
    val bairro: String,
    val cep: String,
    val complemento: String,
    val ddd: String,
    val gia: String,
    val ibge: String,
    val localidade: String,
    @SerializedName("logradouro")
    val rua: String,
    val siafi: String,
    val uf: String
)
