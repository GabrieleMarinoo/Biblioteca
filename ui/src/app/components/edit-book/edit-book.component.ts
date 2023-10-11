import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Book } from 'src/app/model/book.model';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'edit-book',
  templateUrl: './edit-book.component.html',
  styleUrls: ['./edit-book.component.css']
})

export class EditBookComponent implements OnInit {
	
	@Input() book: Book;
	@Output() onDialog: EventEmitter<boolean> = new EventEmitter<boolean>();
	@Output() onSaved: EventEmitter<Book> = new EventEmitter<Book>();
	//@Output() bookChange:EventEmitter<Book> = new EventEmitter<Book>();
	
	constructor(private bookService: BookService) {
		
		};
	
	ngOnInit(): void { }
		
	save() {
			this.bookService.save(this.book).subscribe(response => {
			console.log(response);
			this.onSaved.emit(response);
			this.onDialog.emit(false);
		});
		
	}	
}