import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  //Criar variaveis
  nome : string = "Ralf";
  imagem: string ="https://turistaprofissional.com/wp-content/uploads/2015/09/roteiro-sao-paulo.jpg"
  valor1: number = 10;
  valor2: number = 20;

  //Funçao de clique 
  mensagem(){
    window.alert ("Obrigado por clicar");
  }

  //Objeto
  pessoa: any = {
    nome:"Ralf",
    idade:20,
    cidade:"São Paulo"
}
}
