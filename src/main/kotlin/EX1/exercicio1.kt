package EX1
fun main() {
    println("Digite o valor de X:")
    val x = readln().toIntOrNull()

    println("Digite o valor de Y:")
    val y = readln().toIntOrNull()

    somaValores(x!!,y!!)
}
fun somaValores(x: Int, y:Int) {
        var sum = 0

        for(num in x..y) {
            if(num % 13 != 0){
                sum += num
            }
        }
        println("Resultado: $sum")
}




