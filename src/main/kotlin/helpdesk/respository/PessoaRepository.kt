package helpdesk.respository

import helpdesk.model.Pessoa
import org.springframework.data.jpa.repository.JpaRepository

interface PessoaRepository: JpaRepository<Pessoa, Long> {
}