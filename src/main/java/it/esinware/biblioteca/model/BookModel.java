package it.esinware.biblioteca.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookModel {
	
	private String isbn;
	private String title;
	private Long price;
	private Boolean isAvailable;	
	private EditorModel editor;	
	private AuthorModel author;
	private ClientModel client;

}
