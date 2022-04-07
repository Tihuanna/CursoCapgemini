
public class ComandoCondicional {

	public static void main(String[] args) {
		// If

		int num1 = 10, num2 = 30;
		if (num1 < num2) {
			System.out.println("if com else - numero 1 é menor que o numero 2");
		} else {
			System.out.println("if com else - Numero 1 é maior que o numero 2");
		}
		//condição composta - situação num1 < num2
		
		if(num1 > num2) {
			System.out.println("Condição composta 1 - Numero 1 maior que o 2");
		}else if(num1 < num2) {
			System.out.println("Condição composta 1 - Numero 1 menor que o num 2");
		}else {
			System.out.println("Condição composta 1 - Numero 1 igual ao numero 2");
		}
		//condição composta - situação num1 = num2
		
		num1=10;
		num2 = 10;
		
				if(num1 > num2) {
					System.out.println("Condição composta 2 - Numero 1 maior que o numero 2");
				}else if(num1 < num2) {
					System.out.println("Condição composta 2 - Numero 1 menor que o numero 2");
				}else {
					System.out.println("Condição composta 2 - Numero 1 igual ao numero 2");
				}
				
				//cOMANDO CONDICIONAL SWITCH
				char opcao = '1';
				switch (opcao) {
				case 1 :{
					System.out.println("Chame programa de inclusão");
				break;
				}
				case 2 :{
					System.out.println("Chame programa de inclusão");
				break;
				}
				case 3 :{
					System.out.println("Chame programa de inclusão");
				break;
				}
				default: 
					throw new IllegalArgumentException("Opção invalida: "+ opcao+ "Redigite")
				}
	}
}
