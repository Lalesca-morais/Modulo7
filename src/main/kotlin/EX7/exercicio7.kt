package EX7

fun main(){
    println("Digite a base do retangulo: ")
    val base = readLine()?.toDoubleOrNull()

    println("Digite a altura do retangulo: ")
    val altura = readLine()?.toDoubleOrNull()

    if (base != null && altura != null && base > 0 && altura > 0 ) {
        val valorRetangulo = base * altura
        println("A área do retângulo é: $valorRetangulo")
    }else {
        println("Favor digitar apenas valores positivos.")
    }
}