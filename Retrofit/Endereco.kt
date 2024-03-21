data class Endereco(
    val cep: String,
    @SerializedName("logradouro")
    val rua: String,
    val complemento: String,
    val bairro: String,
    val localidade: String,
    val uf: String,
    val ibge: String,
    val gia: String,
    val ddd: String,
    val siafi: String
)
