package helpdesk.model

import helpdesk.model.enums.ChamadoPrioridade
import helpdesk.model.enums.ChamadoStatus
import java.time.LocalDate

data class Chamado(
    val id: Long,
    val dataFechamento: LocalDate,
    val prioridade: ChamadoPrioridade,
    val status: ChamadoStatus,
    val titulo: String,
    val observacoes: String,

    val tecnico: Tecnico,
    val cliente: Cliente
) {
    val dataAbertura: LocalDate =  LocalDate.now()
}

fun main() {

    val tecnico = Tecnico(1L, "", "", "", "")
    val cliente = Cliente(2L, "", "", "", "")

    val chamado  = Chamado(1L, LocalDate.now(), ChamadoPrioridade.ALTA, ChamadoStatus.ANDAMENTO, "Chamado 1,", "", tecnico, cliente)

    print(chamado)
}
