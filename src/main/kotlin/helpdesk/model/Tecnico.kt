package helpdesk.model

import helpdesk.model.enums.PessoaPerfil
import javax.persistence.Entity
import javax.persistence.OneToMany

@Entity
class Tecnico(
    id: Long,
    nome: String,
    cpf: String,
    email: String,
    senha: String,

    @OneToMany(mappedBy = "tecnico")
    val chamados: List<Chamado> = arrayListOf()
) : Pessoa(id, nome, cpf, email, senha) {
    init {
        addPerfil(PessoaPerfil.TECNICO)
    }
}