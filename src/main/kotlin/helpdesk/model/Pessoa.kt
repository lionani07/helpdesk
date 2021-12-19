package helpdesk.model

import helpdesk.model.enums.Perfil
import java.time.LocalDate

abstract class Pessoa(
    open val id: Long,
    open val nome: String,
    open val cpf: String,
    open val email: String,
    open val senha: String,
    open val dataCriacao: LocalDate = LocalDate.now(),
    open val perfis: Set<Perfil> = emptySet()
){
    init {
        addPerfil(Perfil.CLIENTE)
    }

    fun addPerfil(perfil: Perfil) {
        this.perfis.plus(perfil)
    }
}