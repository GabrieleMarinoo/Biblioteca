package it.esinware.biblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class Biblioteca {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Biblioteca.class);
		app.addListeners(new ApplicationPidFileWriter("biblioteca.pid"));
		app.run(args);
		
	}

}
