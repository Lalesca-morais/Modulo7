package EX9

fun main () {
    println("Informe o primeiro número: ")
    val numero1 = readLine()?.toIntOrNull()

    println("Informe o segundo número: ")
    val numero2 = readLine()?.toIntOrNull()

    if (numero1 != null && numero2 != null && numero1 > 0 && numero2 > 0) {
        println("MENU DE OPÇÕES")
        println("1 - Somar os números")
        println("2 - Subtrair os números")
        println("3 - Multiplicar os números")
        println("4 - Dividir os números")
        println("Digite a opção desejada!")
        val opcao = readLine()?.toIntOrNull()

        if (opcao != null){
            when(opcao) {
                1 -> {
                    val soma = numero1 + numero2
                    println("Resultado: $soma")
                }
                2 -> {
                    val diminuir = numero1 - numero2
                    println("Resultado: $diminuir")
                }
                3 -> {
                    val multiplicar = numero1 * numero2
                    println("Resultado: $multiplicar")
                }
                4 ->{
                    val dividir = numero1 / numero2
                    println("Resultado: $dividir")
                }else -> {
                    println("Opção inválida!")
                }
            }

        }else println("Favor digitar apenas números válidos!")

    }else println("Favor digitar apenas números válidos!")

}

