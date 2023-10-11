import { Component, OnInit } from '@angular/core';
import { EditorService } from 'src/app/services/editor.service';
import { Editor } from 'src/app/model/editor.model'

interface Column {
    field: string;
    header: string;
}

@Component({
  selector: 'editor',
  templateUrl: './editor.component.html',
  styleUrls: ['./editor.component.css']
})
export class EditorComponent implements OnInit {
    
    newEditor: Editor;
	editors: Editor[];
	cols: Column[];
	loading: boolean = false;
	visible: boolean = false;
	
	constructor(private service: EditorService) { };
			
	ngOnInit() {
		
		this.cols = [
            { field: 'id', header: 'Codice' },
            { field: 'name', header: 'Nome' },
            
        ];
		
		this.load();
	}

	load() {
		this.loading = true;
		this.service.load().subscribe(response => { 
			this.editors = response; 
			this.loading = false;
		});
	}
	
	add() {
		this.newEditor  = new Editor();
		this.visible = true;
	}
	
	saved(editor: Editor) {
		this.load();
	}
		
	update(rowData : Editor) {
		this.newEditor = rowData;
		this.visible = true;
	}
}