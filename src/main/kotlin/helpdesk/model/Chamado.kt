package helpdesk.model

import helpdesk.model.enums.ChamadoPrioridade
import helpdesk.model.enums.ChamadoStatus
import java.time.LocalDate
import javax.persistence.*

@Entity
data class Chamado(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val dataAbertura: LocalDate = LocalDate.now(),
    val dataFechamento: LocalDate? = null,
    val prioridade: ChamadoPrioridade,
    val status: ChamadoStatus,
    val titulo: String,
    val observacoes: String,

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    val tecnico: Tecnico,


    @ManyToOne
    @JoinColumn(name = "cliente_id")
    val cliente: Cliente
)