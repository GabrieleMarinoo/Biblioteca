import { Type } from 'class-transformer';
import 'reflect-metadata';

export class Book {
	
	public isbn : string;
	public title: string;
	public price: number;
	public isAvailable: boolean;
	//@Type(() => Editor)	
	//public editor: Editor;
	//@Type(() => Author)
	//public author: Author;
	//@Type(() => Client)
	//public client: Client;
	
}