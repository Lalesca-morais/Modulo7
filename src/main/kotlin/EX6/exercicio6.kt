package EX6
fun main() {
    tabela()
}
fun tabela() {
    for (i in 1..9) {
        println("\tTabuada so $i")
        var num = 1
        while (num <= 10) {
            val resultado = i * num
            println("$num X $num = $resultado")
            println()
        }
    }
}
// erro