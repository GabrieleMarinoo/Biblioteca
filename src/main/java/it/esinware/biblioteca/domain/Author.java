package it.esinware.biblioteca.domain;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private Long id;
     private String name;
	 private String surname;
	 private Date birth;
	@OneToMany(mappedBy = "author", orphanRemoval = true, cascade = CascadeType.ALL)
	@Getter(AccessLevel.NONE)
	private List<Book> books;	
}
