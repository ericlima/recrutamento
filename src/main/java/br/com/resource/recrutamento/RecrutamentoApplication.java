package br.com.resource.recrutamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan
@EnableJpaRepositories(basePackages = "br.com.resource.recrutamento")
@PropertySource("classpath:application.properties")
public class RecrutamentoApplication {
	public static void main(String[] args) {
		SpringApplication.run(RecrutamentoApplication.class, args);
	}
}
