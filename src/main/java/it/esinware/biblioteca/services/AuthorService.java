package it.esinware.biblioteca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.esinware.biblioteca.domain.Author;
import it.esinware.biblioteca.repository.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	AuthorRepository authorRepo;
	
	public Iterable<Author> loadAuthors() {
		return authorRepo.findAll();
	}
}
