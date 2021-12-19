package helpdesk.model

import java.time.LocalDate

open class Pessoa(
    val id: Long,
    val nome: String,
    val cpf: String,
    val email: String,
    val senha: String,
    private val dataCriacao: LocalDate = LocalDate.now(),
    private val perfis: Set<Perfil> = emptySet()
){
    init {
        addPerfil(Perfil.CLIENTE)
    }

    fun addPerfil(perfil: Perfil) {
        this.perfis.plus(perfil)
    }
}
