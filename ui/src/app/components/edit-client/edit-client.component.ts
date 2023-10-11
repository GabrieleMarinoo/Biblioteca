import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Client } from 'src/app/model/client.model';
import { ClientService } from 'src/app/services/client.service';

@Component({
  selector: 'edit-client',
  templateUrl: './edit-client.component.html',
  styleUrls: ['./edit-client.component.css']
})

export class EditClientComponent implements OnInit {
	
	@Input() client: Client;
	@Output() onDialog: EventEmitter<boolean> = new EventEmitter<boolean>();
	@Output() onSaved: EventEmitter<Client> = new EventEmitter<Client>();
	//@Output() clientChange:EventEmitter<Client> = new EventEmitter<Client>();
	
	constructor(private clientService: ClientService) {
		
		};
	
	ngOnInit(): void { }
		
	save() {
			this.clientService.save(this.client).subscribe(response => {
			console.log(response);
			this.onSaved.emit(response);
			this.onDialog.emit(false);
		});
		
	}	
}