package it.esinware.biblioteca.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Book {
	
	@Id 
	@Column(length = 50)
	private String isbn;
	@Lob
	private String title;
	private Long price;
	private Boolean isAvailable;
	@ManyToOne
	private Editor editor;
	@ManyToOne
	private Author author;
	@ManyToOne
	private Client client;
	
	public Book() { } 
	public Book(String isbn, String title, Long price, Boolean isAvailable) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.isAvailable = isAvailable;
	}	
	
}
