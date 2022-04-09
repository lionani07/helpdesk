package helpdesk.model

import helpdesk.model.enums.ChamadoPrioridade
import helpdesk.model.enums.ChamadoStatus
import java.time.LocalDate
import javax.persistence.*

@Entity
data class Chamado(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val prioridade: ChamadoPrioridade,
    val titulo: String,
    val observacoes: String,

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    val tecnico: Tecnico,

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    val cliente: Cliente
) {
    val status: ChamadoStatus = ChamadoStatus.ABERTO
    val dataAbertura: LocalDate = LocalDate.now()
    val dataFechamento: LocalDate? = null
}