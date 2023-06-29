package EX3
fun main() {
    println("Digite um número: ")
    val numero = readln()?.toIntOrNull()

    if(numero != null) {
        if (numero % 5 == 0) {
            println("O número $numero é múltiplo de 5!")
        }else {
            println("O número $numero não é múltiplo de 5!")
        }
    }else {
        println("É permitido somente números inteiros.")
    }
}