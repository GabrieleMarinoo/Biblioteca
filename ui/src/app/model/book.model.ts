import { Type } from 'class-transformer';
import 'reflect-metadata';

import { Author } from '../model/author.model';
import { Editor } from '../model/editor.model';
import { Client } from '../model/client.model';

export class Book {
	
	public isbn : string;
	public title: string;
	public price: number;
	public isAvailable: boolean;
	@Type(() => Editor)	
	public editor: Editor;
	@Type(() => Author)
	public author: Author;
	@Type(() => Client)
	public client: Client;
	
}