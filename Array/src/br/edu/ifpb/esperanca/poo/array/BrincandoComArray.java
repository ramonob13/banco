package br.edu.ifpb.esperanca.poo.array;

import java.util.ArrayList;

public class BrincandoComArray {

	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		lista.add(10);
		lista.add(6.9);
		lista.add("a");
		for (int i =0; i < lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		
	}
	
}
