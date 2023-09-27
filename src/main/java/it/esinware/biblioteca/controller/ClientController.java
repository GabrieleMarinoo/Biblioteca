package it.esinware.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import it.esinware.biblioteca.domain.Client;
import it.esinware.biblioteca.services.ClientService;

@Controller
@RequestMapping("/clients")
public class ClientController {
	
	@Autowired
	ClientService clientService;
	
	@GetMapping("/load")
	public ResponseEntity<Iterable<Client>> load() {
		return new ResponseEntity<Iterable<Client>>(clientService.loadClients(), HttpStatus.OK);
	}
}
