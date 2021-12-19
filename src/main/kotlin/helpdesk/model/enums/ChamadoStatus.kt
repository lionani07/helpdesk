package helpdesk.model.enums

enum class ChamadoStatus(val codigo: Int, descricao: String) {

    ABERTO(0, "ABERTO"),
    ANDAMENTO(1, "ANDAMENTO"),
    ENCERRADO(2, "ENCERRADO");
}