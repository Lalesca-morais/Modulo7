package EX12

import java.time.LocalDate
import java.time.Period

fun main() {
    print("Digite o ano de nascimento: ")
    val anoNascimento = readLine()?.toIntOrNull()

    if (anoNascimento != null) {
        val anoAtual = LocalDate.now().year
        val idadeAtual = calcularIdade(anoNascimento, anoAtual)

        println("Linha do Tempo:")
        for (ano in anoNascimento..anoAtual) {
            val idade = calcularIdade(anoNascimento, ano)
            println("Ano $ano: ${idade} anos")
        }
        println("Idade atual: $idadeAtual anos")
    } else {
        println("Ano de nascimento inválido. Tente novamente.")
    }
}
fun calcularIdade(anoNascimento: Int, anoAtual: Int): Int {
    val dataNascimento = LocalDate.of(anoNascimento, 1, 1)
    val dataAtual = LocalDate.of(anoAtual, 1, 1)
    val periodo = Period.between(dataNascimento, dataAtual)
    return periodo.years
}