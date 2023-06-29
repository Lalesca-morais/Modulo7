package EX5
fun main() {
    println("Digite um número: ")
    val numero = readLine()?.toDoubleOrNull()

    if(numero != null) {
        if (numero < 0){
            println("O número é negativo")
        }else {
            println("O número é positivo")
        }
    }else{
        println("Favor digitar um número válido!")
    }
}