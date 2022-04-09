package helpdesk.model

import helpdesk.model.enums.ChamadoPrioridade
import helpdesk.model.enums.ChamadoStatus
import java.time.LocalDate

data class Chamado(
    val id: Long,
    val dataAbertura: LocalDate = LocalDate.now(),
    val dataFechamento: LocalDate,
    val prioridade: ChamadoPrioridade,
    val status: ChamadoStatus,
    val titulo: String,
    val observacoes: String,
    val tecnico: Tecnico,
    val cliente: Cliente
)