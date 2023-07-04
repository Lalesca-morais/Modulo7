package EX6
fun main() {
    println("Digite a quantidade de números: ")
    val quantidade = readLine()?.toIntOrNull() ?:0

    if(quantidade <= 0) {
        println("Digite apenas números válidos!")
    }else{
        val numeros : IntArray = IntArray(quantidade)

        for(i in numeros.indices){
            println("Digite o número ${i + 1}: ")
            numeros[i] = readLine()?.toIntOrNull() ?:0
        }
        val menor = menorNumero(numeros)
        println("O menor número é: $menor")
    }
}
fun menorNumero(numeros: IntArray): Int? {
    return numeros.min()
}