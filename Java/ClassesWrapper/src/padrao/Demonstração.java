package padrao;

public class Demonstração {

	public static void main(String[] args) {
		

		Boolean bolWrapped = true;
				System.out.println(bolWrapped.getClass());
		
				Character chWrapped = 'a';
				System.out.println(chWrapped.getClass());
				
				Byte byteWrapped = 1;
				System.out.println(byteWrapped.getClass());
				
				Short shoWrapped = 'B';
				System.out.println(shoWrapped.getClass());
				
				Integer intWrapped = 5215;
				System.out.println(intWrapped.getClass());
				
				Long longWrapped = 13213213L;
				System.out.println(longWrapped.getClass());
				
				Float floatWrapped = 3.143f;
				System.out.println(floatWrapped.getClass());
				
				Double doubWrapped = 3.1445;
				System.out.println(doubWrapped.getClass());
	
				int numero = Integer.parseInt("12");
				numero = numero + 1;
				System.out.println(numero);
	}

}
