package it.esinware.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.esinware.biblioteca.domain.Editor;
import it.esinware.biblioteca.model.EditorModel;
import it.esinware.biblioteca.repository.EditorRepository;
import it.esinware.mapping.BeanMapper;

@Service
public class EditorService {
	
	@Autowired
	EditorRepository editorRepo;
	@Autowired
	BeanMapper beanMapper;
	
	public List<EditorModel> loadEditors() {
		List<Editor> editors = editorRepo.findAll();
		List<EditorModel> model = beanMapper.map(editors, Editor.class, EditorModel.class);		
		return model;
	}
}
