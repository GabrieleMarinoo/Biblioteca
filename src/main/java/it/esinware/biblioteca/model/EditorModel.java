package it.esinware.biblioteca.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditorModel {
	
	private Long id;
	private String name;
	private List<BookModel> books;
	
}
