package a;

import java.util.LinkedList;

public class LinkedListCarros {
	public static void main(String [] args) {
		/*
		 
		 */
		LinkedList<String> cars = new LinkedList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		System.out.println(cars);
		
		//adicionando mazda no inicio
		cars.addFirst("Mazda");
		System.out.println(cars);
		
		
		//incluindo bugatti no fim
		cars.addLast("Bugatti");
		
		
		//removendo mazda
		cars.removeFirst();
		System.out.println(cars);
		
		//pega o primeiro
		System.out.println(cars.getFirst());
		System.out.println(cars);
	}

}
