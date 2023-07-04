package EX7

fun main(){
    var soma = 0.0
    println("Digite quantos alunos tem na sala: ")
    val numeroDeAlunos = readLine()?.toIntOrNull() ?: 0

    val notas = DoubleArray(numeroDeAlunos)

    var contador = 0

    while (contador < numeroDeAlunos!!) {
        println("Digite a nota do aluno ${contador + 1}: ")
        notas[contador] = readLine()?.toDoubleOrNull() ?: 0.0
        contador++
    }
    for(nota in notas) {
        soma += nota
    }
    val media = if (numeroDeAlunos > 0) soma / numeroDeAlunos else 0.0
    val mediaFormatada = "%.2f".format(media)
    println("Média dos alunos: $mediaFormatada")
}