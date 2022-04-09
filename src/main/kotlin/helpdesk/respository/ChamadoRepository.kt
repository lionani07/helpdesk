package helpdesk.respository

import helpdesk.model.Chamado
import org.springframework.data.jpa.repository.JpaRepository

interface ChamadoRepository: JpaRepository<Chamado, Long> {
}