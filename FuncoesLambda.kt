class Botao() {

    // PERMITE CONFIGURAR UMA FUNCAO LAMBDA COMUM
    fun configurarAcao(funcao: () -> Unit) {
        funcao()
    }

    // PEDE UM PARAMETRO `USUARIO` E UMA FUNCAO PARA SER EXECUTADA
    fun configurarAcaoParam(usuario: String, funcao: () -> Unit) {
        funcao()
        println("Usuario: $usuario")
    }

    // PEDE UMA FUNCAO PARA SER EXECUTADA E A CLASSE CONFIGURA O PARAMETRO `USUARIO` NESTA FUNCAO
    private val usuario: String = "USUARIO UTILIZADOR"
    fun configurarAcaoFunParam( funcao: (String) -> Unit) {
        funcao(usuario)
    }
}

fun main() {
    val botao = Botao()
    botao.configurarAcao {
        println("Utilizado funcao lambda")
    }

    botao.configurarAcaoParam("Jp") {
        println("Utilizado funcao lambda com param")
    }

    botao.configurarAcaoFunParam {
        println("Utilizado parametro na funcao lambda")
        println("Aqui tambem pode ser usado o parametro usuario que a funcao da classe criou: $it")
    }
    botao.configurarAcaoFunParam { usuario ->
        println("Utilizado parametro na funcao lambda -- OUTRA OPCAO")
        println("Aqui tambem pode ser usado o parametro usuario que a funcao da classe criou: $usuario")
    }
    botao.configurarAcaoFunParam { usuario: String ->
        println("Utilizado parametro na funcao lambda -- OUTRA OPCAO")
        println("Aqui tambem pode ser usado o parametro usuario que a funcao da classe criou: $usuario")
    }
}