class Motorista(val nomeMotorista: String) {

    fun exibirDadosMotorista() = println("Motorista: $nomeMotorista")

    // NESTED CLASS - NAO TEM LIGACAO COM A CLASSE MOTORISTA
    class Caminhao(val nomeCaminhao: String) {
        fun exibirDadosCaminhao() = println("Caminhao: $nomeCaminhao")

        // NAO CONSEGUE ACESSAR AS VARIAVEIS DE MOTORISTA
        // val nome = nomeMotorista /*ERRO*/
    }

    // INNER CLASS - TEM LIGACAO COM A CLASSE MOTORISTA
    inner class Passaporte(val validade: Int) {
        fun exibirDadosPassaporte() = println("Validade:$validade, Motorista: $nomeMotorista")
    }
}


fun main() {
    // ACESSAR NESTED CLASS:
    val caminhao = Motorista.Caminhao("CAMINHAO BMW") /*NAO PRECISA INSTANCIAR UM MOTORISTA*/
    caminhao.exibirDadosCaminhao()

    // ACESSAR INNER CLASS:
    val motorista = Motorista("Jp")
    val passaporte = motorista.Passaporte(10)
    passaporte.exibirDadosPassaporte()
}