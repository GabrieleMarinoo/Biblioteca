package it.esinware.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import it.esinware.biblioteca.domain.Editor;
import it.esinware.biblioteca.services.EditorService;

@Controller
@RequestMapping("/editors")
public class EditorController {
	
	@Autowired
	EditorService editorService;
	
	@GetMapping("/load")
	public ResponseEntity<Iterable<Editor>> load() {
		return new ResponseEntity<Iterable<Editor>>(editorService.loadEditors(), HttpStatus.OK);
	}
}
