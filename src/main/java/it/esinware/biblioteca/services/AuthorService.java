package it.esinware.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.esinware.biblioteca.domain.Author;
import it.esinware.biblioteca.model.AuthorModel;
import it.esinware.biblioteca.repository.AuthorRepository;
import it.esinware.mapping.BeanMapper;

@Service
public class AuthorService {
	
	@Autowired
	AuthorRepository authorRepo;
	@Autowired
	BeanMapper beanMapper;
	
	public List<AuthorModel> loadAuthors() {
		List<Author> authors = authorRepo.findAll();
		List<AuthorModel> model = beanMapper.map(authors, Author.class, AuthorModel.class);		
		return model;
	}
}
