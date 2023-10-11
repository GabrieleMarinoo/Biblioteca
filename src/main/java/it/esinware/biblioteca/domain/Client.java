package it.esinware.biblioteca.domain;

import java.util.Date;
import java.util.List;

import org.springframework.lang.NonNull;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NonNull
	private String name;
	@NonNull
	private String surname;
	@NonNull
	@Temporal(TemporalType.DATE)
	private Date birth;
	@NonNull
	private String email;
    @OneToMany(mappedBy = "client", orphanRemoval = false, cascade = CascadeType.ALL)
	private List<Book> books;
    
}
