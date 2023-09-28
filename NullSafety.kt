class Casa {
    var sofa: String = "Sofá de luxo";
    var cama: String = "Cama grande";
}

fun main(){

    // Para permitir um valor nulo, deve adicionar "?" no tipo da variável
    val casa: Casa? = null;

    // Desta forma o koltin já sabe que vai dar null pointer então o compilador não aceita
//    println(casa.sofa);

    // Dessa forma o Kotlin já percebe a verificação e não reclama erro
    if(casa != null){
        println(casa.sofa);
    }

    // Acesso seguro para o valor, ele verifica se for nulo e apenas retorna "null", não da erro no código
    println(casa?.sofa);

    // "Ternário Elvis" Ele verifica se é nulo e troca o retorno "null" pelo valor escolhido.
    val cama = casa?.cama ?: "Não tem cama";
    // Se cama for null, resultado vai ser "Não tem cama" 
    println(cama);


}
