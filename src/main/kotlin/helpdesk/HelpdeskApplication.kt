package helpdesk

import helpdesk.model.Chamado
import helpdesk.model.Cliente
import helpdesk.model.Tecnico
import helpdesk.model.enums.ChamadoPrioridade
import helpdesk.model.enums.PessoaPerfil
import helpdesk.respository.ChamadoRepository
import helpdesk.respository.PessoaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.AutoConfigurationPackage
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelpdeskApplication : CommandLineRunner {

	@Autowired
	private lateinit var pessoaRepository: PessoaRepository

	@Autowired
	private lateinit var chamadoRepository: ChamadoRepository

	override fun run(vararg args: String?) {
		val cliente = Cliente(null, "Cliente", "70551810203", "cliente@gmail.com", "1234")
		val tecnico = Tecnico(null, "Tecnico", "70551810203", "tecnico@gmail.com", "1234")
		tecnico.addPerfil(PessoaPerfil.ADMIN)
		val chamado = Chamado(null, ChamadoPrioridade.BAIXA, "Chamado um", "Primero chamdo", tecnico, cliente)

		this.pessoaRepository.saveAll(listOf(cliente, tecnico))
		this.chamadoRepository.save(chamado)
	}
}

fun main(args: Array<String>) {
	runApplication<HelpdeskApplication>(*args)
}
