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

	editors: Editor[];
	cols: Column[];
	loading: boolean = false;
	
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
}