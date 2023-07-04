package EX10
fun main() {
    println("Insira o valor em dólar disponível: ")
    val dolar = readln().toDouble()
    println("Digite o valor da cotação: ")
    val cotacao = readln().toDouble()
    println("O valor convertido em reais é: R$ ${dolar * cotacao}")
}