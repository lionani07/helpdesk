package helpdesk.model

import helpdesk.model.enums.PessoaPerfil
import javax.persistence.Entity
import javax.persistence.OneToMany

@Entity
class Cliente(
    id: Long?,
    nome: String,
    cpf: String,
    email: String,
    senha: String,

    @OneToMany(mappedBy = "cliente")
    val chamados: List<Chamado> = arrayListOf()
): Pessoa(id, nome, cpf, email, senha) {
    init {
        addPerfil(PessoaPerfil.CLIENTE)
    }
}