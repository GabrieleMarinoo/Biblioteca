import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { BackEndInterceptor } from './extension/back-end-interceptor';
import { WINDOW_PROVIDERS } from './extension/window.provider';

import { AppRoutingModule } from './app-routing.module';
import { ToolbarModule } from 'primeng/toolbar';
import { ButtonModule } from 'primeng/button';
import { TableModule } from 'primeng/table';

import { AppComponent } from './app.component';
import { MainPageComponent } from './components/mainpage/mainpage.component'
import { BookComponent } from './components/book/book.component';
import { ClientComponent } from './components/client/client.component';
import { AuthorComponent } from './components/author/author.component';

import { BookService } from './services/book.service'
import { AuthorService } from './services/author.service';
import { ClientService } from './services/client.service';


@NgModule({
  	declarations: [
    	AppComponent,
    	MainPageComponent,
    	BookComponent,
    	ClientComponent,
    	AuthorComponent
  	],
  	imports: [
   		BrowserModule,
   		HttpClientModule,
   		AppRoutingModule,
   		ToolbarModule,
   		ButtonModule,
   		TableModule
  	],
  	providers: [
		BookService,
		WINDOW_PROVIDERS,
    	{ provide: HTTP_INTERCEPTORS, useClass: BackEndInterceptor, multi: true },
    	ClientService,
    	WINDOW_PROVIDERS,
    	{ provide: HTTP_INTERCEPTORS, useClass: BackEndInterceptor, multi: true },
    	AuthorService,
    	WINDOW_PROVIDERS,
    	{ provide: HTTP_INTERCEPTORS, useClass: BackEndInterceptor, multi: true },
  	],
  	bootstrap: [AppComponent]
})
export class AppModule { }
