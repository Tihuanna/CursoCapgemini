package Construtores;

public class Aluno {
	
	private double nota1;
	private double nota2;
	private double nota3;
	STATUS situacaoALuno;
	
	public Aluno(double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
		//Definindo um enumerador
	public enum STATUS{
		APROVADO,
		REPROVADO
	}
	
	//M�dia para calcular m�dia
	public double calcularMedia() {
		
	}
}
 4A