class Avenida {
    var nome = "";
    
    // OBJETOS FIXOS QUE NÃO MUDAM
    companion object {
        const val VELOCIDADE_MAX_LEI = 60;

        fun SINALEIRO() {
            /* --- Ações do sinaleiro --- */
            println("Respeite o sinaleiro")
        }
    }
}

fun main(){
    println("Velocidade maxima avenida: ${Avenida.VELOCIDADE_MAX_LEI}")
    println("Ponto perigoso da avenida: ${Avenida.SINALEIRO()}")

    // Instanciar uma classe Avenida vai poder dar um nome para ela
    val avenida = Avenida()
    avenida.nome = "João Pinheiro";
}
