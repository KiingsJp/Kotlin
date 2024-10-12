data class Topico(
    val id: Long,
    val titulo: String,
    val mensagem: String?,
    val dataCriacao: LocalDateTime? = LocalDateTime.now(),
    val curso: Curso?,
    val usuario: Usuario?,
    val statusTopico: StatusTopico,
    val respostas: List<Resposta>? = null
)

data class TopicoView(
    val titulo: String,
    val mensagem: String,
    val nomeUsuario: String,
    val nomeCurso: String,
    val status: StatusTopico
)

// Pega uma lista de Topico e transforma em uma lista de TopicoView
fun main() {
    topicos: ArrayList<Topico> = ArrayList()

    val listView = topicos.map {
        val nomeUsuario = it.usuario?.nome ?: ""
        val nomeCurso = it.curso?.curso ?: ""
        TopicoView(
            it.titulo,
            it.mensagem ?: "",
            nomeUsuario,
            nomeCurso,
            it.statusTopico
        )
    }
}

