package it.esinware.biblioteca;

import org.burningwave.core.assembler.StaticComponentContainer;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
@EnableWebMvc
public class Biblioteca {
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(Biblioteca.class);

	public static void main(String[] args) {
		StaticComponentContainer.Modules.exportAllToAll();
		SpringApplication app = new SpringApplication(Biblioteca.class);
		app.addListeners(new ApplicationPidFileWriter("biblioteca.pid"));
		app.run(args);
		logger.info("STARTED SUCCESSFULLY ... ");		
	}

}
