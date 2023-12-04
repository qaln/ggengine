package student.examples.ggengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableJpaRepositories
@EntityScan(basePackages = "student.examples.domain.entity")
@ComponentScan(basePackages = { "student.examples" })
public class GgengineApplication {

	public static void main(String[] args) {
		SpringApplication.run(GgengineApplication.class, args);
	}

}
