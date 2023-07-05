package EX8

fun main() {
    nome()
}
fun nome(){
    println("Digite seu nome completo: ")
    val nomeCompleto = readln()

        val palavras = nomeCompleto.split( " " )
        for (palavra in palavras) {
            println(palavra)
        }
}