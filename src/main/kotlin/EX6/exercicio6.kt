package EX6
fun main() {
    println("Digite um valor em dólar: ")
    val valorDolar = readLine()?.toDoubleOrNull()

    if(valorDolar!= null && valorDolar > 0 ) {
        val cotacao = 4.86
        val convercao = valorDolar * cotacao
        println("A conversão em reais é: R$ $convercao ")
    }else {
        println("Favor digitar um número válido!")
    }
}