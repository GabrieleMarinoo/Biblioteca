package it.esinware.biblioteca.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Editor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter private Long id;
	@Getter private String name;
	@OneToMany(mappedBy = "editor", orphanRemoval = false, cascade = CascadeType.ALL)
	private List<Book> books;

}
