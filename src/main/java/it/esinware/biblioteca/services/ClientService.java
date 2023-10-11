package it.esinware.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.esinware.biblioteca.domain.Client;
import it.esinware.biblioteca.model.ClientModel;
import it.esinware.biblioteca.repository.ClientRepository;
import it.esinware.mapping.BeanMapper;

@Service
public class ClientService {
	
	@Autowired
	ClientRepository clientRepo;
	@Autowired
	BeanMapper beanMapper;
	
	public List<ClientModel> loadClients() {
		List<Client> clients = clientRepo.findAll();
		return beanMapper.map(clients, Client.class, ClientModel.class);
	}
	
	public ClientModel save(ClientModel model) {
 		Client client = beanMapper.map(model, Client.class);
 		return beanMapper.map(clientRepo.save(client), ClientModel.class);
		
	}
}
