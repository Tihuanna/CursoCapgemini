package padrao;

import javax.swing.JOptionPane;

public class Matrizes {

	public static void main(String[] args) {
	//Vetor dos alunos
		String [] alunos = {"Kevin", "Yasmim", "Ayla"};
		
		//Matriz das notas
		float [][] notas = new float [3][4];
		
		//Para controlar a soma das notas de cada aluno
		//Calcular a media do aluno
		
		float somaNotas, mediaAluno;
		String statusAluno;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Aluno : " +alunos[i]);
			
			//laço interno para informar as notas de cada aluno
			somaNotas = 0;
			mediaAluno = 0;
			
			for(int j=0;j < 4; j++) {
				notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota n° " + (j+1)+ " do aluno " + alunos[i]));
				somaNotas = somaNotas + notas[i][j];
			}
			mediaAluno = somaNotas /4;
			if (mediaAluno <5.5) {
				statusAluno = "Reprovado";
			}else if( mediaAluno >= 5.5 && mediaAluno <= 7.5) {
				statusAluno = "Em recuperação";
			} else {
				statusAluno = "Aprovado";
			}
			//impressão do boletim
			System.out.println("\n ********BOLETIM*********");
			System.out.println("ALuno: "+ alunos[i]);
			System.out.println("Notas");
			for (int j1 = 0; j1 <4; j1++) {
				System.out.println((j1+1) + " -  " +notas[i][j1]);
			}
			System.out.println("Média: " + mediaAluno + " " + statusAluno);
		}
		 

	}

}
