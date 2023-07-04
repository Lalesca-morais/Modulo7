package EX5
fun main() {
    println("Digite o primeiro número:")
    val num1 = readln().toDouble()

    println("Digite o segundo número:")
    val num2 = readln().toDouble()

    val soma = num1 + num2
    val somaFormatada = String.format("%.2f", soma)
    println("Soma: $somaFormatada")

    val subtracao = num1 - num2
    val subtracaoFormatada = String.format("%.2f", subtracao)
    println("Subtração: $subtracaoFormatada")

    val multiplicacao = num1 * num2
    val multiplicacaoFormatada = String.format("%.2f", multiplicacao)
    println("Multiplicação: $multiplicacaoFormatada")

    val divisao = num1 / num2
    val divisaoFormatada = String.format("%.2f", divisao)
    println("Divisão: $divisaoFormatada")
}



