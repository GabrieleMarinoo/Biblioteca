package it.esinware.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import it.esinware.biblioteca.domain.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

}
