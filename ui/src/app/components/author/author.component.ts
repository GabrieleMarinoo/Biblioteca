import { Component, OnInit } from '@angular/core';
import { AuthorService } from 'src/app/services/author.service';
import { Author } from 'src/app/model/author.model'

interface Column {
    field: string;
    header: string;
}

@Component({
  selector: 'author',
  templateUrl: './author.component.html',
  styleUrls: ['./author.component.css']
})
export class AuthorComponent implements OnInit {

	authors: Author[];
	cols: Column[];
	loading: boolean = false;
	
	constructor(private service: AuthorService) { };
			
	ngOnInit() {
		
		this.cols = [
            { field: 'id', header: 'Codice' },
            { field: 'name', header: 'Nome' },
            { field: 'birth', header: 'Data di nascita' },
            { field: 'surname', header: 'Cognome' },
            { field : 'author', header : 'Autore'}        
        ];
		
		this.load();
	}

	load() {
		this.loading = true;
		this.service.load().subscribe(response => { 
			this.authors = response; 
			this.loading = false;
		});
	}
}