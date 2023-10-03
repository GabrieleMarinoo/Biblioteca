package it.esinware.biblioteca.model;

import it.esinware.biblioteca.domain.Book;
import it.esinware.mapping.annotation.TypeBinding;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TypeBinding(binding = Book.class)
public class BookModel {
	
	private String isbn;
	private String title;
	private Long price;
	private Boolean isAvailable;	
	private EditorModel editor;	
	private AuthorModel author;
	private ClientModel client;

}
