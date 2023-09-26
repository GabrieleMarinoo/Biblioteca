package it.esinware.biblioteca.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthorModel {
			
	private Long id;
	private String name;
	private String surname;
	private Date birth;

}
