
public class Aritmeticos {

	public static void main(String[] args) {
		int num1, num2, num3;

		// Soma
		num1 = 10;
		num2 = 20;
		num3 = num1 + num2;
		System.out.println("O Resultado da soma �: " + num3);

		// Subtra��o
		num1 = 10;
		num2 = 20;
		num3 = num1 - num2;
		System.out.println("O Resultado da subtra��o �: " + num3);

		// Multiplica��o
		num1 = 10;
		num2 = 20;
		num3 = num1 * num2;
		System.out.println("O Resultado da multiplica��o �: " + num3);

		// Divis�o
		num1 = 10;
		num2 = 20;
		num3 = num1 / num2;
		System.out.println("O Resultado da divis�o �: " + num3);

		System.out.println("----------------");
		// Incrementando (somando de 1 em 1 )
		num1 = 1;
		while (num1 <= 10) {
			
			System.out.println(num1);
			num1++;
		}
		
		System.out.println("----------------");
		// decrementando (subtraindo de 1 em 1 )
		num1 = 11;
		while (num1 >=0) {
			
			System.out.println(num1);
			num1--;
		}
	}

}
