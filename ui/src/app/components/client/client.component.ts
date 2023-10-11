import { Component, OnInit } from '@angular/core';
import { ClientService } from 'src/app/services/client.service';
import { Client } from 'src/app/model/client.model'

interface Column {
    field: string;
    header: string;
}

@Component({
  selector: 'client',
  templateUrl: './client.component.html',
  styleUrls: ['./client.component.css']
})
export class ClientComponent implements OnInit {

	clients: Client[];
	newClient : Client;
	cols: Column[];
	loading: boolean = false;
	visible: boolean = false;
	
	constructor(private service: ClientService) { };
			
	ngOnInit() {
		
		this.cols = [
            { field: 'id', header: 'Codice' },
            { field: 'name', header: 'Nome' },
            { field: 'surname', header: 'Cognome' },
            { field: 'birth', header: 'Data di nascita' },
            { field : 'email', header : 'Contatto'}
            
        ];
		
		this.load();
	}

	load() {
		this.loading = true;
		this.service.load().subscribe(response => { 
			this.clients = response; 
			this.loading = false;
		});
	}
	
	add() {
		this.newClient  = new Client();
		this.visible = true;
	}
	
	saved(client: Client) {
		this.load();
	}
	
	update(rowData : Client) {
		this.newClient = rowData;
		this.visible = true;
	}
}