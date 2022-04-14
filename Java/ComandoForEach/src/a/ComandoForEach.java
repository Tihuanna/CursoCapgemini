package a;

public class ComandoForEach {

	public static void main(String[] args) {
		
		int[] vetorNumeros = new int[] {1,2,3,4,5,6};

		//varrendo o vetor sem o uso do For Each
		
		System.out.println("Varrendo sem o For Each");
		for(int i=0; i< vetorNumeros.length; i++) {
			System.out.println("Numero: "+vetorNumeros[i]);
		}
		
		//Varrendo com o For Each
		System.out.println("Varrendo com o For Each");
		for (int listaNumeros : vetorNumeros) {
			
			System.out.println("Numero: " + listaNumeros);
		}
	}

}
