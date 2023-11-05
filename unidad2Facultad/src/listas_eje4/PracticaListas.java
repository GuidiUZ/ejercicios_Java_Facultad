package listas_eje4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Escriba un método que reciba una lista de enteros y la devuelva invertida. Por ejemplo, 
//si recibe la lista [1, 2, 3, 4, 5] devolverá la lista [5, 4, 3, 2, 1].

public class PracticaListas {

	List<Integer> invertirLista(List<Integer> l) {

		List<Integer> aux = new ArrayList<Integer>();
		for (int i = l.size(); i > 0; i--)
			aux.add(l.get(i - 1));
		return aux;

	}

}
