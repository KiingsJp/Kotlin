fun main() {
    // While
    var opcao = 1;
    while (opcao <= 5) {
        println("Repetição: $opcao");
        opcao++;
    }
    while (opcao in 1..5) {
        println("Repetição: $opcao");
    }

    // For
    for( i in 0..5) {
        println("Repetição: $i");
    }

    val nomes = arrayOf(
        "Lana",
        "Jp",
        "Kings"
    );
    // ForEach
    for(nome in nomes){
        println(nome);
    }

    // Com indices
    for ((indice,nome) in nomes.withIndex()){
        println("Indice: $indice , nome: $nome");
    }
}
