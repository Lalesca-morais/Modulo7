package EX2
fun main() {
    println("Digite um valor: ")
    val valor = readln().toIntOrNull()

    if (valor != null) {
        val valores = Array<Int>(10) { 0 }
        vetor(valor, valores)
    } else {
        println("Digite apenas números válidos!")
    }
}
fun vetor(valor: Int, valores: Array<Int>) {

        valores[0] = valor
        for (i in 1 until valores.size) {
            valores[i] = valores[i -1] * 2
        }
        println("Valores do vetor:")
        for(num in valores) {
         println(num)
        }
}

