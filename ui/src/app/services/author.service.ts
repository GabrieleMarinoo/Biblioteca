import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map, first } from 'rxjs/operators';
import { plainToClass } from "class-transformer";
import { Author } from './../model/author.model';
//import { AuthorModel } from './../model/author.model'

@Injectable()
export class AuthorService {

	constructor(private http: HttpClient) {}

  	load(): Observable<Author[]> {
    	return this.http.get<Author[]>("/authors/load").pipe(first(), map(res => {return plainToClass(Author, res)}));
  	}
  
  save(author: Author): Observable<Author> {
		return this.http.post<Author>('/authors/save', author).pipe(first(),map(res => {return plainToClass(Author, res)}));
	}

}