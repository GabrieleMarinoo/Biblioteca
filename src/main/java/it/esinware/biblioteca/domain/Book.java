package it.esinware.biblioteca.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {
	
	@Id @Column(length = 50)
	private String isbn;
	@Lob
	private String title;
	private double price;
	private boolean isAvaible;
	@ManyToOne
	private Editor editor;
	@ManyToOne
	private Author author;
	@ManyToOne
	private Client client;
}
