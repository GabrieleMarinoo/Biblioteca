package it.esinware.biblioteca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.esinware.biblioteca.domain.Book;
import it.esinware.biblioteca.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepo;
	
	public Book saveBook(Book book) {
		return bookRepo.save(book);
	}
	
	public Iterable<Book> loadBooks() {
		return bookRepo.findAll();
	}
}
