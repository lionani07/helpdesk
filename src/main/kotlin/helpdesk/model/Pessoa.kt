package helpdesk.model

import helpdesk.model.enums.PessoaPerfil
import java.time.LocalDate
import javax.persistence.*

@Entity
abstract class Pessoa(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open val id: Long,
    open val nome: String,
    open val cpf: String,
    open val email: String,
    open val senha: String,
    open val dataCriacao: LocalDate = LocalDate.now(),

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "PERFIS")
    open val perfis: MutableSet<PessoaPerfil> = mutableSetOf()
){
    fun addPerfil(perfil: PessoaPerfil) {
        perfis.add(perfil)
    }
}