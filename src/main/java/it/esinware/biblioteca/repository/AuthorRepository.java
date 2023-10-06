package it.esinware.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.esinware.biblioteca.domain.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> { }
