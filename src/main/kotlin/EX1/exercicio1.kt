package EX1
fun main() {
    println("Digite um número: ")
    val numero = readln().toInt()

    if (numero != null && numero >= 0) {
        val resultado = somaNumeros(numero)
        println("O resultado da soma é: $resultado")

    }else println("É permitido apenas números válidos!")
}
fun somaNumeros(numero: Int): Int {
    var soma = 0
    for (i in 1..numero) {
        soma += i
    }
    return soma
}


