package helpdesk.config

import helpdesk.service.TestDbService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("dev")
class DevConfig {

    @Autowired
    private lateinit var testDbService: TestDbService

    @Value("\${spring.jpa.hibernate.ddl-auto}")
    private lateinit var ddlAuto: String

    @Bean
    fun init() {
        if ("create" == this.ddlAuto) {
            this.testDbService.initDb()
        }
    }
}