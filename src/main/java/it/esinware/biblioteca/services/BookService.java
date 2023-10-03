package it.esinware.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.esinware.biblioteca.domain.Book;
import it.esinware.biblioteca.model.BookModel;
import it.esinware.biblioteca.repository.BookRepository;
import it.esinware.mapping.BeanMapper;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class BookService {
	
	@Autowired
	BookRepository bookRepo;
	@Autowired
	BeanMapper beanMapper;
	
	public Book saveBook(Book book) {
		// Da cambiare
		return bookRepo.save(book);
	}
	
	public List<BookModel> loadBooks() {		
		List<Book> books = bookRepo.findAll();
		List<BookModel> model = beanMapper.map(books, Book.class, BookModel.class);		
		return model;
	}
}
