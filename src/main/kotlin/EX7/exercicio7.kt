package EX7

fun main(){
    println("Informe a quantidade de turmas:")
    val turmas = readln().toInt()

    for (turma in 1..turmas) {
        println("Turma: $turma")
        println("Informe a quantidade de alunos:")
        val alunos = readln().toInt()

        var totalNotas = 0.0

        for (aluno in 1..alunos) {
            println("Informe a média do aluno $aluno:")
            val media = readln().toDouble()
            totalNotas += media

        }
        val mediaTurma = totalNotas / alunos
        println("Média da turma $turma: $mediaTurma")
    }
}


