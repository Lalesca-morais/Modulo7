package EX10
fun main() {
    println("Digite um número inteiro:")
    val numero = readLine()?.toIntOrNull() // converte um String em int, retorna null se nao conseguir converter.

    if (numero != null) {
        val sucessor = numero + 1
        println("O sucessor de $numero é $sucessor.")
    } else {
        println("É permitido somente números inteiros.")
    }
}