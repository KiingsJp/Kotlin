
class Usuario(){

    fun enviarMsg(email: String){
        println("Mensagem enviada para o email: $email");
    }

    fun enviarMsg(telefone: Int){
        println("Mensagem enviada para o telefone: $telefone");
    }
}

fun main() {
    val user: Usuario = Usuario();

    // Utilizar o mesmo método mas com ações diferentes
    user.enviarMsg("kings@gmail.com")
    user.enviarMsg(996843970);
}