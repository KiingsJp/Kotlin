val produtos: ArrayList<Produto> = ArrayList()
produtos.add(criarProduto("1234", "Teste Produto 1", "1"))
produtos.add(criarProduto("3213", "Teste Produto 2", "0"))
produtos.add(criarProduto("3413", "Teste Produto 3", "1"))
produtos.add(criarProduto("3245", "Teste Produto 4", "1"))

val string = produtos.joinToString(separator = ", ", prefix = "(", postfix = ")", limit = 2, truncated = "limiteExcedido") {
    it.CODPROD
}

println(string)
