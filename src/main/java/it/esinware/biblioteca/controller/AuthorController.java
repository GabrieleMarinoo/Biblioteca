 package it.esinware.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.esinware.biblioteca.domain.Author;
import it.esinware.biblioteca.services.AuthorService;

@Controller
@RequestMapping("/authors")
public class AuthorController {
	
	@Autowired
	AuthorService authorService;
	
	@GetMapping("/load")
	public ResponseEntity<Iterable<Author>> load() {
		return new ResponseEntity<Iterable<Author>>(authorService.loadAuthors(), HttpStatus.OK);
	}
}
