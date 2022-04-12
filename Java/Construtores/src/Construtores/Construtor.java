package Construtores;

import Construtores.Aluno.MATRICULA;
import Construtores.Aluno.STATUS;

public class Construtor {

	public static void main(String[] args) {
		// Passando os dados atraves do construtor

		Aluno alu = new Aluno(8, 9, 8);
		// calculando a media
		double mediaAlunoFinal = alu.calcularMedia();

		// Definindo a situação final

		if (mediaAlunoFinal < 6) {
			alu.situacaoALuno = STATUS.REPROVADO;
		} else {
			alu.situacaoALuno = STATUS.APROVADO;
		}
		// imprimindo a situação
		System.out.println("A média do aluno é: " + alu.calcularMedia() + " e o resultado é " + alu.situacaoALuno);
		
		//usa enum MATRICULA
		alu.situacaoMatricula = MATRICULA.MATRICULADO;
		System.out.println("Status da matricula é: " + alu.situacaoMatricula);
	}

}
