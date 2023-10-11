import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Editor } from 'src/app/model/editor.model';
import { EditorService } from 'src/app/services/editor.service';

@Component({
  selector: 'edit-editor',
  templateUrl: './edit-editor.component.html',
  styleUrls: ['./edit-editor.component.css']
})

export class EditEditorComponent implements OnInit {
	
	@Input() editor: Editor;
	@Output() onDialog: EventEmitter<boolean> = new EventEmitter<boolean>();
	@Output() onSaved: EventEmitter<Editor> = new EventEmitter<Editor>();
	//@Output() editorChange:EventEmitter<Editor> = new EventEmitter<Editor>();
	
	constructor(private editorService: EditorService) { };
	
	ngOnInit(): void { }
		
	save() {
			this.editorService.save(this.editor).subscribe(response => {
			this.onSaved.emit(response);
			this.onDialog.emit(false);
		});	
	}	
}