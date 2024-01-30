package estudos


data class Pessoa(val nome: String, val idade: Int, val genero: Char)

fun main(){

    val pessoa = Pessoa("Jp", 21, 'M')

    // ATRIBUIR OS VALORES DA CLASSE PESSOA EM VARIAVEIS

    // OPCAO 1

    val nome1 = pessoa.nome
    val idade1 = pessoa.idade
    val genero1 = pessoa.genero

    // OPCAO 2 ( DESTRUCTURING )

    val (nome2, idade2, genero2) = pessoa
}