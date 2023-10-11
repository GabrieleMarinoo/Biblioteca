import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map, first } from 'rxjs/operators';
import { plainToClass } from "class-transformer";
import { Client } from './../model/client.model';

@Injectable()
export class ClientService {

	constructor(private http: HttpClient) {}

  	load(): Observable<Client[]> {
    	return this.http.get<Client[]>("/clients/load").pipe(first(), map(res => {return plainToClass(Client, res)}));
  	}
  
  save(client: Client): Observable<Client> {
		return this.http.post<Client>('/clients/save', client).pipe(first(),map(res => {return plainToClass(Client, res)}));
	}  
}