package helpdesk.service

import helpdesk.model.Chamado
import helpdesk.model.Cliente
import helpdesk.model.Tecnico
import helpdesk.model.enums.ChamadoPrioridade
import helpdesk.model.enums.PessoaPerfil
import helpdesk.respository.ChamadoRepository
import helpdesk.respository.ClienteRepository
import helpdesk.respository.TecnicoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TestDbService {

    @Autowired
    private lateinit var clienteRepository: ClienteRepository

    @Autowired
    private lateinit var tecnicoRepository: TecnicoRepository

    @Autowired
    private lateinit var chamadoRepository: ChamadoRepository

    fun initDb() {
        val cliente = Cliente(null, "Cliente", "75039111070", "cliente@gmail.com", "1234")
        val tecnico = Tecnico(null, "Tecnico", "77866711020", "tecnico@gmail.com", "1234")
        tecnico.addPerfil(PessoaPerfil.ADMIN)
        val chamado = Chamado(null, ChamadoPrioridade.BAIXA, "Chamado um", "Primero chamdo", tecnico, cliente)

        this.clienteRepository.save(cliente)
        this.tecnicoRepository.save(tecnico)
        this.chamadoRepository.save(chamado)
    }
}