import { Injectable } from '@angular/core';
import { Curso } from './curso';

//Acesso total do serviço
@Injectable({
  providedIn: 'root'
})

//Classe
export class CursosService {

  //Construtor 
  constructor() { }

//Vetor de cursos
public vetorCursos:Curso[] = [
  new Curso("Angular", 800, "Desenvolvimento"),
  new Curso("Java", 1000, "Desenvolvimento"),
  new Curso("C#", 1500, "Desenvolvimento"),
];
//Cadastro de cursos
public cadastrar(curso:Curso){
  this.vetorCursos.push(curso);

}
//Seleção de cursos
public listar(){
  return this.vetorCursos;
}

//Alteração de cursos
public alterar(id:number, curso:Curso){
  this.vetorCursos[id] = curso;
}

//Exclusão de curso
public excluir(id:number){
  this.vetorCursos.splice(id, 1);
}
}
