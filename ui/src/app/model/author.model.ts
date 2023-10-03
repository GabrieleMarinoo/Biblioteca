import { Type } from 'class-transformer';
import 'reflect-metadata';

export class Author {
	
	public id : number;
	public name: string;
	@Type(() => Date)
	public birth: Date;
	public surname: string;
	
}