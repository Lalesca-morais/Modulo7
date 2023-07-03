package EX5
fun main() {
    println("Quantos itens você deseja adicionar na lista de compras?")
    val quantidade = readLine()?.toIntOrNull()

    if (quantidade != null && quantidade > 0) {
        val listaCompras = Array(quantidade) { "" }

        for (i in 0 until quantidade) {
            println("Digite o nome do item ${i + 1}:")
            val produto = readLine()

            if (!produto.isNullOrBlank()) {
                listaCompras[i] = produto
            } else {
                println("Nome inválido. O item não será adicionado à lista.")
            }
        }
        println("Lista de compras:")
        listaCompras.forEach { println(it) }
    } else {
        println("É permitido apenas números inteiros!")
    }
}