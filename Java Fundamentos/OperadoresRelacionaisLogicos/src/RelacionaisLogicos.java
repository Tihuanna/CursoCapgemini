
public class RelacionaisLogicos {

	public static void main(String[] args) {
		// Operadores relacionais

		int num1, num2;
		num1 = 10;
		num2 = 9;
		
		//Igualdade
		if(num1 == num2) {
			System.out.println("O numero 1 e 2 s�o iguais ");
			
		}
		
		//Desigualdade
		else {
			System.out.println("Os numeros s�o diferentes");
		}
		
		//Testando maior
		if(num1 > num2) {
			System.out.println("O numero 1 � maior que o numero 2  ");
			
		}
		else {
			System.out.println("O numero 2 � maior ");
		}
	
		
		//Operadores l�gicos
		num1= 10;
		num2 =5;
		int num3 = 20, num4= 5;
		
		if((num1 > num3) && (num2 == num4)){
			System.out.println("Primeira op��o satisfeita");
		}
		else {
			System.out.println("Segunda op��o satisfeita");
		}
	}

}
