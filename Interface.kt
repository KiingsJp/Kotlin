interface Presidenciavel {
    fun candidatarSe()
}

abstract class Pessoa {
    fun comer() = println("comer")
}

class DesenvolvedorAndroid : Pessoa(), Presidenciavel {
    fun programar() = println("programar")
    override fun candidatarSe() {
        println("Fazer o processo para se candidatar")
    }
}


fun main() {

    val desenvolvedorAndroid = DesenvolvedorAndroid()
    desenvolvedorAndroid.comer()
    desenvolvedorAndroid.candidatarSe()

}
