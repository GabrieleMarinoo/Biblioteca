import { Component, OnInit, Input, Output, EventEmitter, Injectable } from '@angular/core';
import { Author } from 'src/app/model/author.model';
import { AuthorService } from 'src/app/services/author.service';
import { LocaleSettings } from 'primeng/calendar';

@Component({
  selector: 'edit-author',
  templateUrl: './edit-author.component.html',
  styleUrls: ['./edit-author.component.css']
})

export class EditAuthorComponent implements OnInit {
	
	locale: LocaleSettings = {
    firstDayOfWeek: 1,
    dayNames: ["Domenica", "Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato"],
    dayNamesShort: ["Dom", "Lun", "Mar", "Mer", "Gio", "Ven", "Sab"],
    dayNamesMin: ["Do", "Lu", "Ma", "Me", "Gi", "Ve", "Sa"],
    monthNames: ["Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"],
    monthNamesShort: ["Gen", "Feb", "Mar", "Apr", "Mag", "Giu", "Lug", "Ago", "Set", "Ott", "Nov", "Dic"],
    today: 'Oggi',
    clear: 'Cancella',
    dateFormat: 'dd.mm.yy',
    weekHeader: 'Wk'
  };

	@Input() author: Author;
	@Output() onDialog: EventEmitter<boolean> = new EventEmitter<boolean>();
	@Output() onSaved: EventEmitter<Author> = new EventEmitter<Author>();
	//@Output() authorChange:EventEmitter<Author> = new EventEmitter<Author>();
	
	constructor(private authorService: AuthorService) { }
	
	ngOnInit(): void { }
		
	save() {
		this.authorService.save(this.author).subscribe(response => {
		this.onSaved.emit(response);
		this.onDialog.emit(false);
		});	
	}	
}