package helpdesk.config

import helpdesk.service.TestDbService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("test")
class TestConfig {

    @Autowired
    private lateinit var testDbService: TestDbService

    @Bean
    fun init() {
        this.testDbService.initDb()
    }
}