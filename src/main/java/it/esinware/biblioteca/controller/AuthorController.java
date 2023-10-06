package it.esinware.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.esinware.biblioteca.domain.Author;
import it.esinware.biblioteca.model.AuthorModel;
import it.esinware.biblioteca.model.BookModel;
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
}
