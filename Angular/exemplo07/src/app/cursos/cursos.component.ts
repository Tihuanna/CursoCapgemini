import { Component, OnInit } from '@angular/core';
import { Curso } from './curso';
import { CursosService } from './cursos.service';

@Component({
  selector: 'app-cursos',
  templateUrl: './cursos.component.html',
  styleUrls: ['./cursos.component.css']
})
export class CursosComponent implements OnInit {



  public vetorCursos!: Curso[];
  public curso!: Curso;
  public id!: number;

  //Construtor
  constructor(public servico: CursosService) { }

  //Inicialização
  ngOnInit() {
    this.id = -1;
    this.curso = new Curso("", 0, "");
    this.vetorCursos = this.servico.listar();

  }
  //Cadastrar
  cadastrar() {
    this.servico.cadastrar(this.curso);
  }
  //Excluir
  excluir(id: number) {
    this.servico.excluir(id);
    this.id=-1;
  }

  //Alterar 
  alterar(id: number) {
    this.id = id;
    this.curso = new Curso(
      this.vetorCursos[id].nomeCurso,
      this.vetorCursos[id].valorCurso,
      this.vetorCursos[id].areaCurso,
    );
  }
  //Atualizar
  atualizar() {
    this.servico.alterar(this.id, this.curso);
    this.curso = new Curso("", 0, "");
    
  }
}

