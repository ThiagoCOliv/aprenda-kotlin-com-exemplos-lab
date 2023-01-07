// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Aluno(val nome: String)

data class ConteudoEducacional(var conteudo: String, val duracao: Int)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) 
{
    val inscritos = mutableListOf<Aluno>()
    val inscritosLeitura = inscritos

    fun matriculados(): List<Aluno>
    {
        return inscritosLeitura
    }
    
    fun matricular(vararg alunos: Aluno) 
    {
        for(aluno in alunos)
        {
            inscritos.add(aluno)
            println("${aluno.nome} cadastrado com sucesso!")
        }
    }
}

fun main()
{
    val variaveis = ConteudoEducacional("variaveis", 30)
    val funcoes = ConteudoEducacional("funcoes", 60)
    val classes = ConteudoEducacional("classes", 60)

    val conteudosKotlin : List<ConteudoEducacional> = listOf(variaveis, funcoes, classes)
    val kotlin : Formacao = Formacao("Kotlin", Nivel.BASICO, conteudosKotlin)

    kotlin.matricular(Aluno("Ana"), Aluno("José"), Aluno("Gabriel"))
    println(kotlin.matriculados())
}