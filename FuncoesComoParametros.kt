class Matematica(){
    fun subtrair(numero1: Int, numero2: Int) : Int {
        return numero1 - numero2
    }
}

fun somar(numero1: Int, numero2: Int) : Int {
    return numero1 + numero2
}

fun calcular( funcao: (Int, Int) -> Int){
     println(funcao(20, 10))
}

fun main(){
    // PASSAR UMA FUNCAO COMO PARAMETRO
    val matematica = Matematica()
    calcular(matematica::subtrair)
    calcular(::somar)

    // CRIAR FUNCAO LAMBDA
    val funcaoLambda = {
        println("Lambda")
    }
    // EXECUTAR FUNCAO LAMBDA
    funcaoLambda()

    // FUNCAO LAMBDA COM PARAMETROS
    val funLambdaParam = { nome: String, idade: Int ->
        println("Nome: $nome, Idade: $idade")
    }
    funLambdaParam("Jp",21)
}