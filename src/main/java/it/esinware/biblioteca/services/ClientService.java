package it.esinware.biblioteca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.esinware.biblioteca.domain.Client;
import it.esinware.biblioteca.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	ClientRepository clientRepo;
	
	public Iterable<Client> loadClients() {
		return clientRepo.findAll();
	}
}
