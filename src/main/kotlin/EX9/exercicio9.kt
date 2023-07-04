package EX9

fun main () {
    println("Insira a temperatura em Celsius:")
    val celsius = readln().toDouble()
    conversao(celsius)
}
fun conversao(celsius: Double) {
    val conversao = (9 * celsius + 160) / 5
    val conversaoFormatada = String.format("%.2f", conversao)

    println("A temperatura convertida em Fahrenheit é: $conversaoFormatada")
}
