import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface EnderecoAPI {
    @GET("38400654/json")
    fun buscarEndereco(): Call<Endereco>
}