fun main() {

    val num = 20;
    // Pode ser utilizado o "in" para verificar se o numero está dentro daquele intervalo
    if (num in 15..25) {
        println("O número está entre o intervalo 15 e 25");
    } else {
        println("O numero não está entre o intervalo 15 e 25");
    }

    // Verificando se um caractere está em um intervalo de caracteres
    val letra = 'a'
    if (letra in 'a'..'z') {
        println("A letra está no intervalo de 'a' a 'z'.")
    }

    // Verificando se um elemento está em uma lista
    val lista = listOf(1, 2, 3, 4, 5, 20)
    if (num in lista) {
        println("O número está na lista.")
    }

    // Verificando se um elemento está em um array
    val array = arrayOf("a", "b", "c", "d", "e")
    val elemento = "c"
    if (elemento in array) {
        println("O elemento está no array.")
    }

    val texto = "Isso é um exemplo de uma string."
    // Verificando se uma substring está presente na string principal
    if ("exemplo" in texto) {
        println("A substring 'exemplo' está presente na string.")
    }

    // Verificando se uma letra está presente na string
    val letraA = 'a'
    if (letraA in texto) {
        println("opa, OK")
    }

    // Aqui é como o Switch em Java, mas melhorado
    val opcao = 1;
    when(opcao) {
        1 -> println("Escolheu 1");
        2 -> {
            println("Escolheu 2");
            println("Faz mais ações");
        }
        in 3..10 -> println("Escolheu entre o intervalo 3 e 10");
    }

}
