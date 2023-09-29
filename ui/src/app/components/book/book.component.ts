import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/services/book.service';
import { Book } from 'src/app/model/book.model'

@Component({
  selector: 'book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {

	book: Book;
	
	constructor(private service: BookService) { };
			
	ngOnInit() {
		this.load();
	}

	load() {
		console.log('CALL BOOK');
		//this.service.load().subscribe(response => { this.book = response});
		console.log(this.book);
	}
}