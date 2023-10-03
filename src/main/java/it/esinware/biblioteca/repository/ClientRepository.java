package it.esinware.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.esinware.biblioteca.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> { }
