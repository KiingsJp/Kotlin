import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback

fun main() {
    val retrofit = RetrofitHelper.retrofit.create(EnderecoAPI::class.java)
    val call = retrofit.buscarEndereco()

    call.enqueue(object : Callback<Endereco> {
        override fun onResponse(call: Call<Endereco>, response: Response<Endereco>) {
            if (response.isSuccessful) {
                response.body()?.let { endereco ->
                    println("${endereco.bairro}, rua: ${endereco.logradouro}")
                }
            }
        }
        override fun onFailure(call: Call<Endereco>, t: Throwable) {
            println(t.message)
            t.printStackTrace()
        }
    })
}