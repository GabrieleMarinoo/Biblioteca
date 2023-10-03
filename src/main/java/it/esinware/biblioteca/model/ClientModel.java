package it.esinware.biblioteca.model;

import java.util.Date;

import it.esinware.biblioteca.domain.Client;
import it.esinware.mapping.annotation.TypeBinding;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TypeBinding(binding = Client.class)
public class ClientModel {
	
	private Long id;
	private String name;
	private String surname;
	private Date birth;
    private String email;
}
