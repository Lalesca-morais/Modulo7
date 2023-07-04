package EX4
fun main() {
    println("Digite a base do retângulo: ")
    val base = readLine()?.toDoubleOrNull() ?:0.0

    println("Digite a altura do retângulo: ")
    val altura = readLine()?.toDoubleOrNull() ?:0.0

    val area = calculoRetangulo(base, altura)
    println("A área do retângulo é: $area")
}
fun calculoRetangulo(base: Double, altura: Double): Double {
    return base * altura
}
