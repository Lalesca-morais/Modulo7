package EX6
fun main() {
    println("Digite o nome da banda: ")
    val banda = readLine()

    val listaMusicas = Array<String>(3) { "" }

    for (i in 0 until listaMusicas.size) {
        println("Digite o nome da música ${i + 1}: ")
        listaMusicas[i] = readLine().orEmpty()
    }
    println("Nome da Banda: $banda")
    println("Músicas:")
    for (musica in listaMusicas) {
        println(musica)
    }
}