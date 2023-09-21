package it.esinware.biblioteca.domain;

@Getter
@Setter
public class Editor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
}
