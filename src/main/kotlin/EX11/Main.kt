package EX11

fun main() {
    val quantidade = 15
    var soma = 0.0

    for (i in 1..quantidade) {
        println("Digite o número $i: ")
        val numero = readLine()?.toDoubleOrNull()

        if (numero != null){
            soma += numero
        }else {
            println("É permitido apenas números inteiros")
        }
    }
    val media = soma / quantidade
    println("A média dos números é: $media")
}