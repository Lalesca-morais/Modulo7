package EX8
fun main(){
    println("Digite a quantidade de alunos: ")
    val quantidadeDeAlunos = readln().toInt()

        val alunos = Array<String>(quantidadeDeAlunos) { "" }
        val nota1 = Array<Double>(quantidadeDeAlunos) { 0.0 }
        val nota2 = Array<Double>(quantidadeDeAlunos) { 0.0 }
        val nota3 = Array<Double>(quantidadeDeAlunos) { 0.0 }

        for (i in 0 until quantidadeDeAlunos) {
            println("Digite o nome do aluno ${i + 1}: ")
            alunos[i] = readln()

            println("Digite a primeira nota do aluno ${i + 1}: ")
            nota1[i] = readln().toDouble()

            println("Digite a segunda nota do aluno ${i + 1}: ")
            nota2[i] = readln().toDouble()

            println("Digite a terceira nota do aluno ${i + 1}: ")
            nota3[i] = readln().toDouble()

        }
    calculoMedia(alunos, quantidadeDeAlunos, nota1, nota2, nota3)
}
fun calculoMedia(alunos: Array<String>, quantidadeDeAlunos: Int, nota1: Array<Double>, nota2: Array<Double>, nota3: Array<Double>) {

    for (i in 0 until quantidadeDeAlunos) {
        val media = nota1[i] + nota2[i] + nota3[i] / 3
        val mediaFormatada = String.format("%.2f", media)

        println("A média do aluno ${alunos[i]} foi de: $mediaFormatada")
    }
}
