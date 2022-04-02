import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {map} from 'rxjs/operators';
import { Curso } from './curso';
@Injectable({
  providedIn: 'root'
})
export class CursoService {

url = "http://localhost/api/php/"
 //Vetor
  //Vetor
  vetor:Curso[];

    //Construtor
  constructor(private http:HttpClient) { }

  //Obter todos os cursos

  obterCursos(): Observable<Curso[]>{
    return this.http.get<Curso[]>(this.url+"listar.php").pipe ( map(res => res));
    
    

  }}
