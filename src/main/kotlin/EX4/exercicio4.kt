package EX4
fun main() {
    println("Digite a temperatura em graus Celsius:")
    val temperatura = readLine()?.toDoubleOrNull()

    if (temperatura != null) {
        when {
            temperatura <= 18 -> println("O clima é frio.")
            temperatura in 19.0..23.0 -> println("O clima é agradável.")
            temperatura in 24.0..35.0 -> println("O clima é quente.")
            temperatura > 35 -> println("O clima é muito quente.")
        }
    } else {
        println("Informe uma temperatura válida.")
    }
}
