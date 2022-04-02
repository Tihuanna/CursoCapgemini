import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Curso } from './curso';
import { CursoService } from './curso.service';

@Component({
  selector: 'app-curso',
  templateUrl: './curso.component.html',
  styleUrls: ['./curso.component.css']
})
export class CursoComponent implements OnInit {
  
  //Vetor
  vetor:Curso[];

  //Construtor
  constructor(private curso_servico : CursoService) { }
  //Inicializador
  ngOnInit() {
      //Ao iniciar os sistema devera listar os cursos
      this.selecao
  }
  //Seleção
  selecao() {
    this.curso_servico.obterCursos().subscribe(
      (res: Curso[]) => {
        this.vetor = res;
      }
    ) }
  //Cadastrar
  cadastrar() {
    alert("Cadastrado com sucesso!");
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
