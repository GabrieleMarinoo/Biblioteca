package it.esinware.biblioteca.domain;

import java.util.Date;

public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String surname;
	private Date birth;
    private String email;
}
