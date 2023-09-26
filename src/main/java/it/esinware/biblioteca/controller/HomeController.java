package it.esinware.biblioteca.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.classic.Logger;
import it.esinware.biblioteca.Biblioteca;
import it.esinware.biblioteca.domain.Book;
import it.esinware.biblioteca.services.BookService;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(Biblioteca.class);
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/insert")
	public String prova(Model model) {   
		Book b = new Book();
		model.addAttribute("book", b);
	    return "insert";
	  }
	
	//non funzionante
	@PostMapping("/insert")
	public String submitForm(@ModelAttribute("book") Book b) {
	    System.out.println("tutto funzionante");
	    return "inserimentoandatoabuonfine";
	   
	}
	
	public ResponseEntity<Book> insert() {
		Book book = new Book("asdnf2894u9231gh3", "Just for Fun", 12L, true);
		book = bookService.saveBook(book);
		logger.info("Book added correctly");
		return new ResponseEntity<Book>(book, HttpStatus.OK);
	}

	
}
