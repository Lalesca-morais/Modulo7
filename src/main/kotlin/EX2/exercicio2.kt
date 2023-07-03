package EX2
fun main() {
    println("Digite o número referente ao dia da semana (1 a 7): ")
    val numero = readln().toInt()

    val dia = when (numero) {
        1 -> "Domingo"
        2 -> "Segunda-feira"
        3 -> "Terça-feira"
        4 -> "Quarta-feira"
        5 -> "Quinta-feira"
        6 -> "Sexta-feira"
        7 -> "Sábado"
        else -> "Dia inválido"
    }
    println("O dia referente é : $dia")
}
