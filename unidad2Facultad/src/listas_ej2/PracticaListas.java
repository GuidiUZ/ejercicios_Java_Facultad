package listas_ej2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//Escribir un método que reciba dos listas de números enteros ordenados y devuelva una 
//tercera lista de números enteros, con todos los elementos de las listas que recibió, manteniendo el orden.
//Por ejemplo, si recibe las listas [1,3,5,6,8,9,10] y [2,4,7], debe devolver [1,2,3,4,5,6,7,8,9,10].

public class PracticaListas {

	
	public List<Integer> dosListasEnUna(List<Integer> l1, List<Integer> l2) {
		List <Integer> aux = new LinkedList<Integer>();
		
//		for (Integer cada : l1) {
//			aux.addAll(l1);
//		}
//		
//		for (Integer cada : l1) {
//			aux.addAll(l2);
//		}
		
		aux.addAll(l1);
		aux.addAll(l2);
		
		Collections.sort(aux);
		
		return aux;
	}
	
	
	public static void main(String[] args) {
		PracticaListas aux = new PracticaListas();
		
		List <Integer> l1 = new ArrayList<Integer>();
		List <Integer> l2 = new ArrayList<Integer>();
	
		l1.addAll(Arrays.asList(1,3,5,6,8,9,10));
		l2.addAll(Arrays.asList(2,4,7));
		
		List<Integer> l3 = aux.dosListasEnUna(l1, l2);
		
		System.out.println(l3);
		
	}
	
	
}
