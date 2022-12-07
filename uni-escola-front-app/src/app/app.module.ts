import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { AlunosComponent } from './alunos/alunos.component';
import { RouterModule } from '@angular/router';
import { NavbarComponent } from './navbar/navbar.component';
import { ProfessorComponent } from './professor/professor.component';
import { TurmaComponent } from './turma/turma.component';
import { LeadComponent } from './lead/lead.component';
import { CursoComponent } from './curso/curso.component';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    AlunosComponent,
    NavbarComponent,
    ProfessorComponent,
    TurmaComponent,
    LeadComponent,
    CursoComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot([
      { path: '', component: HomeComponent },
      { path: 'alunos', component: AlunosComponent },
      { path: 'professor', component: ProfessorComponent },
      { path: 'curso', component: CursoComponent },
      { path: 'lead', component: LeadComponent },
      { path: 'turma', component: TurmaComponent },
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }