import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback

// NECESSÁRIO AS DEPENDÊNCIAS: 
// "com.squareup.retrofit2:retrofit:2.9.0"
// "com.squareup.retrofit2:converter-gson:2.9.0"

fun main() {
    val retrofit = RetrofitHelper.retrofit.create(EnderecoAPI::class.java)
    val call = retrofit.buscarEndereco("01001000")

    call.enqueue(object : Callback<Endereco> {
        override fun onResponse(call: Call<Endereco>, response: Response<Endereco>) {
            if (response.isSuccessful) {
                response.body()?.let { endereco ->
                    println("${endereco.bairro}, rua: ${endereco.rua}")
                }
            }
        }
        override fun onFailure(call: Call<Endereco>, t: Throwable) {
            println(t.message)
            t.printStackTrace()
        }
    })
}
