package it.esinware.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import it.esinware.biblioteca.domain.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {
	
}
