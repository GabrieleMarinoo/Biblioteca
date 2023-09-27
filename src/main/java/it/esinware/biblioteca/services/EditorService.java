package it.esinware.biblioteca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.esinware.biblioteca.domain.Editor;
import it.esinware.biblioteca.repository.EditorRepository;

@Service
public class EditorService {
	
	@Autowired
	EditorRepository editorRepo;
	
	public Iterable<Editor> loadEditors() {
		return editorRepo.findAll();
	}
}
