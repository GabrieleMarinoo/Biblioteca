package it.esinware.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import it.esinware.biblioteca.model.AuthorModel;
import it.esinware.biblioteca.services.AuthorService;

@Controller
@RequestMapping("/authors")
public class AuthorController {
	
	@Autowired
	AuthorService authorService;
	
	@GetMapping("/load")
	public ResponseEntity<List<AuthorModel>> load() {
		return new ResponseEntity<List<AuthorModel>>(authorService.loadAuthors(), HttpStatus.OK);
	}
	
	@PostMapping(value = "/save")
	public ResponseEntity<AuthorModel> save(@RequestBody AuthorModel model) {
		MultiValueMap<String, String> headers = new HttpHeaders();
		AuthorModel saved = authorService.save(model);
		return new ResponseEntity<>(saved, headers, HttpStatus.OK);
	}

}
