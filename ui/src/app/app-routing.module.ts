import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { MainPageComponent } from './components/mainpage/mainpage.component';
import { BookComponent } from './components/book/book.component';
import { ClientComponent } from './components/client/client.component';
import { AuthorComponent } from './components/author/author.component';

const routes: Routes = [

	{ path: '', component: MainPageComponent },
	{ path: 'book', component: BookComponent },
	{ path: 'client', component: ClientComponent },
	{ path: 'author', component: AuthorComponent }
	
];


@NgModule({
  imports: [ RouterModule.forRoot(routes)],
  exports: [ RouterModule ],
})
export class AppRoutingModule {}


