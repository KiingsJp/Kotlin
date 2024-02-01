package br.com.sankhya.doalti.aaTestes

data class Produto(val nome: String, var preco: Int) {
    fun verificarEstoque() = println("Existe estoque disponível")
    fun estoqueDisponivel() = println("Quantidade: x")
    fun verificarDescontoMax() = println("Verificado desconto máximo")
    fun reservarEstoque() = println("Reservar Estoque")
}

fun main() {

    // FUNÇÕES DE ESCOPO SÃO UTILIZADAS PARA FACILITAR A LEITURA DO CÓDIGO

    // ----------------------------------------- LET -----------------------------------------
    val produto1: Produto? = Produto("PS5", 5000)

    // NORMALMENTE UTILIZAMOS O LET PARA SUBSTITUIR ESTE TRECHO DE CÓDIGO:
    if (produto1 != null) {
        produto1.preco = 4500
    }

    // LET:
    produto1?.let {
        it.preco = 4500
        it /*AQUI RETORNA O VALOR (OPCIONAL CASO QUEIRA CRIAR UMA VARIÁVEL COM O RETORNO DO LET)*/
    }

    // ----------------------------------------- RUN -----------------------------------------
    val produto2: Produto? = Produto("Iphone", 3500)

    // RUN É UTILIZADO PARA INICIALIZAR UM PRODUTO, NELE TEMOS ACESSO DIRETO ÀS FUNÇÕES DENTRO DA CLASSE
    produto2?.run {
        verificarEstoque()
        this /*AQUI RETORNA O VALOR (OPCIONAL CASO QUEIRA CRIAR UMA VARIÁVEL COM O RETORNO DO RUN)*/
    }

    // ----------------------------------------- WITH ----------------------------------------
    val produto3: Produto? = Produto("TV", 7000)
    // WITH É PARECIDO COM O RUN, UTILIZADO PARA ALTERAR PROPRIEDADES DO OBJETO
    with(produto3) {
        this?.preco = 6900
        this /*AQUI RETORNA O VALOR (OPCIONAL CASO QUEIRA CRIAR UMA VARIÁVEL COM O RETORNO DO WITH)*/
    }

    // ---------------------------------------- APPLY ----------------------------------------
    val produto4: Produto? = Produto("Teclado", 450)
    // APPLY É UTILIZADO PARA APLICAR CONFIGURAÇÕES, NO SENTIDO DE CONFIGURAR O OBJETO ANTES DO USO
    produto4?.apply {
        verificarDescontoMax()
        reservarEstoque()
    }

    // ---------------------------------------- ALSO -----------------------------------------
    val produto5: Produto? = Produto("Mouse", 300)
    produto5?.run {
        reservarEstoque()
        this
    }.also {
        it?.estoqueDisponivel()
    }
    // LEITURA: AO INICIAR PRODUTO - RESERVE O ESTOQUE - ALSO (TAMBÉM FAÇA) MOSTRE O ESTOQUE DISPONÍVEL

}
