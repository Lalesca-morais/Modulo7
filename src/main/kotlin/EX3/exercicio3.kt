package EX3
fun main() {
    println("Digite quantos produtos o cliente comprou: ")
    val produtos = readln().toIntOrNull()

    if (produtos != null && produtos >= 0) {
        var total = 0.0

        for(i in 1..produtos) {
            println("Digite o valor do produto $i: ")
            val preco = readln().toDoubleOrNull()

            if(preco != null && preco >= 0) {
                total += preco
            }else println("Digite apenas números válidos")
        }
        println("Valor total a pagar: R$%.2f".format(total))

    }else println("Digite apenas números válidos")
}




