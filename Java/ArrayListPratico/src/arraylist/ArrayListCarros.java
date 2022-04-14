package arraylist;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListCarros {
	
	public static void main(String[] args) {
		//Construindo um arraylist
		ArrayList<String> carros = new ArrayList<>();
		
		//adicionando Carros ao ArrayList
		carros.add("Kombi");
		carros.add("ZECA");
		carros.add("VRUMMMMMM");
		carros.add("Mobilete");
		carros.add("Dale");
		carros.add("Polo");
		carros.add("Fusca");
		carros.add("Ferrari");
		
		//Exibindo array
		System.out.println(carros);
		
		//substituir fusca por mitubishi
		carros.set(6, "Mitsubishi");
		//mostra o array
		System.out.println(carros);
		
		//remover zeca
		carros.remove("ZECA");
		//mostra array
		System.out.println(carros);
		
		
		//adicionando cararos com o JoptionPane
		carros.add(JOptionPane.showInputDialog("Informe a marca do carro"));
		//mostra array
		System.out.println(carros);
		
		//esvazia o array
		carros.clear();
		//mostra o array 
		System.out.println(carros);
		
		
		//verificar se o array está vaizo
		if(carros.isEmpty())
		{
			System.out.println("O vetor tá vazio");
	
		}
	}

}
