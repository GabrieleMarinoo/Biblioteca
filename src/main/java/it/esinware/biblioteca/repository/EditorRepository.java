package it.esinware.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.esinware.biblioteca.domain.Client;
import it.esinware.biblioteca.domain.Editor;

@Repository
public interface EditorRepository extends JpaRepository<Editor, Long> { }
