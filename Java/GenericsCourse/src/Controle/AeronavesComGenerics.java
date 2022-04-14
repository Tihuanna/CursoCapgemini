package Controle;

import java.util.ArrayList;
import java.util.List;

public class AeronavesComGenerics<T> {
	private List<T> listAeronaves = new ArrayList<>();
	
	public void addVoo(T nrVoo) {
		//lista aeronaves. add ("3520")
		listAeronaves.add(nrVoo);
	}
	
	public T primeiroVoo() {
		if (listAeronaves.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return listAeronaves.get(0);
	}
	
	public void listaVoos() {
		System.out.println("[ ");
		if(!listAeronaves.isEmpty()) {
			System.out.println(listAeronaves.get(0));
		}
		
		for (int i =1; i <listAeronaves.size(); i++) {
			System.out.println("" + listAeronaves.get(i));
		}
		System.out.println("] ");
	}

	public void listAeronaves() {
		// TODO Auto-generated method stub
		
	}

}
