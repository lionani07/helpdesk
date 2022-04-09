package helpdesk

import helpdesk.model.Cliente
import helpdesk.model.Tecnico
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelpdeskApplication

fun main(args: Array<String>) {
	runApplication<HelpdeskApplication>(*args)
	val cliente = Cliente(1L, "Cliente", "70551810203", "lionani07@gmail.com", "1234")
	val tecnico = Tecnico(1L, "Tecnico", "70551810203", "lionani07@gmail.com", "1234")
	print(cliente.perfis)
	print(tecnico.perfis)
}
