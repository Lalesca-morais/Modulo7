package EX11

fun main() {
    println("Insira o preço de custo do produto: ")
    val custo = readln().toDouble()

    println("Insira o percentual de acréscimo: ")
    val acrescimo = readln().toDouble()

    println("Valor de venda: ${custo * (1 + acrescimo / 100)}")
}