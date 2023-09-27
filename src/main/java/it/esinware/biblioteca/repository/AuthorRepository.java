package it.esinware.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import it.esinware.biblioteca.domain.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
