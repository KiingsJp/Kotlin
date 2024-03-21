import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface EnderecoAPI {
    @GET("{cep}/json/")
    fun buscarEndereco( @Path("cep") cep: String ) : Call<Endereco>
}
