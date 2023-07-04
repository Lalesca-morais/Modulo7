package EX4
fun main() {
    val numeros = Array<String>(3) { "" }

    println("Digite o primeiro inteiro: ")
    val num1 = readLine()?.toIntOrNull()
    numeros[num1!!] = readLine().toString()

    println("Digite o segundo inteiro: ")
    val num2 = readLine()?.toIntOrNull()
    numeros[num2!!] = readLine().toString()

    println("Digite o terceiro inteiro: ")
    val num3 = readLine()?.toIntOrNull()
    numeros[num3!!] = readLine().toString()

    println("Digite o quarto inteiro: ")
    val num4 = readLine()?.toIntOrNull()
    numeros[num4!!] = readLine().toString()

    println("Digite o quinto inteiro: ")
    val num5 = readLine()?.toIntOrNull()
    numeros[num5!!] = readLine().toString()

    println("Digite o sexto inteiro: ")
    val num6 = readLine()?.toIntOrNull()
    numeros[num6!!] = readLine().toString()

    println("Digite o setimo inteiro: ")
    val num7 = readLine()?.toIntOrNull()
    numeros[num7!!] = readLine().toString()

    println("Digite o oitavo inteiro: ")
    val num8 = readLine()?.toIntOrNull()
    numeros[num8!!] = readLine().toString()

    println("Digite o nono inteiro: ")
    val num9 = readLine()?.toIntOrNull()
    numeros[num9!!] = readLine().toString()

    println("Digite o decimo inteiro: ")
    val num10 = readLine()?.toIntOrNull()
    numeros[num10!!] = readLine().toString()

    if (numeros != null) {
        for(numero in numeros) {
          //  if (numero % 2 == 0)
                println("Números pares: ")
            println(numero)
        }
    } else {
        println("É permitido somente números inteiros")
    }
}
