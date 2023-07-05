package EX10
fun main() {
valores()
}
fun valores() {
    println("Digite o valor de X: ")
    val x = readln().toIntOrNull()

    println("Digite o valor de Y: ")
    val y = readln().toIntOrNull()

    if (x != null && y != null && x > 0 && y > 0) {
        if (x == y ){
            println("Os valores são iguais")
        }else println("Os valores não são iguais")

    }else println("É permitido apenas números válidos!")
}