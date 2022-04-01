import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-curso',
  templateUrl: './curso.component.html',
  styleUrls: ['./curso.component.css']
})
export class CursoComponent implements OnInit {

//URL Base
  url = "http://localhost/api/php/";
  
  //Vetor de cursos
  vetor:Curso[];

  //Construtor
  constructor(private http:HttpClient) { }
  //Inicializador
  ngOnInit() {

  }

  //Cadastrar
  cadastrar() {
    alert("Cadastrado com sucesso!");
  }
  //Seleção
  selecao() {
    alert("Selecionado com sucesso!");
  }
  //alterar
  alterar() {
    alert("Alterado com sucesso!");
  }

  //Excluir
  excluir() {
    alert("Excluido com sucesso!");
  }

}
