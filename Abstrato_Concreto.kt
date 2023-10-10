// UMA CLASSE ABSTRATA NÃO PODE SER INSTANCIADA, É APENAS PARA SERVIR DE BASE PARA CRIAR OUTRAS CLASSES
abstract class Mamifero() {

    var cor: String = "";
    var tamanho: String = "";
    var peso: Double = 0.0;

    // UM MÉTODO ABSTRATO OBRIGA O DESENVOLVEDOR A ADICIONAR ELE QUANDO CRIAR UMA CLASSE QUE EXTENDE ESTA
    abstract fun mamar();
    abstract fun dormir();

    open fun correr() = println("Correr como um");
}

// CLASSE CONCRETA
class Bezerro : Mamifero() {

    // OBRIGATÓRIOS POIS ELES SÃO MÉTODOS ABSTRATOS
    override fun mamar() = println("Mamando");
    override fun dormir() = println("Dormindo");

}

// CLASSE CONCRETA
class Tigre : Mamifero() {

    // OBRIGATÓRIOS POIS ELES SÃO MÉTODOS ABSTRATOS
    override fun mamar() = println("Mamando");
    override fun dormir() = println("Dormindo");

    // OPCIONAL
    override fun correr() {
        super.correr();
        println("Tigre veloz");
    }

}
