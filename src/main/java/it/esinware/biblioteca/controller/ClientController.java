package it.esinware.biblioteca.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		List<ClientModel> list = clientService.loadClients();
		return new ResponseEntity<List<ClientModel>>(list, HttpStatus.OK);
	}

	@PostMapping(value = "/save")
	public ResponseEntity<ClientModel> save(@RequestBody ClientModel model) {
		MultiValueMap<String, String> headers = new HttpHeaders();
		ClientModel saved = clientService.save(model);
		return new ResponseEntity<>(saved, headers, HttpStatus.OK);
	}
	
}
