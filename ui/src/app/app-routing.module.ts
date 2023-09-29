import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { MainPageComponent } from './components/mainpage/mainpage.component';
import { BookComponent } from './components/book/book.component';

const routes: Routes = [

	{ path: '', component: MainPageComponent },
	{ path: 'book', component: BookComponent },
	
];


@NgModule({
  imports: [ RouterModule.forRoot(routes)],
  exports: [ RouterModule ],
})
export class AppRoutingModule {}


