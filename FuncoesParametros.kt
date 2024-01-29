class Matematica(){
    fun subtrair(numero1: Int, numero2: Int) : Int {
        return numero1 - numero2
    }
}

fun somar(numero1: Int, numero2: Int) : Int {
    return numero1 + numero2
}

// FUNÇÃO QUE RECEBE UMA FUNÇÃO COMO PARÂMETRO
fun calcular( funcao: (Int, Int) -> Int){
     println(funcao(20, 10))
}

fun main(){
    val matematica = Matematica()
    calcular(matematica::subtrair)

    calcular(::somar)
}