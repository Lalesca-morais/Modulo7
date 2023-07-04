package EX10
fun main() {
    var contador = 1
    var soma = 0

    do {
        soma += contador
        contador++
    } while (contador < 15)
    println("Posição do contador: $contador")
    println("Resultado: $soma")
}