import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { PrimeNGConfig } from 'primeng/api';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
	
	
	constructor(public router: Router,  private primeNGConfig: PrimeNGConfig) {}
	
	ngOnInit(): void {
		this.primeNGConfig.setTranslation({
			dayNames: [ "domenica","lunedì","martedì","mercoledì","giovedì","venerdì","sabato" ],
			dayNamesShort: [ "dom","lun","mar","mer","gio","ven","sab" ],
			dayNamesMin: [ "D","L","M","M","G","V","S" ],
			monthNames: [ "gennaio","febbraio","marzo","aprile","maggio","giugno","luglio","agosto","settembre","ottobre","novembre","dicembre" ],
			monthNamesShort: [ "gen","feb","mar","apr","mag","giu","lug","ago","set","ott","nov","dic" ],
			today: 'Oggi',
			clear: 'Cancella'}
		);
  }

}
