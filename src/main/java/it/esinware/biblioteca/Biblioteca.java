package it.esinware.biblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class Biblioteca {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Biblioteca.class);
		app.addListeners(new ApplicationPidFileWriter("biblioteca.pid"));
		app.run(args);
	}

}
