import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  
  //Diretiva NG IF
  exibirTexto: boolean = false;

  acaoNgIf(){
    this.exibirTexto = !this.exibirTexto
  }

  //Diretiva NG FOR
  cursos = ["Angular", "Java", "C#"];


//Diretiva NG Switch

curso_selecionado = "Angular";

//Diretiva NG Class

  ligada: boolean = true;
}