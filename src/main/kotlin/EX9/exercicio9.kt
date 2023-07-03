package EX9

fun main () {
    println("Digite um valor: ")
    val valor = readLine()?.toIntOrNull() ?:0

    val fibonacci = calculoFibonacci(valor)
    println("Número Fibonacci: ($valor) = $fibonacci")
}
fun calculoFibonacci(n: Int): Int {
    if(n <= 1) {
        return n
    }
    var anterior = 0
    var atual = 1

    for(i in 2..n) {
        val proximo = anterior + atual
        anterior = atual
        atual = proximo
    }
    return atual
}

