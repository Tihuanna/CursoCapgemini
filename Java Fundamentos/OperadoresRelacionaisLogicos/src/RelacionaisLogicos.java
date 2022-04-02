
public class RelacionaisLogicos {

	public static void main(String[] args) {
		// Operadores relacionais

		int num1, num2;
		num1 = 10;
		num2 = 9;
		
		//Igualdade
		if(num1 == num2) {
			System.out.println("O numero 1 e 2 são iguais ");
			
		}
		
		//Desigualdade
		else {
			System.out.println("Os numeros são diferentes");
		}
		
		//Testando maior
		if(num1 > num2) {
			System.out.println("O numero 1 é maior que o numero 2  ");
			
		}
		else {
			System.out.println("O numero 2 é maior ");
		}
	
		
		//Operadores lógicos
		num1= 10;
		num2 =5;
		int num3 = 20, num4= 5;
		
		if((num1 > num3) && (num2 == num4)){
			System.out.println("Primeira opção satisfeita");
		}
		else {
			System.out.println("Segunda opção satisfeita");
		}
	}

}
