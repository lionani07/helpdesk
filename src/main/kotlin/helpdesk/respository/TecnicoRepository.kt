package helpdesk.respository

import helpdesk.model.Tecnico
import org.springframework.data.jpa.repository.JpaRepository

interface TecnicoRepository: JpaRepository<Tecnico, Long> {
}