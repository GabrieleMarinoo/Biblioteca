package it.esinware.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.esinware.biblioteca.model.ClientModel;
import it.esinware.biblioteca.services.ClientService;

@Controller
@RequestMapping("/clients")
public class ClientController {
	
	@Autowired
	ClientService clientService;
	
	@GetMapping("/load")
	public ResponseEntity<List<ClientModel>> load() {
		return new ResponseEntity<List<ClientModel>>(clientService.loadClients(), HttpStatus.OK);
	}

}
