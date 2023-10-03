package it.esinware.biblioteca.model;

import java.util.List;

import it.esinware.biblioteca.domain.Editor;
import it.esinware.mapping.annotation.TypeBinding;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TypeBinding(binding = Editor.class)
public class EditorModel {
	
	private Long id;
	private String name;
}
