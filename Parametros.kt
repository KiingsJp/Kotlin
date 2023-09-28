
// Parâmetros simples (nome: Tipo)
fun somar1(numero1: Int , numero2: Int, numero3: Int){
    println(numero1 + numero2 + numero3);
}

// Parâmetros não obrigatórios ou pré-definidos
fun somar2(numero1: Int = 0, numero2: Int = 0, numero3: Int = 10){
    println(numero1 + numero2 + numero3);
}


fun main() {
    
    // Chamando função normalmente com todos os parâmetros passados;
    somar1(10,20,30);
    
    // Posso definir a ordem dos parâmetros
    somar1(numero3 = 30, numero1 = 10, numero2 = 20);
    
    // Parâmetros não obrigatórios ou pré definidos tenho opção de não passar nenhum
    somar2();
    
    // Posso escolher qual parâmetro passar para alterar o valor que está pré definido
    somar2(10, numero3 = 30);
}
