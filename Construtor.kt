// Método Init serve para ações que acontecem quando a classe é instanciada

// Construtor primário

    // simples
    class Usuario1(nome: String, sobrenome: String){

        var nome = "";
        var sobrenome = "";

        init {
            this.nome = nome;
            this.sobrenome = sobrenome;
        }

    }

    // definindo variáveis já no construtor
    class Usuario2(var nome: String, var sobrenome: String){

        init {
            this.nome = nome;
            this.sobrenome = sobrenome;
        }

    }
    
// Construtor secundário
class Usuario3(var nome: String, var sobrenome: String){

    var idade: Int? = null;

    init {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    constructor(nome: String, sobrenome: String, idade: Int) : this(nome,sobrenome){
        this.idade = idade;
    }

    fun printDadosPrimario(){
        println("nome: $nome, sobrenome: $sobrenome, idade: $idade");
    }

    fun printDadosSecundario(){
        println("nome: $nome, sobrenome: $sobrenome, idade: $idade");
    }
}

fun main() {
    // usando construtor primario
    val primario: Usuario3 = Usuario3(nome = "Jp", sobrenome = "Kings");
    primario.printDadosPrimario();

    // usando construtor secundario
    val secundario: Usuario3 = Usuario3(nome = "Jp", sobrenome = "Kings", idade = 21);
    secundario.printDadosSecundario();
}
