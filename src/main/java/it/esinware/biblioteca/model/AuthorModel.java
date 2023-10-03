package it.esinware.biblioteca.model;

import java.util.Date;
import java.util.List;

import it.esinware.biblioteca.domain.Author;
import it.esinware.mapping.annotation.TypeBinding;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TypeBinding(binding = Author.class)
public class AuthorModel {
			
	private Long id;
	private String name;
	private String surname;
	private Date birth;
	private String username;

}
