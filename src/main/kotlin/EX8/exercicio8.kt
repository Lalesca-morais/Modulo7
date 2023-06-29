package EX8
fun main(){
    println("Digite o valor de X: ")
    val x = readln()?.toIntOrNull()

    println("Digite o valor de Y: ")
    val y = readln()?.toIntOrNull()

    if (x != null && y != null){
        val troca = x
        val x = y
        val y = troca
        println("Novos valores de X = $x, e Y = $y")
    }else{
        println("Favor digitar um número válido!")
    }
}