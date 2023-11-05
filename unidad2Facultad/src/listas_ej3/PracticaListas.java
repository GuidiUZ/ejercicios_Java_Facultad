package listas_ej3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Escribe el método eliminarDuplicados,que recibe una lista de enteros y devuelve una nueva 
//lista con los mismos elementos pero eliminando los repetidos.Por ejemplo,si la lista 
//de entrada es:[1,2,2,1,4,2,4,3],la salida sería:[1,2,4,3].

public class PracticaListas {

	public List<Integer> eliminarDuplicados(List<Integer> l) {
		
		List <Integer> aux = new LinkedList<Integer>();
		
		
		for (Integer number : l) {
			
			if (!aux.contains(number)) {
				aux.add(number);
			}
		}
		
		return aux;
	}
	
	public static void main(String[] args) {
		
		
		
	}
	
	
}

