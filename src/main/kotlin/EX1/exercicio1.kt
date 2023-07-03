package EX1
fun main() {
    val vetor = IntArray(5)

    println("Digite 5 números inteiros:")

    for (i in 0 until 5) {
        var numero: Int? = null
        while (numero == null) {
            val input = readLine()
            numero = input?.toIntOrNull()
            if (numero == null) {
                println("Valor inválido. Digite um número inteiro.")
            }
        }
        vetor[i] = numero
    }
    var soma = 0
    for (numero in vetor) {
        soma += numero
    }
    println("A soma dos valores é: $soma")
}

