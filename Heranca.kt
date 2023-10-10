open class Animal() {

    var cor: String = "";
    var tamanho: String = "";
    var peso: Double = 0.0;

    open fun correr() = println("Animal está correndo");
    fun dormir() = println("Animal está dormindo");

}

class Cachorro : Animal() {
    fun latir() = println("Cachorro late");

    override fun correr() {
        super.correr();
        println("com 4 patas");
    }

}

class Passaro : Animal() {
    fun voar() = println("Passaro voa");

    override fun correr() {
        super.correr();
        println("com 2 perninhas");
    }

}

fun main() {
    val passaro = Passaro();
    passaro.cor = "Azul";
    passaro.tamanho = "Pequeno";
    passaro.peso = 4.0;
    println(passaro.voar());
    println(passaro.correr())

    val cachorro = Cachorro();
    cachorro.cor = "Branco";
    cachorro.tamanho = "Grande";
    cachorro.peso = 20.0;
    println(cachorro.latir());
    println(cachorro.correr())

}
