package EX3
fun main() {
    println("\nCALCULO IMC")
    println("Insira seu peso: ")
    val peso = readLine()?.toDoubleOrNull() ?: 0.0

    println("Insira sua altura: ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0

    val imc = peso / (altura * altura)

    when {
        imc < 18.5 -> println("Classificação: Magreza")
        imc in 18.5..24.9 -> println("Classificação: Normal")
        imc in 25.0..29.9 -> println("Classificação: Sobrepeso")
        imc in 30.0..39.9 -> println("Classificação: Obesidade")
        imc > 40.0 -> println("Classificação: Obesidade grave")
        else -> println("Opção inválida!")
    }
}




