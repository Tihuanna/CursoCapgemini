package TrabalhandoArrays;

import javax.swing.JOptionPane;

public class Array {

	public static void main(String[] args) {
		// declarando o array
		String[] paises = new String[4];

		// declarando o array de numeros
		int[] numeros = new int[10];

		// abastecendo array paises
		for (int i = 0; i < paises.length; i++) {
			paises[i] = JOptionPane.showInputDialog("Informe um pais");
		}
		// listando o array de paises
		for (String listaPaises : paises) {
			System.out.println(listaPaises);
		}
		
		//abastecendo o array de numeros
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
		}
		for (int listaNumeros : numeros) {
			System.out.println(listaNumeros);
		}
	}

}
