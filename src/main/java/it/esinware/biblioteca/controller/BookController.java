package it.esinware.biblioteca.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ch.qos.logback.classic.Logger;
import it.esinware.biblioteca.domain.Book;
import it.esinware.biblioteca.services.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	BookService bookService;
	
	/*
	 * affinché funzioni ho "rimosso" il getter dell'attributo books
	 * dalle varie classi del domain altrimenti restituisce: https://pastebin.com/YeF791ZU
	 */
	@GetMapping("/load")
	public ResponseEntity<Iterable<Book>> load() {
		return new ResponseEntity<Iterable<Book>>(bookService.loadBooks(), HttpStatus.OK);
	}
}

