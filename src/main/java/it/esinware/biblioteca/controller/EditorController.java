package it.esinware.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import it.esinware.biblioteca.model.EditorModel;
import it.esinware.biblioteca.model.EditorModel;
import it.esinware.biblioteca.services.EditorService;

@Controller
@RequestMapping("/editors")
public class EditorController {
	
	@Autowired
	EditorService editorService;
	
	@GetMapping("/load")
	public ResponseEntity<List<EditorModel>> load() {
		return new ResponseEntity<List<EditorModel>>(editorService.loadEditors(), HttpStatus.OK);
	}
	

	@PostMapping(value = "/save")
	public ResponseEntity<EditorModel> save(@RequestBody EditorModel model) {
		MultiValueMap<String, String> headers = new HttpHeaders();
		EditorModel saved = editorService.save(model);
		return new ResponseEntity<>(saved, headers, HttpStatus.OK);
	}
}
