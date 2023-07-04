package EX4
fun main() {
    println("Digite a base do retângulo: ")
    val base = readln().toDouble()

    println("Digite a altura do retângulo: ")
    val altura = readln().toDouble()

    val area = calculoRetangulo(base, altura)
    println("A área do retângulo é: $area")
}
fun calculoRetangulo(base: Double, altura: Double): Double {
    return base * altura
}
