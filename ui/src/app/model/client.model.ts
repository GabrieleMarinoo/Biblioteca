import { Type } from 'class-transformer';
import 'reflect-metadata';

export class Client {
	
	public id : number;
	public name: string;
	public surname: string;
	@Type(() => Date)
	public birth: Date;
	public email: string;
	
}