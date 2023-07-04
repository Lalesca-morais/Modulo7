package EX12

fun main() {
    println("Digite o ano do seu nascimento: ")
    val nascimento = readLine()?.toIntOrNull()

    var idade = 0

    if(nascimento != null && nascimento >= 0){
        println("\nAno\t\t Idade")
        for (i: Int in nascimento until 2024){
            println("$i\t\t$idade")
            idade++
        }
    }else println("É permitido apenas números válidos!")
}