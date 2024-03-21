package com.kings.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface EnderecoAPI {

    @GET("{cep}/json/")
    fun buscarEndereco( @Path("cep") cep: String ) : Call<Endereco>

}