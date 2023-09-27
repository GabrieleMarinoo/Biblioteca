package it.esinware.biblioteca.model;

import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthorModel {
			
	private Long id;
	private String name;
	private String surname;
	private Date birth;
	private String username;
	private List<BookModel> books;

}
