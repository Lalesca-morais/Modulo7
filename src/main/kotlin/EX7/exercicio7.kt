package EX7

fun main(){
    println("Insira seu nome: ")
    val nome = readln()

    println("Insira seu salário fixo: ")
    val salarioFixo = readln().toDouble()

    println("Insira seu total de vendas efetuadas no mês (em dinheiro): ")
    val vendasNoMes = readln().toDouble()

    calculoSalario(nome, salarioFixo, vendasNoMes)
}
fun calculoSalario(nome: String?, salarioFixo: Double, vendasNoMes: Double) {
    val comissao = vendasNoMes * 0.15

    val salarioTotal = salarioFixo + comissao
    val salarioTotalFormatado = String.format("%.3f", salarioTotal)

    val salarioFixo = String.format("%.3f", salarioFixo)

    println("Nome do vendedor: $nome")
    println("Salário fixo: R$ $salarioFixo")
    println("Salário no final do mês: R$ $salarioTotalFormatado")
}

