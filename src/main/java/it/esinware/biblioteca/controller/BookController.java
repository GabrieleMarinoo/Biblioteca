package it.esinware.biblioteca.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.classic.Logger;
import it.esinware.biblioteca.model.BookModel;
import it.esinware.biblioteca.services.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	BookService bookService;

	@GetMapping("/load")
	public ResponseEntity<List<BookModel>> load() {
		return new ResponseEntity<List<BookModel>>(bookService.loadBooks(), HttpStatus.OK);
	}
}

