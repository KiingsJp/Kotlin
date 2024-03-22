package com.kings.retrofit

import com.kings.retrofit.retrofit.ComentarioModel
import com.kings.retrofit.retrofit.PlaceholderAPI
import com.kings.retrofit.retrofit.PostagemModel
import com.kings.retrofit.retrofit.RetrofitHelper
import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback
import retrofit2.Retrofit

fun main() {
    val retrofit = RetrofitHelper.retrofit
    buscarPostagens(retrofit)
    buscarPostagemId(retrofit,1)
    buscarComentariosPostagemId(retrofit,1)
    salvarPostagem(retrofit)
    atualizarPostagem(retrofit)
    atualizarPostagemParcial(retrofit)
    deletarPostagem(retrofit)
}

private fun buscarPostagemId(retrofit: Retrofit, id: Int){
    val call = retrofit.create(PlaceholderAPI::class.java).buscarPostagemId(id)

    call.enqueue( object : Callback<PostagemModel> {
        override fun onResponse(call: Call<PostagemModel>, response: Response<PostagemModel>) {
            if(response.isSuccessful) {
                response.body()?.let {postagem ->
                    println("Postagem = User id: ${postagem.userId} - id: ${postagem.id} - title: ${postagem.title} - descricao: ${postagem.descricao} ")
                }
            } else println("Erro aqui")
        }
        override fun onFailure(call: Call<PostagemModel>, t: Throwable) {
            println("Erro api: ${t.message}")
            t.printStackTrace()
        }
    })
}

private fun buscarPostagens(retrofit: Retrofit){
    val call = retrofit.create(PlaceholderAPI::class.java).buscarPostagens()

    call.enqueue( object : Callback<List<PostagemModel>>{
        override fun onResponse(call: Call<List<PostagemModel>>, response: Response<List<PostagemModel>>) {
            if(response.isSuccessful) {
                response.body()?.forEach {postagem ->
                    println("Postagem = User id: ${postagem.userId} - id: ${postagem.id} - title: ${postagem.title} - descricao: ${postagem.descricao} ")
                }
            } else println("Erro aqui")
        }
        override fun onFailure(call: Call<List<PostagemModel>>, t: Throwable) {
            println("Erro api: ${t.message}")
            t.printStackTrace()
        }
    })
}

private fun buscarComentariosPostagemId(retrofit: Retrofit, id: Int){
    val call = retrofit.create(PlaceholderAPI::class.java).buscarComentariosPostagemId(id)

    call.enqueue( object : Callback<List<ComentarioModel>>{
        override fun onResponse(call: Call<List<ComentarioModel>>, response: Response<List<ComentarioModel>>) {
            if(response.isSuccessful) {
                response.body()?.forEach {comentario ->
                    println("Comentario = name: ${comentario.name} - email: ${comentario.email} - id: ${comentario.id}")
                }
            } else println("Erro aqui")
        }
        override fun onFailure(call: Call<List<ComentarioModel>>, t: Throwable) {
            println("Erro api: ${t.message}")
            t.printStackTrace()
        }
    })
}

private fun salvarPostagem(retrofit: Retrofit){

    val postagem = PostagemModel(
        10,
        101,
        "Kings",
        "Siga firme"
    )

    val call = retrofit.create(PlaceholderAPI::class.java).salvarPostagem(postagem)
    call.enqueue( object : Callback<PostagemModel> {
        override fun onResponse(call: Call<PostagemModel>, response: Response<PostagemModel>) {
            if(response.isSuccessful) {
                response.body()?.let {postagem ->
                    println("Postagem = User id: ${postagem.userId} - id: ${postagem.id} - title: ${postagem.title} - descricao: ${postagem.descricao} ")
                }
            } else println("Erro status: ${response.code()}")
        }
        override fun onFailure(call: Call<PostagemModel>, t: Throwable) {
            println("Erro api: ${t.message}")
            t.printStackTrace()
        }
    })
}

private fun atualizarPostagem(retrofit: Retrofit){

    val postagem = PostagemModel(
        10,
        -1,
        "Kings",
        "Siga firme"
    )

    val call = retrofit.create(PlaceholderAPI::class.java).atualizarPostagem(1, postagem)
    call.enqueue( object : Callback<PostagemModel> {
        override fun onResponse(call: Call<PostagemModel>, response: Response<PostagemModel>) {
            if(response.isSuccessful) {
                response.body()?.let {postagem ->
                    println("Postagem = User id: ${postagem.userId} - id: ${postagem.id} - title: ${postagem.title} - descricao: ${postagem.descricao} ")
                }
            } else println("Erro status: ${response.code()}")
        }
        override fun onFailure(call: Call<PostagemModel>, t: Throwable) {
            println("Erro api: ${t.message}")
            t.printStackTrace()
        }
    })
}

private fun atualizarPostagemParcial(retrofit: Retrofit){

    val postagem = PostagemModel(
        10,
        null,
        null,
        "Siga firme"
    )

    val call = retrofit.create(PlaceholderAPI::class.java).atualizarPostagemParcial(1, postagem)
    call.enqueue( object : Callback<PostagemModel> {
        override fun onResponse(call: Call<PostagemModel>, response: Response<PostagemModel>) {
            if(response.isSuccessful) {
                response.body()?.let {postagem ->
                    println("Postagem = User id: ${postagem.userId} - id: ${postagem.id} - title: ${postagem.title} - descricao: ${postagem.descricao} ")
                }
            } else println("Erro status: ${response.code()}")
        }
        override fun onFailure(call: Call<PostagemModel>, t: Throwable) {
            println("Erro api: ${t.message}")
            t.printStackTrace()
        }
    })
}

private fun deletarPostagem(retrofit: Retrofit){

    val call = retrofit.create(PlaceholderAPI::class.java).deletarPostagem(1)
    call.enqueue( object : Callback<Unit> {
        override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
            if(response.isSuccessful) {
                println("Sucesso ao remover postagem, code: ${response.code()}")
            } else println("Erro status: ${response.code()}")
        }
        override fun onFailure(call: Call<Unit>, t: Throwable) {
            println("Erro api: ${t.message}")
            t.printStackTrace()
        }
    })
}




