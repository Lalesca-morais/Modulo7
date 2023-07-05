package EX9

fun main () {
funcionarios()
}
fun funcionarios() {
    println("Digite a quantidade de funcionários:")
    val funcionarios = readln().toInt()

    var ferias = 0
    var semFerias = 0

    for (i in 1..funcionarios) {
        println("Digite o nome do funcionário $i: ")
        val nome = readln()

        println("Digite o tempo de serviço (em meses): ")
        val meses = readln().toInt()

        if (meses > 12) {
            println("$nome tem direito a férias")
            ferias++
        }else {
            println("$nome não tem direito a férias")
            semFerias++
        }
    }
    println("Funcionários com direito a férias: $ferias")
    println("Funcionários sem direito a férias: $semFerias")
}
