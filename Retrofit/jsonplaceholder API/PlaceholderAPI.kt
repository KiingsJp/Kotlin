package com.kings.retrofit.retrofit

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface PlaceholderAPI {

    //  REQUISICAO EM GET: https://jsonplaceholder.typicode.com/posts
    @GET("posts")
    fun buscarPostagens(): Call<List<PostagemModel>>

    //  REQUISICAO EM GET: https://jsonplaceholder.typicode.com/posts/1
    @GET("posts/{id}")
    fun buscarPostagemId(@Path("id") id: Int): Call<PostagemModel>

    //  REQUISICAO EM GET: https://jsonplaceholder.typicode.com/comments?postId=1
    @GET("comments")
    fun buscarComentariosPostagemId(@Query("postId") id: Int): Call<List<ComentarioModel>>

    //  REQUISICAO EM GET: https://jsonplaceholder.typicode.com/posts/1/comments
    @GET("posts/{id}/comments")
    fun buscarComentariosPostagemIdPath(@Path("id") id: Int): Call<List<ComentarioModel>>

    //  REQUISICAO EM POST: https://jsonplaceholder.typicode.com/posts
    @POST("posts")
    fun salvarPostagem(@Body postagemModel: PostagemModel): Call<PostagemModel>

    //  REQUISICAO EM POST: https://jsonplaceholder.typicode.com/posts
    @FormUrlEncoded
    @POST("posts")
    fun salvarPostagemForm(
        @Field("userId") userId: Int,
        @Field("id") id: Int,
        @Field("title") title: String,
        @Field("body") descricao: String
    ): Call<PostagemModel>

    //  REQUISICAO EM PUT: https://jsonplaceholder.typicode.com/posts/1
    @PUT("posts/{id}")
    fun atualizarPostagem(
        @Path("id") id: Int,
        @Body postagemModel: PostagemModel
    ): Call<PostagemModel>

    //  REQUISICAO EM PATCH: https://jsonplaceholder.typicode.com/posts/1
    @PATCH("posts/{id}")
    fun atualizarPostagemParcial(
        @Path("id") id: Int,
        @Body postagemModel: PostagemModel
    ): Call<PostagemModel>

    //  REQUISICAO EM DELETE: https://jsonplaceholder.typicode.com/posts/1
    @DELETE("posts/{id}")
    fun deletarPostagem(@Path("id") id: Int): Call<Unit>

}