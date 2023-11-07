// permite suspender a função por um tempo
suspend fun minhaFuncaoSuspend() {
    println("Início da função suspend")
    delay(1000) // Pausa a execução por 1 segundo
    println("Fim da função suspend")
}

// tem como tipo padrão o Unit ( semRetorno(): Unit )
fun semRetorno(){
    println("Uma função sem retorno, chamar para executar algo e pronto");
}

// deve ser identificado o tipo de retorno, como nomeFuncao(): Tipo
fun comRetorno(): String {
    return "Retorna uma variável string";
}

// Função Inline
fun inlineSemRetorno() = println("inline");
fun inlineComRetorno(): Int = 10 + 5;

// Função com vararg: pode ser passado uma sequência de parâmetros do mesmo tipo
fun nomesRua(vararg nomes :String, rua :Int){
    for(nome in nomes){
        println("$nome rua: $rua");
    }
}

fun main() {
    
    val texto = comRetorno();
    println(texto)
    
    println(semRetorno());

    val numero = inlineComRetorno();
    println(numero);
    
    println(inlineSemRetorno())
    
    nomesRua("João","Lucas","Lana", "Vitor", "Porteira", "Sergio", rua = 577);

}
