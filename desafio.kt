import java.util.*

enum class Nivel { 
    BASICO, INTERMEDIARIO, AVANCADO 
}

data class Usuario(val nome: String, val email: String)

data class ConteudoEducacional(
    val nome: String, 
    val duracaoMinutos: Int = 60
)

data class Formacao(
    val nome: String,
    val nivel: Nivel,  
    val conteudos: List<ConteudoEducacional>
) {

    private val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado com sucesso!")
    }

}

fun main() {

    val usuario1 = Usuario("João Silva", "joao@email.com")
    val usuario2 = Usuario("Maria Souza", "maria@email.com")

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin")
    val conteudo2 = ConteudoEducacional("Orientação a Objetos com Kotlin")

    val formacaoKotlin = Formacao(
        nome = "Formação Kotlin",
        nivel = Nivel.INTERMEDIARIO,
        conteudos = listOf(conteudo1, conteudo2)  
    )

    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)

}
