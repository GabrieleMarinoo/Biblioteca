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

import { BookService } from './services/book.service'

@NgModule({
  	declarations: [
    	AppComponent,
    	MainPageComponent,
    	BookComponent
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
  	],
  	bootstrap: [AppComponent]
})
export class AppModule { }
