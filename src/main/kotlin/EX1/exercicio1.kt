package EX1
fun main() {
    println("Digite um número inteiro:")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        val antecessor = numero - 1
        println("O antecessor de $numero é $antecessor.")
    } else {
        println("É permitido somente números inteiros.")
    }
}

