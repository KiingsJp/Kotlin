package estudos

fun main() {

    // LIST
    val list = listOf("Jp", "Lana", "Arya")
    list.forEach { nome ->
        println(nome)
    }
    val mutableList = mutableListOf("Jp", "Lana", "Arya")
    mutableList[0] = "Kings"
    mutableList.add("Joao")
    mutableList.forEach { nome ->
        println(nome)
    }

    // SET
    val set = setOf("Jp", "Lana", "Arya", "Arya")
    set.forEach { nome ->
        println(nome)
    }
    val mutableSet = mutableSetOf("Jp", "Lana", "Arya", "Arya")
    mutableSet.add("Joao")
    mutableSet.forEach { nome ->
        println(nome)
    }

    // MAP
    val map = mapOf("ChaveX" to "Jp", "ChaveY" to "Lana", "ChaveZ" to "Arya")
    map.forEach { nome ->
        println("Chave: ${nome.key} - Valor: ${nome.value}")
    }
    val mutableMap = mutableMapOf("ChaveX" to "Jp", "ChaveY" to "Lana", "ChaveZ" to "Arya")
    mutableMap["ChaveA"] = "Joao"
    mutableMap.forEach { nome ->
        println("Chave: ${nome.key} - Valor: ${nome.value}")
    }

}