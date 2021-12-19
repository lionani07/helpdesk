package helpdesk.model

import helpdesk.model.enums.PessoaPerfil

class Cliente(
    id: Long,
    nome: String,
    cpf: String,
    email: String,
    senha: String,
    val chamados: List<Chamado> = arrayListOf()
): Pessoa(id, nome, cpf, email, senha) {

    init {
        addPerfil(PessoaPerfil.CLIENTE)
    }
}