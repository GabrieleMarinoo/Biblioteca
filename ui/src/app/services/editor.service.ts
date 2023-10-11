import { Injectable } from '@angular/core';
import {HttpResponse, HttpParams, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map, first } from 'rxjs/operators';
import { plainToClass } from "class-transformer";
import { Editor } from './../model/editor.model';

@Injectable()
export class EditorService {

	constructor(private http: HttpClient) {}

  	load(): Observable<Editor[]> {
    	return this.http.get<Editor[]>("/editors/load").pipe(first(), map(res => {return plainToClass(Editor, res)}));
  	}
  	
  	save(editor: Editor): Observable<Editor> {
		return this.http.post<Editor>('/editors/save', editor).pipe(first(),map(res => {return plainToClass(Editor, res)}));
	}  
  
}