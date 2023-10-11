import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { DialogModule } from 'primeng/dialog';
import { BackEndInterceptor } from './extension/back-end-interceptor';
import { WINDOW_PROVIDERS } from './extension/window.provider';

import { AppRoutingModule } from './app-routing.module';
import { ToolbarModule } from 'primeng/toolbar';
import { ButtonModule } from 'primeng/button';
import {CalendarModule} from 'primeng/calendar';
import { TableModule } from 'primeng/table';
import { FormsModule} from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppComponent } from './app.component';
import { MainPageComponent } from './components/mainpage/mainpage.component'
import { BookComponent } from './components/book/book.component';
import { ClientComponent } from './components/client/client.component';
import { AuthorComponent } from './components/author/author.component';
import { EditorComponent } from './components/editor/editor.component';
import { EditAuthorComponent } from './components/edit-author/edit-author.component';
import { EditClientComponent } from './components/edit-client/edit-client.component';
import { EditBookComponent } from './components/edit-book/edit-book.component';
import { EditEditorComponent } from './components/edit-editor/edit-editor.component';

import { BookService } from './services/book.service'
import { AuthorService } from './services/author.service';
import { ClientService } from './services/client.service';
import { EditorService } from './services/editor.service';

@NgModule({
  	declarations: [
    	AppComponent,
    	MainPageComponent,
    	BookComponent,
    	ClientComponent,
    	AuthorComponent,
    	EditorComponent,
    	EditAuthorComponent,
    	EditClientComponent,
    	EditBookComponent,
    	EditEditorComponent
  	],
  	imports: [
   		BrowserModule,
   		HttpClientModule,
   		AppRoutingModule,
   		ToolbarModule,
   		ButtonModule,
   		TableModule,
   		CalendarModule,
   		FormsModule,
   		DialogModule,
   		BrowserAnimationsModule 
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
    	EditorService,
    	WINDOW_PROVIDERS,
    	{ provide: HTTP_INTERCEPTORS, useClass: BackEndInterceptor, multi: true },
    	
  	],
  	bootstrap: [AppComponent]
})
export class AppModule {

  
 }
