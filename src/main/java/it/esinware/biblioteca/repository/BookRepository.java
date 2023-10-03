package it.esinware.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.esinware.biblioteca.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String> { }
