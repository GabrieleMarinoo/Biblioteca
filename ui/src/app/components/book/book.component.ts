import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/services/book.service';
import { Book } from 'src/app/model/book.model'

interface Column {
    field: string;
    header: string;
}

@Component({
  selector: 'book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {

	books: Book[];
	cols: Column[];
	loading: boolean = false;
	
	constructor(private service: BookService) { };
			
	ngOnInit() {
		
		this.cols = [
            { field: 'isbn', header: 'Codice' },
            { field: 'price', header: 'Prezzo' },
            { field: 'title', header: 'Titolo' },
            { field: 'isAvailable', header: 'Disponibilità' }
        ];
		
		this.load();
	}

	load() {
		this.loading = true;
		this.service.load().subscribe(response => { 
			this.books = response; 
			this.loading = false;
		});
	}
}