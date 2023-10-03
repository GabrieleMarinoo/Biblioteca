import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map, first } from 'rxjs/operators';
import { plainToClass } from "class-transformer";
import { Book } from './../model/book.model';

@Injectable()
export class BookService {

	constructor(private http: HttpClient) {}

  	load(): Observable<Book[]> {
    	return this.http.get<Book[]>("/books/load").pipe(first(), map(res => {return plainToClass(Book, res)}));
  	}
  
}