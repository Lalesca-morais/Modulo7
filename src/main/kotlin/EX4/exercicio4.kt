package EX4
fun main() {
    println("Digite a quantidade de animais da loja: ")
    val quantidade = readln().toIntOrNull()
    tipos(quantidade!!)
}
fun tipos(quantidade: Int) {

    var gatos = 0
    var cachorros = 0

    for (i in 1..quantidade) {
        println("Digite o tipo do animal $i \n(1 - Gato   2 - Cachorro): ")
        val tipo = readln().toInt()
        println("----------------------------------")

        if (tipo == 1) {
            gatos++
        } else {
            cachorros++
        }
    }
    println("Quantidade de gatos na loja: $gatos")
    println("Quantidade de cachorros na loja: $cachorros")
}