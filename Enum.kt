enum class StatusPedido(){
    AGUARDANDO_APROVACAO,
    PEDIDO_REALIZADO,
    PAGAMENTO_CONFIRMADO,
    PEDIDO_ENVIADO,
}

class Pedido(){
    var itens = "";
    var valor = 0.0;
    var statusPedido: StatusPedido = StatusPedido.AGUARDANDO_APROVACAO;
}

fun main(){

    val pedido = Pedido();
    pedido.itens = "camiseta,sapato";
    pedido.valor = 189.90;
    // NESTE MOMENTO TEMOS UM PEDIDO COM O STATUS INICIAL = AGUARDANDO_APROVAÇÃO
    println(pedido.statusPedido)

    /* AÇÃO ENVIO DO PAGAMENTO */
    pedido.statusPedido = StatusPedido.PEDIDO_REALIZADO;
    println(pedido.statusPedido)

    /* AÇÃO PAGAMENTO CONFIRMADO */
    pedido.statusPedido = StatusPedido.PAGAMENTO_CONFIRMADO;
    println(pedido.statusPedido)

    /* AÇÃO PEDIDO ENVIADO PARA ENTREGA */
    pedido.statusPedido = StatusPedido.PEDIDO_ENVIADO;
    println(pedido.statusPedido)

    // VERIFICAR O STATUS DE ACORDO COM UM NÚMERO (OBECEDE A MESMA ORDEM DE COMO FORAM CRIADOS)
    val status0: Int = StatusPedido.AGUARDANDO_APROVACAO.ordinal;
    val status1: Int = StatusPedido.PEDIDO_REALIZADO.ordinal;
    val status2: Int = StatusPedido.PAGAMENTO_CONFIRMADO.ordinal;
    val status3: Int = StatusPedido.PEDIDO_ENVIADO.ordinal;

}