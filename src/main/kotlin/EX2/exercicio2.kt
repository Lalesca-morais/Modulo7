package EX2
fun main() {
    println("Digite a sua idade: ")
    val idade = readln()?.toIntOrNull()

    if (idade != null){
        val dias = idade * 365
        println("Você tem $dias dias vividos")
    }else {
        println("É permitido somente números inteiros.")
    }
}
